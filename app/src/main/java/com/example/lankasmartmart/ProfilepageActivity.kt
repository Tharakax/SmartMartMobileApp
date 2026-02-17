package com.example.lankasmartmart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfilepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.profilepage)

        // Navigation Logic
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

        // My Orders Navigation
        val myOrderBtn = findViewById<android.widget.LinearLayout>(R.id.myorderbtn)
        myOrderBtn.setOnClickListener {
            startActivity(android.content.Intent(this, OrderstateActivity::class.java))
        }

        // Logout Navigation
        val logoutBtn = findViewById<android.widget.LinearLayout>(R.id.logoutonprofile)
        logoutBtn.setOnClickListener {
            startActivity(android.content.Intent(this, Sign_in::class.java))
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}