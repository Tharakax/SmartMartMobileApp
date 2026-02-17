package com.example.lankasmartmart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sign_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)

        val btnLogin = findViewById<android.widget.Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent = android.content.Intent(this, Home1::class.java)
            startActivity(intent)
        }

        val tvSignUp = findViewById<android.widget.TextView>(R.id.tvSignUp)
        tvSignUp.setOnClickListener {
            val intent = android.content.Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }
}