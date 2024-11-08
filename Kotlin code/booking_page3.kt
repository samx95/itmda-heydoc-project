package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.app.DatePickerDialog
import android.widget.DatePicker
import java.util.Calendar

class booking_page3 : AppCompatActivity() {

    private lateinit var selectedOption1: String
    private lateinit var selectedOption2: String
    private lateinit var selectedOption3: String
    private lateinit var selectedOption4: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_page3)

        // Retrieve previous options from the Intent
        selectedOption1 = intent.getStringExtra("selectedOption1") ?: ""
        selectedOption2 = intent.getStringExtra("selectedOption2") ?: ""
        selectedOption3 = intent.getStringExtra("selectedOption3") ?: ""


        // Home button
        val myButton: ImageButton = findViewById(R.id.home_button)
        myButton.setOnClickListener {
            val intent = Intent(this, landing_page2::class.java)
            startActivity(intent)
        }

        // Appointment page button
        val Second_Button: ImageButton = findViewById(R.id.appointmentpage_button)
        Second_Button.setOnClickListener {
            val intent = Intent(this, appointment_summary::class.java)
            startActivity(intent)
        }

        // Location button
        val Third_Button: ImageButton = findViewById(R.id.location_button)
        Third_Button.setOnClickListener {
            val intent = Intent(this, landing_page2::class.java)
            startActivity(intent)
        }

        // Profile button
        val fourth_Button: ImageButton = findViewById(R.id.profile_button)
        fourth_Button.setOnClickListener {
            val intent = Intent(this, user_profile::class.java)
            startActivity(intent)
        }

        val radioGroup2 = findViewById<RadioGroup>(R.id.pick_date)
        radioGroup2.setOnCheckedChangeListener { group, checkedId ->
            val selectedRadioButton = findViewById<RadioButton>(checkedId)
            selectedOption4 = selectedRadioButton.text.toString()


            // Next button to go to the next page
            val nextButton: Button = findViewById(R.id.next_button)
            nextButton.setOnClickListener {

                if (::selectedOption4.isInitialized) {
                    val intent = Intent(this, booking_page4::class.java)
                    intent.putExtra("selectedOption1", selectedOption1) // Pass previous selection
                    intent.putExtra("selectedOption2", selectedOption2)
                    intent.putExtra("selectedOption3", selectedOption3)
                    intent.putExtra("selectedOption4", selectedOption4)// Add current selection
                    startActivity(intent)
                }
            }
        }
    }
}


