package com.example.mobileapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class done_task : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done_task)
        val getStartedButton2: Button = findViewById(R.id.radioButton3)
        getStartedButton2.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, done::class.java)
            startActivity(intent)
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
    }
}