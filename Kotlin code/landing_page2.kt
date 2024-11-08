package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class landing_page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page2)

        val myButton: Button = findViewById(R.id.messages_button)
        myButton.setOnClickListener {
            val intent = Intent(this, messages::class.java)
            startActivity(intent)
        }

        val second_button: Button = findViewById(R.id.appointment_button)
        second_button.setOnClickListener {
            val intent = Intent(this, booking_page1::class.java)
            startActivity(intent)
        }

        val Third_Button: ImageButton = findViewById(R.id.home_button)
        Third_Button.setOnClickListener {
            val intent = Intent(this, landing_page2::class.java)
            startActivity(intent)
        }

        val Fourth_Button: ImageButton = findViewById(R.id.appointmentpage_button)
        Fourth_Button.setOnClickListener {
            val intent = Intent(this, appointment_summary::class.java)
            startActivity(intent)
        }

        val Fifth_Button: ImageButton = findViewById(R.id.location_button)
        Fifth_Button.setOnClickListener {
            val intent = Intent(this, landing_page2::class.java)
            startActivity(intent)
        }

        val Sixth_Button: ImageButton = findViewById(R.id.profile_button)
        Sixth_Button.setOnClickListener {
            val intent = Intent(this, user_profile::class.java)
            startActivity(intent)

        }
    }
    }
