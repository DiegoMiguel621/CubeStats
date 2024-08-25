package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class metodos3x3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_metodos3x3)

        val BotonHome3alg=findViewById<ImageButton>(R.id.ibtnHome3alg)
        val BotonInfo3alg=findViewById<ImageButton>(R.id.ibtnInfo3alg)
        val ibtnOll3=findViewById<ImageButton>(R.id.ibtnOll3)
        val btnOll3=findViewById<Button>(R.id.btnOll3)
        val ibtnPll3=findViewById<ImageButton>(R.id.ibtnPll3)
        val btnPll3=findViewById<Button>(R.id.btnPll3)

        BotonHome3alg.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        BotonInfo3alg.setOnClickListener {
            val intent = Intent(this, activity_acerca_de::class.java)
            startActivity(intent)
        }
        ibtnOll3.setOnClickListener {
            val intent = Intent(this, Oll3x3::class.java)
            startActivity(intent)
        }
        btnOll3.setOnClickListener {
            val intent = Intent(this, Oll3x3::class.java)
            startActivity(intent)
        }
        ibtnPll3.setOnClickListener {
            val intent = Intent(this, activity_pll3x3::class.java)
            startActivity(intent)
        }
        btnPll3.setOnClickListener {
            val intent = Intent(this, activity_pll3x3::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}