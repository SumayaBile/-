package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val textres = findViewById<TextView>(R.id.textres)
        val opthions = arrayOf("حدائق القبة "," مدينة نصر ","مصر الجديدة  ","الدقي")
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,opthions)

   spinner.adapter=arrayAdapter
        spinner.onItemSelectedListener= object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                textres.text = "you selected :${opthions.get(p2).toString()}"
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
               textres.text="رجاءا اختار منطقة "
            }

        }

        var se = findViewById<Button>(R.id.se)
        se.setOnClickListener {

            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)


        }




    }
}