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

class notification : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notification)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val today: ImageView = findViewById(R.id.imageView29)


        today.setOnClickListener {
            val intent = Intent(this, today::class.java)
            startActivity(intent) }

        val upcoming: ImageView = findViewById(R.id.imageView30)


        upcoming.setOnClickListener {
            val intent = Intent(this, upcoming::class.java)
            startActivity(intent) }

        val search: ImageView = findViewById(R.id.imageView31)


        search.setOnClickListener {
            val intent = Intent(this, search::class.java)
            startActivity(intent) }

        val browse: ImageView = findViewById(R.id.imageView32)


        browse.setOnClickListener {
            val intent = Intent(this, browse::class.java)
            startActivity(intent) }

        // Profile icon navigation
        val profileIcon: ImageView = findViewById(R.id.imageView33)
        profileIcon.bringToFront()
        profileIcon.elevation = 16f
        profileIcon.isClickable = true
        profileIcon.isFocusable = true
        profileIcon.setOnClickListener {
            Log.d("notification", "Profile icon clicked")
            Toast.makeText(this, "Opening profile...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        // Settings icon navigation
        val settingsIcon: ImageView = findViewById(R.id.imageView35)
        settingsIcon.bringToFront()
        settingsIcon.elevation = 16f
        settingsIcon.isClickable = true
        settingsIcon.isFocusable = true
        settingsIcon.setOnClickListener {
            Log.d("notification", "Settings icon clicked")
            Toast.makeText(this, "Opening Settings...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }
    }
}