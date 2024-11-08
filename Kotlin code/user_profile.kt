package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class user_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val myButton: ImageButton = findViewById(R.id.home_button)
        myButton.setOnClickListener {
            val intent = Intent(this, landing_page2::class.java)
            startActivity(intent)
        }

        val Second_Button: ImageButton = findViewById(R.id.appointmentpage_button)
        Second_Button.setOnClickListener {
            val intent = Intent(this, appointment_summary::class.java)
            startActivity(intent)
        }

        val Third_Button: ImageButton = findViewById(R.id.location_button)
        Third_Button.setOnClickListener {
            val intent = Intent(this, landing_page2::class.java)
            startActivity(intent)
        }

        val fourth_Button: ImageButton = findViewById(R.id.profile_button)
        fourth_Button.setOnClickListener {
            val intent = Intent(this, user_profile::class.java)
            startActivity(intent)
        }
        }
    }
