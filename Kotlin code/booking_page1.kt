package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.app.DatePickerDialog
import android.widget.RadioGroup
import java.util.Calendar
import android.widget.TextView

class booking_page1 : AppCompatActivity() {

    private lateinit var selectedOption1: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_page1)

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

        val radioGroup = findViewById<RadioGroup>(R.id.radio_button_1)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val selectedRadioButton = findViewById<RadioButton>(checkedId)
            selectedOption1 = selectedRadioButton.text.toString()
        }

        val nextButton: Button = findViewById(R.id.next_button)
        nextButton.setOnClickListener {
            if (::selectedOption1.isInitialized) {  // Ensure option is selected
                val intent = Intent(this, booking_page2::class.java)
                intent.putExtra("selectedOption1", selectedOption1)
                startActivity(intent)
            }
        }




    }
}

