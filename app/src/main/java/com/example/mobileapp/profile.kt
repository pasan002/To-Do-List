package com.example.mobileapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Notification icon navigation
        val notificationIcon: ImageView = findViewById(R.id.imageView34)
        notificationIcon.bringToFront()
        notificationIcon.elevation = 16f
        notificationIcon.isClickable = true
        notificationIcon.isFocusable = true
        notificationIcon.setOnClickListener {
            Log.d("profile", "Notification icon clicked")
            Toast.makeText(this, "Opening notifications...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, notification::class.java)
            startActivity(intent)
        }

        // Settings icon navigation
        val settingsIcon: ImageView = findViewById(R.id.imageView35)
        settingsIcon.bringToFront()
        settingsIcon.elevation = 16f
        settingsIcon.isClickable = true
        settingsIcon.isFocusable = true
        settingsIcon.setOnClickListener {
            Log.d("profile", "Settings icon clicked")
            Toast.makeText(this, "Opening settings...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }


        // Bottom navigation: Today, Upcoming, Search, Browse
        val navToday: ImageView = findViewById(R.id.imageView29)
        navToday.setOnClickListener {
            Log.d("today", "Bottom nav: Today")
            val intent = Intent(this, today::class.java)
            startActivity(intent)
        }

        val navUpcoming: ImageView = findViewById(R.id.imageView30)
        navUpcoming.setOnClickListener {
            Log.d("today", "Bottom nav: Upcoming")
            val intent = Intent(this, upcoming::class.java)
            startActivity(intent)
        }

        val navSearch: ImageView = findViewById(R.id.imageView31)
        navSearch.setOnClickListener {
            Log.d("today", "Bottom nav: Search")
            val intent = Intent(this, search::class.java)
            startActivity(intent)
        }

        val navBrowse: ImageView = findViewById(R.id.imageView32)
        navBrowse.setOnClickListener {
            Log.d("today", "Bottom nav: Browse")
            val intent = Intent(this, browse::class.java)
            startActivity(intent)
        }

    }
}