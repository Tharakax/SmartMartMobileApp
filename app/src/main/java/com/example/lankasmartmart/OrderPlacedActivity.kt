package com.example.lankasmartmart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderPlacedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.order_placed)
        // Navigation Logic
        val btnNextOnConfirmed = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.nextonconfirmed)
        btnNextOnConfirmed.setOnClickListener {
            startActivity(android.content.Intent(this, ItemspageActivity::class.java))
        }

    }
}