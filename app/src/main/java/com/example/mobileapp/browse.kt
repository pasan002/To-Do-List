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

class browse : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_browse)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val navToday: ImageView? = findViewById(R.id.imageView29)
        navToday?.apply {
            bringToFront()
            elevation = 16f
            isClickable = true
            isFocusable = true
            setOnClickListener {
                Log.d("browse", "Bottom nav: Today")
                Toast.makeText(this@browse, "Opening Today...", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@browse, today::class.java))
            }
        }

        val navUpcoming: ImageView? = findViewById(R.id.imageView30)
        navUpcoming?.apply {
            bringToFront()
            elevation = 16f
            isClickable = true
            isFocusable = true
            setOnClickListener {
                Log.d("browse", "Bottom nav: Upcoming")
                Toast.makeText(this@browse, "Opening Upcoming...", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@browse, upcoming::class.java))
            }
        }

        val navSearch: ImageView? = findViewById(R.id.imageView31)
        navSearch?.apply {
            bringToFront()
            elevation = 16f
            isClickable = true
            isFocusable = true
            setOnClickListener {
                Log.d("browse", "Bottom nav: Search")
                Toast.makeText(this@browse, "Opening Search...", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@browse, search::class.java))
            }
        }

        val navBrowse: ImageView? = findViewById(R.id.imageView32)
        navBrowse?.apply {
            bringToFront()
            elevation = 16f
            isClickable = true
            isFocusable = true
            setOnClickListener {
                Log.d("browse", "Bottom nav: Browse")
                Toast.makeText(this@browse, "Already on Browse", Toast.LENGTH_SHORT).show()
                // Do not restart the same activity
            }
        }
    }
}