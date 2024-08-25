package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_elegirAlg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_elegir_alg)

        val BotonHome=findViewById<ImageButton>(R.id.ibtnHomeelA)
        val BotonInfo=findViewById<ImageButton>(R.id.ibtnInfoelA)
        val Botonimg3x3=findViewById<ImageButton>(R.id.ibtn3X3Alg)
        val Boton3x3=findViewById<Button>(R.id.btn3x3Alg)
        val Botonimg2x2=findViewById<ImageButton>(R.id.ibtn2x2Alg)
        val Boton2x2=findViewById<Button>(R.id.btn2x2Alg)

        BotonHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        BotonInfo.setOnClickListener {
            val intent = Intent(this, activity_acerca_de::class.java)
            startActivity(intent)
        }
        Botonimg3x3.setOnClickListener {
            val intent = Intent(this, metodos3x3::class.java)
            startActivity(intent)
        }
        Boton3x3.setOnClickListener {
            val intent = Intent(this, metodos3x3::class.java)
            startActivity(intent)
        }
        Botonimg2x2.setOnClickListener {
            val intent = Intent(this, activity_metodos2x2::class.java)
            startActivity(intent)
        }
        Boton2x2.setOnClickListener {
            val intent = Intent(this, activity_metodos2x2::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtNotaR)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}