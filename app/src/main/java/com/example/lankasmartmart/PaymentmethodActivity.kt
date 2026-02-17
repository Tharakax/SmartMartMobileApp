package com.example.lankasmartmart

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaymentmethodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.paymentmethod)

        // Navigation Logic
        val navHome = findViewById<ImageView>(R.id.navHome)
        navHome.setOnClickListener {
            startActivity(Intent(this, ItemspageActivity::class.java))
        }

        val navCart = findViewById<ImageView>(R.id.navCart)
        navCart.setOnClickListener {
            startActivity(Intent(this, MycartActivity::class.java))
        }

        val navProfile = findViewById<ImageView>(R.id.navProfile)
        navProfile.setOnClickListener {
            startActivity(Intent(this, ProfilepageActivity::class.java))
        }
        
        val ivBack = findViewById<ImageView>(R.id.ivBack)
        ivBack.setOnClickListener {
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}