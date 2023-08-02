package com.example.loginpage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var name:EditText
    private lateinit var pwd:EditText
    private lateinit var login:Button
    private lateinit var signup: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.login_btn)
        signup = findViewById(R.id.sign_up)

    signup.setOnClickListener {
        Toast.makeText(this, "Signup clicked", Toast.LENGTH_SHORT).show()
    }

        login.setOnClickListener {
            name = findViewById(R.id.name_et)
            pwd = findViewById(R.id.pwd_et)
            val name = name.text.toString()
            val pwd = pwd.text.toString()

            if(name.isNotEmpty() && pwd.isNotEmpty())
            {
                val bundle = Bundle()
                bundle.putString("name of person", name)

                val intent = Intent(this@MainActivity, MainActivity2::class.java )

                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}