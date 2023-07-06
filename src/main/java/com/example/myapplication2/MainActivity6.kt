package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        var imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setOnClickListener {

            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)


        }



    }
}