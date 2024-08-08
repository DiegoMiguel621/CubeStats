package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class menu3x3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu3x3)

        val BotonHome=findViewById<ImageButton>(R.id.ibtnHomeME3)
        val botonAcerca=findViewById<ImageButton>(R.id.ibtnInfoME3)
        val botonResolver3=findViewById<Button>(R.id.btnres3)
        val botonNota3x3=findViewById<Button>(R.id.btnnota3)
        val ibotonNota3x3=findViewById<ImageButton>(R.id.ibtnnota3)


        BotonHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        botonAcerca.setOnClickListener {
            val intent = Intent(this,activity_acerca_de::class.java)
            startActivity(intent)
        }
        botonResolver3.setOnClickListener {
            val intent = Intent(this,activity_pasos_3x3::class.java)
            startActivity(intent)
        }
        botonNota3x3.setOnClickListener {
            val intent = Intent(this, activity_nota3x3::class.java)
            startActivity(intent)
        }
        ibotonNota3x3.setOnClickListener {
            val intent = Intent(this, activity_nota3x3::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtNotaR)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}