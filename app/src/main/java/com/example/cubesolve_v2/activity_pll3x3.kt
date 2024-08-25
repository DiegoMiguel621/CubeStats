package com.example.cubesolve_v2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_pll3x3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pll3x3)

        val BotonHomePll3=findViewById<ImageButton>(R.id.ibtnHomePll3)
        val BotonInfoPll3=findViewById<ImageButton>(R.id.ibtnInfoPll3)
        val pllh=findViewById<ImageButton>(R.id.pllh)
        val pllna2=findViewById<ImageButton>(R.id.pllna)
        val pllt=findViewById<ImageButton>(R.id.pllt)
        val pllua=findViewById<ImageButton>(R.id.pllua)
        val pllub=findViewById<ImageButton>(R.id.pllub)
        val pllz=findViewById<ImageButton>(R.id.pllz)


        BotonHomePll3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        BotonInfoPll3.setOnClickListener {
            val intent = Intent(this, activity_acerca_de::class.java)
            startActivity(intent)
        }
        pllh.setOnClickListener {
            val message = "_M2 U M2 U2 M2 U M2\n" +
                    "_R2 U2 R U2 R2 U2 R2 U2 R U2 R2\n" +
                    "_M2 U' M2 U2 M2 U' M2"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        pllna2.setOnClickListener {
            val message = "_z U R' D R2 U' R D' U R' D R2 U' R D' z'\n" +
                    "_R U R' U R U R' F' R U R' U' R' F R2 U' R' U2 R U' R'\n" +
                    "_L U' R U2 L' U R' L U' R U2 L' U R'"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        pllt.setOnClickListener {
            val message = "_R U R' U' R' F R2 U' R' U F' L' U L U2\n" +
                    "_R2 U R2 U' R2 U' D R2 U' R2 U R2 D'\n" +
                    "_y2 L' U' L U L F' L2 U L U L' U' L F"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        pllua.setOnClickListener {
            val message = "_y2 R U' R U R U R U' R' U' R2\n"+
                    "_y2 M2 U M U2 M' U M2\n" +
                    "_M2 U M' U2 M U M2"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        pllub.setOnClickListener {
            val message = "_y2 R2 U R U R' U' R' U' R' U R'\n" +
                    "_y2 M2 U' M U2 M' U' M2\n" +
                    "_M2 U' M' U2 M U' M2"

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Algunos otros algoritmos son:")
            builder.setMessage(message)
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        pllz.setOnClickListener {
            val message = "_M2 U M2 U M' U2 M2 U2 M' U2\n" +
                    "_y M2 U' M2 U' M' U2 M2 U2 M'\n" +
                    "_y R' U' R U' R U R U' R' U R U R2 U' R'"

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