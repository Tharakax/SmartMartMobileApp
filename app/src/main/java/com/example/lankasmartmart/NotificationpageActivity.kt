package com.example.lankasmartmart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NotificationpageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.notificationpage)

        val ivBack = findViewById<android.widget.ImageView>(R.id.ivBack)
        ivBack.setOnClickListener {
            finish()
        }

        val notificationCard = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.notificationcard)
        notificationCard.setOnClickListener {
            startActivity(android.content.Intent(this, OrderstateActivity::class.java))
        }

    }
}