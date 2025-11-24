package com.example.mobileapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class upcoming : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_upcoming)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Search (center icon on bottom bar)
        val searchIcon: ImageView? = findViewById(R.id.imageView31)
        searchIcon?.setOnClickListener {
            val intent = Intent(this, search::class.java)
            startActivity(intent)
        }

        // Profile icon navigation (top right mini bar)
        val profileIcon: ImageView? = findViewById(R.id.imageView33)
        profileIcon?.apply {
            bringToFront()
            elevation = 16f
            isClickable = true
            isFocusable = true
            setOnClickListener {
                Log.d("upcoming", "Profile icon clicked")
                Toast.makeText(this@upcoming, "Opening profile...", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@upcoming, profile::class.java)
                startActivity(intent)
            }
        }

        // Notification icon navigation (top right mini bar)
        val notificationIcon: ImageView? = findViewById(R.id.imageView34)
        notificationIcon?.apply {
            bringToFront()
            elevation = 16f
            isClickable = true
            isFocusable = true
            setOnClickListener {
                Log.d("upcoming", "Notification icon clicked")
                Toast.makeText(this@upcoming, "Opening notifications...", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@upcoming, notification::class.java)
                startActivity(intent)
            }
        }

        // Settings icon navigation (top right mini bar)
        val settingsIcon: ImageView? = findViewById(R.id.imageView35)
        settingsIcon?.apply {
            bringToFront()
            elevation = 16f
            isClickable = true
            isFocusable = true
            setOnClickListener {
                Log.d("upcoming", "Settings icon clicked")
                Toast.makeText(this@upcoming, "Opening settings...", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@upcoming, settings::class.java)
                startActivity(intent)
            }
        }

        // Bottom navigation: Today, Upcoming, Search, Browse
        val navToday: ImageView? = findViewById(R.id.imageView29)
        navToday?.setOnClickListener {
            Log.d("upcoming", "Bottom nav: Today")
            val intent = Intent(this, today::class.java)
            startActivity(intent)
        }

        val navUpcoming: ImageView? = findViewById(R.id.imageView30)
        navUpcoming?.setOnClickListener {
            Log.d("upcoming", "Bottom nav: Upcoming")
            val intent = Intent(this, upcoming::class.java)
            startActivity(intent)
        }

        val navSearch: ImageView? = findViewById(R.id.imageView31)
        navSearch?.setOnClickListener {
            Log.d("upcoming", "Bottom nav: Search")
            val intent = Intent(this, search::class.java)
            startActivity(intent)
        }

        val navBrowse: ImageView? = findViewById(R.id.imageView32)
        navBrowse?.setOnClickListener {
            Log.d("upcoming", "Bottom nav: Browse")
            val intent = Intent(this, browse::class.java)
            startActivity(intent)
        }
    }
}