package com.example.cubesolve_v2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_ccon3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ccon3)

        val BotonHome=findViewById<ImageButton>(R.id.ibtnHomecc3)
        val BotonInfo=findViewById<ImageButton>(R.id.ibtnInfocc3)
        val videoView1: VideoView = findViewById(R.id.videoCCon)
        val playButton1: ImageButton = findViewById(R.id.ibtnPunto)
        val playButton2: ImageButton = findViewById(R.id.ibtnEle)
        val playButton3: ImageButton = findViewById(R.id.ibtnLinea)
        val videoPath1 = "android.resource://" + packageName + "/" + R.raw.ccpl3v
        val videoPath2 = "android.resource://" + packageName + "/" + R.raw.ccll3v
        val videoPath3 = "android.resource://" + packageName + "/" + R.raw.cclc3v

        playButton1.setOnClickListener {
            val uri: Uri = Uri.parse(videoPath1)
            videoView1.setVideoURI(uri)
            videoView1.start()
        }
        playButton2.setOnClickListener {
            val uri: Uri = Uri.parse(videoPath2)
            videoView1.setVideoURI(uri)
            videoView1.start()
        }
        playButton3.setOnClickListener {
            val uri: Uri = Uri.parse(videoPath3)
            videoView1.setVideoURI(uri)
            videoView1.start()
        }

        BotonHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        BotonInfo.setOnClickListener {
            val intent = Intent(this, activity_acerca_de::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtNotaR)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}