package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_pbl2x2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pbl2x2)

        val BotonHomePBL = findViewById<ImageButton>(R.id.ibtnHomePBL)
        val BotonInfoPBL = findViewById<ImageButton>(R.id.ibtnInfoPBL)
        val pbl1 = findViewById<ImageButton>(R.id.pbl1)
        val pbl2 = findViewById<ImageButton>(R.id.pbl2)
        val pbl3 = findViewById<ImageButton>(R.id.pbl3)
        val pbl4 = findViewById<ImageButton>(R.id.pbl4)
        val pbl5 = findViewById<ImageButton>(R.id.pbl5)

        BotonHomePBL.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        BotonInfoPBL.setOnClickListener {
            val intent = Intent(this, activity_acerca_de::class.java)
            startActivity(intent)
        }
        pbl1.setOnClickListener {
            val message = "_y R U R' F' R U R' U' R' F R2 U' R'\n" +
                    "_y R U2 R' U' R U2 L' U R' U' L\n" +
                    "_y2 R' F R' F2 R U' R' F2 R2"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        pbl2.setOnClickListener {
            val message = "_R U' R' U' F2 U' R U R' D R2\n" +
                    "_R U' R' U' F2 U' R U R' U F2\n" +
                    "_x2 R U' R' U' F2 U' R U R' D F2 R2"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        pbl3.setOnClickListener {
            val message = "_R2 B2 R2\n" +
                    "_x R2 U2 R2\n" +
                    "_R2 F2 R2"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        pbl4.setOnClickListener {
            val message = "_y2 R2 U' R2 U2 y R2 U' R2\n" +
                    "_y2 R2 U' R2 U2 F2 U' R2\n" +
                    "_R2 U R2 U2 y' R2 U R2"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        pbl5.setOnClickListener {
            val message = "_y2 R' U R' F2 R F' R\n" +
                    "_Z2 L D' L F2 L' D L'\n" +
                    "_R' F R' F2 R U' R"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}