package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_oesq3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_oesq3)

        val BotonHome=findViewById<ImageButton>(R.id.ibtnHomeoe3)
        val BotonInfo=findViewById<ImageButton>(R.id.ibtnInfooe3)

        BotonHome.setOnClickListener {
            val intent = Intent(this, activity_oesq3::class.java)
            startActivity(intent)
        }
        BotonInfo.setOnClickListener {
            val intent = Intent(this, activity_oesq3::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtNotaR)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}