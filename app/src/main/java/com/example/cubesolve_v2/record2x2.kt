package com.example.cubesolve_v2

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.text.InputType
import java.io.File
import java.io.FileOutputStream

class record2x2 : AppCompatActivity() {

    private lateinit var dbHelper: DatabaseHelper
    private lateinit var txt2x2PB: TextView
    private lateinit var img2x2: ImageView

    private val REQUEST_IMAGE_CAPTURE = 1
    private val IMAGE_FILENAME = "cubo_2x2.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_record2x2)

        dbHelper = DatabaseHelper(this)
        txt2x2PB = findViewById(R.id.txt2x2PB)
        img2x2 = findViewById(R.id.img2x2)

        val btnFHomeRe: FloatingActionButton = findViewById(R.id.btnFHomeRe2)
        btnFHomeRe.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnFAddRe2: FloatingActionButton = findViewById(R.id.btnFAddRe2)
        btnFAddRe2.setOnClickListener {
            showAddRecordDialog()
        }

        val btnFImg2: FloatingActionButton = findViewById(R.id.btnFImg2)
        btnFImg2.setOnClickListener {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), REQUEST_IMAGE_CAPTURE)
            } else {
                openCamera()
            }
        }

        val btnReturn: FloatingActionButton = findViewById(R.id.btnreturn)
        btnReturn.setOnClickListener {
            resetImageToDefault()
        }

        val btnEditar: Button = findViewById(R.id.btn_editar)
        btnEditar.setOnClickListener {
            showEditRecordDialog()
        }

        val btnEliminar: Button = findViewById(R.id.btn_eliminar)
        btnEliminar.setOnClickListener {
            showDeleteConfirmDialog()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        loadRecord()
        loadImageFromInternalStorage()
    }

    private fun openCamera() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (takePictureIntent.resolveActivity(packageManager) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            img2x2.setImageBitmap(imageBitmap) // Establece la imagen capturada en el ImageView
            saveImageToInternalStorage(imageBitmap) // Guarda la imagen en el almacenamiento interno
        }
    }

    private fun saveImageToInternalStorage(bitmap: Bitmap) {
        val file = File(filesDir, IMAGE_FILENAME)
        FileOutputStream(file).use { fos ->
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos)
        }
    }

    private fun loadImageFromInternalStorage() {
        val file = File(filesDir, IMAGE_FILENAME)
        if (file.exists()) {
            val bitmap = BitmapFactory.decodeFile(file.absolutePath)
            img2x2.setImageBitmap(bitmap)
        } else {
            // Si no existe una imagen guardada, mostrar la imagen predeterminada
            img2x2.setImageResource(R.drawable.main2x2)
        }
    }

    private fun resetImageToDefault() {
        // Restablecer la imagen a la predeterminada
        img2x2.setImageResource(R.drawable.main2x2)

        // Eliminar la imagen guardada en el almacenamiento interno
        val file = File(filesDir, IMAGE_FILENAME)
        if (file.exists()) {
            file.delete()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_IMAGE_CAPTURE && grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            openCamera()
        } else {
            Toast.makeText(this, "Permiso para usar la cámara denegado", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loadRecord() {
        val record = dbHelper.getRecord()
        if (record != null) {
            txt2x2PB.text = record
        } else {
            txt2x2PB.text = ""
        }
    }

    private fun showAddRecordDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Agregar Registro")

        val input = EditText(this)
        input.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(input)

        builder.setPositiveButton("Guardar") { dialog, _ ->
            val record = input.text.toString()
            if (record.isNotEmpty()) {
                dbHelper.addRecord(record)
                loadRecord()
                Toast.makeText(this, "Registro agregado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "El campo no puede estar vacío", Toast.LENGTH_SHORT).show()
            }
            dialog.dismiss()
        }
        builder.setNegativeButton("Cancelar") { dialog, _ -> dialog.cancel() }

        builder.show()
    }

    private fun showEditRecordDialog() {
        val lastId = dbHelper.getLastRecordId()
        if (lastId == null) {
            Toast.makeText(this, "No hay registro para editar", Toast.LENGTH_SHORT).show()
            return
        }

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Editar Registro")

        val input = EditText(this)
        input.inputType = InputType.TYPE_CLASS_TEXT
        input.setText(txt2x2PB.text)
        builder.setView(input)

        builder.setPositiveButton("Guardar") { dialog, _ ->
            val record = input.text.toString()
            if (record.isNotEmpty()) {
                dbHelper.updateRecord(lastId, record)
                loadRecord()
                Toast.makeText(this, "Registro actualizado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "El campo no puede estar vacío", Toast.LENGTH_SHORT).show()
            }
            dialog.dismiss()
        }
        builder.setNegativeButton("Cancelar") { dialog, _ -> dialog.cancel() }

        builder.show()
    }

    private fun showDeleteConfirmDialog() {
        val lastId = dbHelper.getLastRecordId()
        if (lastId == null) {
            Toast.makeText(this, "No hay registro para eliminar", Toast.LENGTH_SHORT).show()
            return
        }

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Eliminar Registro")
        builder.setMessage("¿Estás seguro de que deseas eliminar el registro?")

        builder.setPositiveButton("Eliminar") { dialog, _ ->
            dbHelper.deleteRecord(lastId)
            loadRecord()
            Toast.makeText(this, "Registro eliminado", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        builder.setNegativeButton("Cancelar") { dialog, _ -> dialog.cancel() }

        builder.show()
    }
}
