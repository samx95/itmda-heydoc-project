package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class booking_page6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_page6)

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

        val fifth_Button: Button = findViewById(R.id.next_button)
        fifth_Button.setOnClickListener {
            val intent = Intent(this, landing_page2::class.java)
            startActivity(intent)
        }

        val selectedOption1 = intent.getStringExtra("selectedOption1")
        val selectedOption2 = intent.getStringExtra("selectedOption2")
        val selectedOption3 = intent.getStringExtra("selectedOption3")
        val selectedOption4 = intent.getStringExtra("selectedOption4")
        val selectedOption5 = intent.getStringExtra("selectedOption5")
        val selectedOption6 = intent.getStringExtra("selectedOption6")

        // Find TextViews and set their text
        // Find TextViews and set their text
        val option1TextView = findViewById<TextView>(R.id.option1TextView)
        val option2TextView = findViewById<TextView>(R.id.option2TextView)
        val option3TextView = findViewById<TextView>(R.id.option3TextView)
        val option4TextView = findViewById<TextView>(R.id.option4TextView)
        val option5TextView = findViewById<TextView>(R.id.option5TextView)
        val option6TextView = findViewById<TextView>(R.id.option6TextView)

        option1TextView.text = "Service: $selectedOption1"
        option2TextView.text = "Doctor: $selectedOption2"
        option3TextView.text = "Consultation Type: $selectedOption3"
        option4TextView.text = "Date: $selectedOption4"
        option5TextView.text = "Location: $selectedOption5"
        option6TextView.text = "Time: $selectedOption6"

    }
}

