package com.example.lankasmartmart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home1)

        // Navigation Logic
        val searchLayout = findViewById<android.widget.LinearLayout>(R.id.searchLayout)
        searchLayout.setOnClickListener {
            startActivity(android.content.Intent(this, SearchpageActivity::class.java))
        }

        val navHome = findViewById<android.widget.ImageView>(R.id.navHome)
        navHome.setOnClickListener {
            startActivity(android.content.Intent(this, ItemspageActivity::class.java))
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