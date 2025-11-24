package com.example.mobileapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class today : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_today)

		// Plus button (custom ImageView) opens Add Task page
		val plusButton: ImageView? = findViewById(R.id.imageView2)
		plusButton?.apply {
			bringToFront()
			elevation = 16f
			isClickable = true
			isFocusable = true
			setOnClickListener {
				Toast.makeText(this@today, "Opening add task...", Toast.LENGTH_SHORT).show()
				startActivity(Intent(this@today, add_task::class.java))
			}
		}


		val profileIcon: ImageView = findViewById(R.id.imageView33)
		profileIcon.bringToFront()
		profileIcon.elevation = 16f
		profileIcon.isClickable = true
		profileIcon.isFocusable = true
		profileIcon.setOnClickListener {
			Log.d("today", "Profile icon clicked")
			Toast.makeText(this, "Opening profile...", Toast.LENGTH_SHORT).show()
			val intent = Intent(this, profile::class.java)
			startActivity(intent)
		}

		val notificationIcon: ImageView = findViewById(R.id.imageView34)
		notificationIcon.bringToFront()
		notificationIcon.elevation = 16f
		notificationIcon.isClickable = true
		notificationIcon.isFocusable = true
		notificationIcon.setOnClickListener {
			Log.d("today", "Notification icon clicked")
			Toast.makeText(this, "Opening notifications...", Toast.LENGTH_SHORT).show()
			val intent = Intent(this, notification::class.java)
			startActivity(intent)
		}

		val settingsIcon: ImageView = findViewById(R.id.imageView35)
		settingsIcon.bringToFront()
		settingsIcon.elevation = 16f
		settingsIcon.isClickable = true
		settingsIcon.isFocusable = true
		settingsIcon.setOnClickListener {
			Log.d("today", "Settings icon clicked")
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