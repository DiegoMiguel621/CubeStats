package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_pasos_3x3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pasos3x3)

        val BotonHome=findViewById<ImageButton>(R.id.ibtnHomep3)
        val botonAcerca=findViewById<ImageButton>(R.id.ibtnInfop3)

        val botonPC3=findViewById<Button>(R.id.btnPC3)
        val ibotonPC3=findViewById<ImageButton>(R.id.ibtnPC3)
        val botonE3=findViewById<Button>(R.id.btnE3)
        val ibotonE3=findViewById<ImageButton>(R.id.ibtnE3)
        val botonCM3=findViewById<Button>(R.id.btnCM3)
        val ibotonCM3=findViewById<ImageButton>(R.id.ibtnCM3)
        val botonCC3=findViewById<Button>(R.id.btnCC3)
        val ibotonCC3=findViewById<ImageButton>(R.id.ibtnCC3)
        val botonAC3=findViewById<Button>(R.id.btnAC3)
        val ibotonAC3=findViewById<ImageButton>(R.id.ibtnAC3)
        val botonAE3=findViewById<Button>(R.id.btnAE3)
        val ibotonAE3=findViewById<ImageButton>(R.id.ibtnAE3)
        val botonOE3=findViewById<Button>(R.id.btnOE3)
        val ibotonOE3=findViewById<ImageButton>(R.id.ibtnOE3)

        BotonHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        botonAcerca.setOnClickListener {
            val intent = Intent(this,activity_acerca_de::class.java)
            startActivity(intent)
        }

        botonPC3.setOnClickListener {
            val intent = Intent(this,activity_primcruz3::class.java)
            startActivity(intent)
        }
        ibotonPC3.setOnClickListener {
            val intent = Intent(this,activity_primcruz3::class.java)
            startActivity(intent)
        }
        botonE3.setOnClickListener {
            val intent = Intent(this,activity_esquinas3::class.java)
            startActivity(intent)
        }
        ibotonE3.setOnClickListener {
            val intent = Intent(this,activity_esquinas3::class.java)
            startActivity(intent)
        }
        botonCM3.setOnClickListener {
            val intent = Intent(this,activity_camed3::class.java)
            startActivity(intent)
        }
        ibotonCM3.setOnClickListener {
            val intent = Intent(this,activity_camed3::class.java)
            startActivity(intent)
        }
        botonCC3.setOnClickListener {
            val intent = Intent(this,activity_ccon3::class.java)
            startActivity(intent)
        }
        ibotonCC3.setOnClickListener {
            val intent = Intent(this,activity_ccon3::class.java)
            startActivity(intent)
        }
        botonAC3.setOnClickListener {
            val intent = Intent(this,activity_acruz3::class.java)
            startActivity(intent)
        }
        ibotonAC3.setOnClickListener {
            val intent = Intent(this,activity_acruz3::class.java)
            startActivity(intent)
        }
        botonAE3.setOnClickListener {
            val intent = Intent(this,activity_aesq3::class.java)
            startActivity(intent)
        }
        ibotonAE3.setOnClickListener {
            val intent = Intent(this,activity_aesq3::class.java)
            startActivity(intent)
        }
        botonOE3.setOnClickListener {
            val intent = Intent(this,activity_oesq3::class.java)
            startActivity(intent)
        }
        ibotonOE3.setOnClickListener {
            val intent = Intent(this,activity_oesq3::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtNotaR)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}