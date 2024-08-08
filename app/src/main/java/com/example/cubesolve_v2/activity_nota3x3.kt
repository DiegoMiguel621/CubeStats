package com.example.cubesolve_v2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_nota3x3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nota3x3)

        val BotonHome=findViewById<ImageButton>(R.id.ibtnHomen3)
        val BotonInfo=findViewById<ImageButton>(R.id.ibtnInfon3)
        val videoView1: VideoView = findViewById(R.id.videoNotaLR)
        val videoView2: VideoView = findViewById(R.id.videoNotaFB)
        val videoView3: VideoView = findViewById(R.id.videoNotaUD)
        val playButton1: ImageButton = findViewById(R.id.ibtnNotaR3)
        val playButton2: ImageButton = findViewById(R.id.ibtnNotaL3)
        val playButton3: ImageButton = findViewById(R.id.ibtnNotaF3)
        val playButton4: ImageButton = findViewById(R.id.ibtnNotaB3)
        val playButton5: ImageButton = findViewById(R.id.ibtnNotaU3)
        val playButton6: ImageButton = findViewById(R.id.ibtnNotaD3)

        val videoPath1 = "android.resource://" + packageName + "/" + R.raw.notar
        val videoPath2 = "android.resource://" + packageName + "/" + R.raw.notal
        val videoPath3 = "android.resource://" + packageName + "/" + R.raw.notaf
        val videoPath4 = "android.resource://" + packageName + "/" + R.raw.notab
        val videoPath5 = "android.resource://" + packageName + "/" + R.raw.notau
        val videoPath6 = "android.resource://" + packageName + "/" + R.raw.notad

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
            videoView2.setVideoURI(uri)
            videoView2.start()
        }
        playButton4.setOnClickListener {
            val uri: Uri = Uri.parse(videoPath4)
            videoView2.setVideoURI(uri)
            videoView2.start()
        }
        playButton5.setOnClickListener {
            val uri: Uri = Uri.parse(videoPath5)
            videoView3.setVideoURI(uri)
            videoView3.start()
        }
        playButton6.setOnClickListener {
            val uri: Uri = Uri.parse(videoPath6)
            videoView3.setVideoURI(uri)
            videoView3.start()
        }

        BotonHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        BotonInfo.setOnClickListener {
            val intent = Intent(this, activity_acerca_de::class.java)
            startActivity(intent)
        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}