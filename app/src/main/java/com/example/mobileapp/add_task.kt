package com.example.mobileapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class add_task : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)

        // Add Task action button → navigate to Display page
        val plusButton: ImageView? = findViewById(R.id.imageView37)
        plusButton?.apply {
            bringToFront()
            elevation = 16f
            isClickable = true
            isFocusable = true
            setOnClickListener {
                try {
                    Toast.makeText(this@add_task, "Opening display page...", Toast.LENGTH_SHORT).show()
                    Log.d("add_task", "Attempting to navigate to display page")
                    
                    // Try to get the class reference
                    val displayClass = try {
                        Class.forName("com.example.mobileapp.display")
                    } catch (e: ClassNotFoundException) {
                        Log.e("add_task", "Display class not found", e)
                        null
                    }
                    
                    if (displayClass != null) {
                        val intent = Intent(this@add_task, displayClass)
                        startActivity(intent)
                        Log.d("add_task", "Successfully started display activity")
                    } else {
                        // Fallback to direct class reference
                        val intent = Intent(this@add_task, display::class.java)
                        startActivity(intent)
                        Log.d("add_task", "Successfully started display activity using direct reference")
                    }
                } catch (e: Exception) {
                    Log.e("add_task", "Error navigating to display page", e)
                    Toast.makeText(this@add_task, "Error: ${e.message}", Toast.LENGTH_LONG).show()
                }
            }
        }
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