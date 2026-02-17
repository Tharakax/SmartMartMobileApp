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

        // Bottom Navigation Logic
        val navHome = findViewById<android.widget.ImageView>(R.id.navHome)
        navHome.setOnClickListener {
            startActivity(android.content.Intent(this, ItemspageActivity::class.java))
        }

        val navGrid = findViewById<android.widget.ImageView>(R.id.navGrid)
        navGrid.setOnClickListener {
            startActivity(android.content.Intent(this, Home1::class.java))
        }

        val navCart = findViewById<android.widget.ImageView>(R.id.navCart)
        navCart.setOnClickListener {
            startActivity(android.content.Intent(this, MycartActivity::class.java))
        }

        val navProfile = findViewById<android.widget.ImageView>(R.id.navProfile)
        navProfile.setOnClickListener {
            startActivity(android.content.Intent(this, ProfilepageActivity::class.java))
        }

    }
}