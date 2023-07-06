package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var imageview2 = findViewById<ImageView>(R.id.imageView2)
        imageview2.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        var search = findViewById<ImageView>(R.id.search)
        search.setOnClickListener {

            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)


        }


        var imagevv = findViewById<ImageView>(R.id.imagevv)
        imagevv.setOnClickListener {

            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)


        }


    }
}