package com.example.lankasmartmart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaymentinfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.paymentinfo)
        // Navigation Logic
        val btnNextOnPayInfo = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.nextonpayinfo)
        btnNextOnPayInfo.setOnClickListener {
            startActivity(android.content.Intent(this, OrderPlacedActivity::class.java))
        }

    }
}