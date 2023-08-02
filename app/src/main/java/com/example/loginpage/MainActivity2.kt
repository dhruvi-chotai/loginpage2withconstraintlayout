package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var tv3: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tv3 = findViewById(R.id.tv3)

        val bundle = intent.extras
        tv3.text = bundle!!.getString("name of person")


    }
}