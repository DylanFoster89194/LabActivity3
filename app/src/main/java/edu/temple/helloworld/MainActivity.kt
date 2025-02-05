package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties
    private lateinit var displayTextView: TextView
    private lateinit var nameEditText: EditText
    private lateinit var clickMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)
        clickMeButton = findViewById(R.id.clickMeButton)

        // Set up button click listener
        clickMeButton.setOnClickListener {
            val name = nameEditText.text.toString().trim()

            if (name.isEmpty()) {
                displayTextView.text = "Please enter your name."
            } else {
                displayTextView.text = "Hello, $name"
            }
        }
    }
}
