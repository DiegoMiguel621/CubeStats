package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class records_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_records_menu)

        val btnFHomeRe: FloatingActionButton = findViewById(R.id.btnFHomeRe)
        val boton2x2=findViewById<Button>(R.id.btn2x2Re)
        val imgboton2x2=findViewById<ImageButton>(R.id.ibtn2x2Re)



        btnFHomeRe.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        boton2x2.setOnClickListener {
            val intent = Intent(this, record2x2::class.java)
            startActivity(intent)
        }
        imgboton2x2.setOnClickListener {
            val intent = Intent(this, record2x2::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}