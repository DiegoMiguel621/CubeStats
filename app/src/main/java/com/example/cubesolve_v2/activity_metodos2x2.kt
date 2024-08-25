package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_metodos2x2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_metodos2x2)

        val BotonHome=findViewById<ImageButton>(R.id.ibtnHome2alg)
        val BotonInfo=findViewById<ImageButton>(R.id.ibtnInfo2alg)
        val ibtnOll2=findViewById<ImageButton>(R.id.ibtnOll2)
        val btnOll2=findViewById<Button>(R.id.btnOll2)
        val ibtnPbl2=findViewById<ImageButton>(R.id.ibtnPbl2)
        val btnPbl2=findViewById<Button>(R.id.btnPbl2)

        BotonHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        BotonInfo.setOnClickListener {
            val intent = Intent(this, activity_acerca_de::class.java)
            startActivity(intent)
        }
        ibtnOll2.setOnClickListener {
            val intent = Intent(this, activity_oll2x2::class.java)
            startActivity(intent)
        }
        btnOll2.setOnClickListener {
            val intent = Intent(this, activity_oll2x2::class.java)
            startActivity(intent)
        }
        ibtnPbl2.setOnClickListener {
            val intent = Intent(this, activity_pbl2x2::class.java)
            startActivity(intent)
        }
        btnPbl2.setOnClickListener {
            val intent = Intent(this, activity_pbl2x2::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}