package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class record2x2 : AppCompatActivity() {

    private lateinit var dbHelper: DatabaseHelper
    private lateinit var txt2x2PB: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_record2x2)

        dbHelper = DatabaseHelper(this)
        txt2x2PB = findViewById(R.id.txt2x2PB)

        val btnFHomeRe: FloatingActionButton = findViewById(R.id.btnFHomeRe2)
        btnFHomeRe.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnFAddRe2: FloatingActionButton = findViewById(R.id.btnFAddRe2)
        btnFAddRe2.setOnClickListener {
            showAddRecordDialog()
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
//intento6
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
