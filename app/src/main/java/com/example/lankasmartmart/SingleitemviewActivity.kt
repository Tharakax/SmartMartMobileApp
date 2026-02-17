package com.example.lankasmartmart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SingleitemviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.singleitemview)

        // Navigation Logic
        val btnAddOranges = findViewById<android.widget.Button>(R.id.addoranges)
        btnAddOranges.setOnClickListener {
            startActivity(android.content.Intent(this, MycartActivity::class.java))
        }

        val ivBell = findViewById<android.widget.ImageView>(R.id.ivBell)
        ivBell.setOnClickListener {
            startActivity(android.content.Intent(this, NotificationpageActivity::class.java))
        }

        val cartContainer = findViewById<android.widget.FrameLayout>(R.id.cartContainer)
        cartContainer.setOnClickListener {
            startActivity(android.content.Intent(this, MycartActivity::class.java))
        }

    }
}