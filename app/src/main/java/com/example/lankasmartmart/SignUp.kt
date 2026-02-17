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

        val imageView15 = findViewById<android.widget.ImageView>(R.id.imageView15)
        imageView15.setOnClickListener {
            val intent = android.content.Intent(this, Sign_in::class.java)
            startActivity(intent)
        }

        val textView3 = findViewById<android.widget.TextView>(R.id.textView3)
        textView3.setOnClickListener {
            val intent = android.content.Intent(this, Sign_in::class.java)
            startActivity(intent)
        }

    }
}