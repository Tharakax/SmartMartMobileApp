package com.example.lankasmartmart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderstateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.orderstate)

        val ivBack = findViewById<android.widget.ImageView>(R.id.ivBack)
        ivBack.setOnClickListener {
            finish()
        }

        val backToHome = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.backtohome)
        backToHome.setOnClickListener {
            startActivity(android.content.Intent(this, ItemspageActivity::class.java))
        }

    }
}