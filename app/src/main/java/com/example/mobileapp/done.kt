package com.example.mobileapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class done : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)

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