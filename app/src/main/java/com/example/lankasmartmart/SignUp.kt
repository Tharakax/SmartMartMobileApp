package com.example.lankasmartmart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        val haveAccount = findViewById<android.widget.TextView>(R.id.haveacount)
        haveAccount.setOnClickListener {
            val intent = android.content.Intent(this, Sign_in::class.java)
            startActivity(intent)
        }

        val tvLogin = findViewById<android.widget.TextView>(R.id.tvLogin)
        tvLogin.setOnClickListener {
            val intent = android.content.Intent(this, Sign_in::class.java)
            startActivity(intent)
        }

        val btnSignUp = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnSignUp)
        btnSignUp.setOnClickListener {
            val intent = android.content.Intent(this, Sign_in::class.java)
            startActivity(intent)
        }

    }
}