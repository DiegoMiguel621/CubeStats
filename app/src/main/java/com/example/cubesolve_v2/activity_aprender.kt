package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_aprender : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_aprender)

        val BotonHome=findViewById<ImageButton>(R.id.ibtnHomeAP)
        val botonAcerca=findViewById<ImageButton>(R.id.ibtnInfoAP)
        val boton2x2=findViewById<Button>(R.id.btn2x2Ap)
        val imgboton2x2=findViewById<ImageButton>(R.id.ibtn2x2)
        val boton3x3=findViewById<Button>(R.id.btn3x3Ap)
        val imgboton3x3=findViewById<ImageButton>(R.id.ibtn3x3Ap)

        BotonHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        botonAcerca.setOnClickListener {
            val intent = Intent(this,activity_acerca_de::class.java)
            startActivity(intent)
        }
        boton2x2.setOnClickListener {
            val intent = Intent(this, menu2x2::class.java)
            startActivity(intent)
        }
        imgboton2x2.setOnClickListener {
            val intent = Intent(this, menu2x2::class.java)
            startActivity(intent)
        }
        boton3x3.setOnClickListener {
            val intent = Intent(this, menu3x3::class.java)
            startActivity(intent)
        }
        imgboton3x3.setOnClickListener {
            val intent = Intent(this, menu3x3::class.java)
            startActivity(intent)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtNotaR)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}