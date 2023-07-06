package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var text_v = findViewById<TextView>(R.id.text_v)
        text_v.setOnClickListener {

            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)


        }

    }
}