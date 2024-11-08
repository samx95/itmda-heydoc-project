package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class booking_page2 : AppCompatActivity() {

    private lateinit var selectedOption1: String
    private lateinit var selectedOption2: String
    private lateinit var selectedOption3: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_page2)

        // Retrieve selectedOption1 from the Intent extras
        selectedOption1 = intent.getStringExtra("selectedOption1") ?: ""

        // Home button setup
        val myButton: ImageButton = findViewById(R.id.home_button)
        myButton.setOnClickListener {
            val intent = Intent(this, landing_page2::class.java)
            startActivity(intent)
        }

        // Setting up other buttons similarly...

        // RadioGroup listener for selectedOption1 (add if needed)


        // RadioGroup listener for selectedOption2
        val radioGroup2 = findViewById<RadioGroup>(R.id.radio_button_2)
        radioGroup2.setOnCheckedChangeListener { _, checkedId ->
            val selectedRadioButton = findViewById<RadioButton>(checkedId)
            selectedOption2 = selectedRadioButton.text.toString()
        }

        // RadioGroup listener for selectedOption3
        val radioGroup3 = findViewById<RadioGroup>(R.id.radioGroupOptions)
        radioGroup3.setOnCheckedChangeListener { _, checkedId ->
            val selectedRadioButton = findViewById<RadioButton>(checkedId)
            selectedOption3 = selectedRadioButton.text.toString()
        }

        // Next button click listener
        val nextButton: Button = findViewById(R.id.next_button)
        nextButton.setOnClickListener {

            // Verify that all options are selected before starting the next activity
            if (::selectedOption2.isInitialized && ::selectedOption3.isInitialized) {
                val intent = Intent(this, booking_page3::class.java)
                intent.putExtra("selectedOption1", selectedOption1) // Pass previous selection
                intent.putExtra("selectedOption2", selectedOption2)
                intent.putExtra("selectedOption3", selectedOption3) // Add current selection
                startActivity(intent)
            }
        }
    }
}
