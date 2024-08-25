package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_oll2x2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_oll2x2)

        val BotonHomeOll2=findViewById<ImageButton>(R.id.ibtnHomeOll2)
        val BotonInfoOll2=findViewById<ImageButton>(R.id.ibtnInfoOll2)
        val orll1=findViewById<ImageButton>(R.id.orll1)
        val orll2=findViewById<ImageButton>(R.id.orll2)
        val orll3=findViewById<ImageButton>(R.id.orll3)
        val orll4=findViewById<ImageButton>(R.id.orll4)
        val orll5=findViewById<ImageButton>(R.id.orll5)
        val orll6=findViewById<ImageButton>(R.id.orll6)
        val orll7=findViewById<ImageButton>(R.id.orll7)

        BotonHomeOll2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        BotonInfoOll2.setOnClickListener {
            val intent = Intent(this, activity_acerca_de::class.java)
            startActivity(intent)
        }
        orll1.setOnClickListener {
            val message = "_y' R' U2 R U R' U R\n" +
                    "_y2 L U L' U L U2 L'\n" +
                    "_y L' U2 L U L' U L"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        orll2.setOnClickListener {
            val message = "_R' U' R U' R' U2 R\n" +
                    "_y2 L' U' L U' L' U2 L\n" +
                    "_y2 L' U R U' L U R'"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        orll3.setOnClickListener {
            val message = "_R U2 R2 U' R2 U' R2 U2 R\n" +
                    "_y' R' F R2 U' R2 F R\n" +
                    "_y2 F U R U' R' U R U' R' F'"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        orll4.setOnClickListener {
            val message = "_y2 F U R U' R' F'\n" +
                    "_y2 F' L' U' L U F"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        orll5.setOnClickListener {
            val message = "_y F' R U R' U' R' F R\n" +
                    "_F R' F' R U R U' R'\n" +
                    "_y2 R U2 R' U' R U R' U' R U R' U' R U' R'"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        orll6.setOnClickListener {
            val message = "_y2 L' U' L U L F' L' F\n" +
                    "_y2 R' F' R U R U' R' F\n" +
                    "_R U R' F2 R U R' U' F"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        orll7.setOnClickListener {
            val message = "_R2 U2 R U2 R2\n" +
                    "_F R U R' U' R U R' U' R U R' U' F'\n" +
                    "_R U2 R' U' R U R' U' R U' R'"

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