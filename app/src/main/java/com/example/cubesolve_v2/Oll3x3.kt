package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Oll3x3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_oll3x3)

        val BotonHomeOll3=findViewById<ImageButton>(R.id.ibtnHomeOll3)
        val BotonInfoOll3=findViewById<ImageButton>(R.id.ibtnInfoOll3)
        val oll21=findViewById<ImageButton>(R.id.oll21)
        val oll22=findViewById<ImageButton>(R.id.oll22)
        val oll23=findViewById<ImageButton>(R.id.oll23)
        val oll24=findViewById<ImageButton>(R.id.oll24)
        val oll25=findViewById<ImageButton>(R.id.oll25)
        val oll26=findViewById<ImageButton>(R.id.oll26)
        val oll27=findViewById<ImageButton>(R.id.oll27)

        BotonHomeOll3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        BotonInfoOll3.setOnClickListener {
            val intent = Intent(this, activity_acerca_de::class.java)
            startActivity(intent)
        }
        oll21.setOnClickListener {
            val message = "_R U R' U R U' R' U R U2 R'\n" +
                    "_R' U' R U' R' U R U' R' U2 R\n" +
                    "_y R U2 R' U' R U R' U' R U' R'"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        oll22.setOnClickListener {
            val message = "_f R U R' U' f' F R U R' U' F'\n" +
                    "_R' U2 R2 U R2 U R2 U2 R'\n" +
                    "_f R U R' U' S' R U R' U' F'"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        oll23.setOnClickListener {
            val message = "_y2 R2 D' R U2 R' D R U2 R\n" +
                    "_y R U R' U' R U' R' U2 R U' R' U2 R U R'\n" +
                    "_R U R' U R U2 R2 U' R U' R' U2 R"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        oll24.setOnClickListener {
            val message = "_y2 l' U' L U R U' r' F\n" +
                    "_y' x' R U R' D R U' R' D' x\n" +
                    "_L F R' F' L' F R F'"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        oll25.setOnClickListener {
            val message = "_R' F R B' R' F' R B\n" +
                    "_F R' F' r U R U' r'\n" +
                    "_y' x' R U' R' D R U R' D' x"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        oll26.setOnClickListener {
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

        oll27.setOnClickListener {
            val message = "_y' R' U2 R U R' U R\n" +
                    "_y L' U2 L U L' U L\n" +
                    "_y2 L U L' U L U2 L'"

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