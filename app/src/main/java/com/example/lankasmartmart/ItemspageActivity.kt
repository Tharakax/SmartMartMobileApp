package com.example.lankasmartmart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ItemspageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.itemspage)

        // Navigation Logic
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

        // Navigate to Single Item View
        val orangeCard = findViewById<android.widget.LinearLayout>(R.id.orangecard)
        orangeCard.setOnClickListener {
            startActivity(android.content.Intent(this, SingleitemviewActivity::class.java))
        }

    }
}