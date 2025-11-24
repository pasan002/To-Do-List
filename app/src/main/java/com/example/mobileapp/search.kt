package com.example.mobileapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class search : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imageView: ImageView = findViewById(R.id.imageView32)
        imageView.setOnClickListener {
            val intent = Intent(this, browse::class.java)
            startActivity(intent)
        }

        // Bottom navigation: Today, Upcoming, Search, Browse
        val navToday: ImageView = findViewById(R.id.imageView29)
        navToday.setOnClickListener {
            val intent = Intent(this, today::class.java)
            startActivity(intent)
        }

        val navUpcoming: ImageView = findViewById(R.id.imageView30)
        navUpcoming.setOnClickListener {
            val intent = Intent(this, upcoming::class.java)
            startActivity(intent)
        }

        val navSearch: ImageView = findViewById(R.id.imageView31)
        navSearch.setOnClickListener {
            val intent = Intent(this, search::class.java)
            startActivity(intent)
        }

        val navBrowse: ImageView = findViewById(R.id.imageView32)
        navBrowse.setOnClickListener {
            val intent = Intent(this, browse::class.java)
            startActivity(intent)
        }
    }
}