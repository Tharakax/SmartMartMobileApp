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

        // Header Navigation
        val ivBell = findViewById<android.widget.ImageView>(R.id.ivBell)
        ivBell.setOnClickListener {
            startActivity(android.content.Intent(this, NotificationpageActivity::class.java))
        }

        val cartContainer = findViewById<android.widget.FrameLayout>(R.id.cartContainer)
        cartContainer.setOnClickListener {
            startActivity(android.content.Intent(this, MycartActivity::class.java))
        }

        // Category Navigation
        val cardGroceries = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.cardGroceries)
        cardGroceries.setOnClickListener {
            startActivity(android.content.Intent(this, ItemspageActivity::class.java))
        }

        val cardHousehold = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.cardHousehold)
        cardHousehold.setOnClickListener {
            startActivity(android.content.Intent(this, ItemspageActivity::class.java))
        }

        val cardPersonal = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.cardPersonal)
        cardPersonal.setOnClickListener {
            startActivity(android.content.Intent(this, ItemspageActivity::class.java))
        }

        val cardStationery = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.cardStationery)
        cardStationery.setOnClickListener {
            startActivity(android.content.Intent(this, ItemspageActivity::class.java))
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