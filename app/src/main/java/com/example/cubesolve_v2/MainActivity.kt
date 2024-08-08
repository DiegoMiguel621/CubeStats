package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContentView(R.layout.activity_main)

        val botonAcerca=findViewById<ImageButton>(R.id.ibtnInfo)
        val botonAprender=findViewById<Button>(R.id.btnAprender)
        val botonRecords=findViewById<Button>(R.id.btn_records)
        val botonAlg=findViewById<Button>(R.id.btnRevisarAlg)



        botonAcerca.setOnClickListener {
            val intent = Intent(this,activity_acerca_de::class.java)
            startActivity(intent)
        }
        botonAprender.setOnClickListener {
            val intent = Intent(this, activity_aprender::class.java)
            startActivity(intent)
        }
        botonRecords.setOnClickListener {
            val intent = Intent(this, records_menu::class.java)
            startActivity(intent)
        }
        botonAlg.setOnClickListener {
            val intent = Intent(this, activity_elegirAlg::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtNotaR)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}