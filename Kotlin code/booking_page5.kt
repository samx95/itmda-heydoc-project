package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class booking_page5 : AppCompatActivity() {

    private lateinit var selectedOption1: String
    private lateinit var selectedOption2: String
    private lateinit var selectedOption3: String
    private lateinit var selectedOption4: String
    private lateinit var selectedOption5: String
    private lateinit var selectedOption6: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_page5)

        // Retrieve previous options from the Intent
        selectedOption1 = intent.getStringExtra("selectedOption1") ?: ""
        selectedOption2 = intent.getStringExtra("selectedOption2") ?: ""
        selectedOption3 = intent.getStringExtra("selectedOption3") ?: ""
        selectedOption4 = intent.getStringExtra("selectedOption4") ?: ""
        selectedOption5 = intent.getStringExtra("selectedOption5") ?: ""

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

        val radioGroup2 = findViewById<RadioGroup>(R.id.radio_button_6)
        radioGroup2 .setOnCheckedChangeListener { group, checkedId ->
            val selectedRadioButton = findViewById<RadioButton>(checkedId)
            selectedOption6 = selectedRadioButton.text.toString()
        }

        val fifth_Button: Button = findViewById(R.id.next_button)
        fifth_Button.setOnClickListener {
            if (::selectedOption6.isInitialized) {
                val intent = Intent(this, booking_page6::class.java)
                intent.putExtra("selectedOption1", selectedOption1) // Pass previous selection
                intent.putExtra("selectedOption2", selectedOption2)
                intent.putExtra("selectedOption3", selectedOption3)
                intent.putExtra("selectedOption4", selectedOption4)
                intent.putExtra("selectedOption5", selectedOption5)
                intent.putExtra("selectedOption6", selectedOption6)
                startActivity(intent)
            }


        }
    }
}