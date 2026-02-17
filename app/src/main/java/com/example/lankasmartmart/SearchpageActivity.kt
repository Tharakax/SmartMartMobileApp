package com.example.lankasmartmart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SearchpageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.searchpage)

        val ivBack = findViewById<android.widget.ImageView>(R.id.ivBack)
        ivBack.setOnClickListener {
            finish()
        }

    }
}