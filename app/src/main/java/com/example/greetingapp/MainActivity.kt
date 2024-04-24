package com.example.greetingapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

open class MainActivity : AppCompatActivity() {
    private var editTextName: EditText? = null
    private var buttonGreet: Button? = null
    private var textViewGreeting: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        buttonGreet = findViewById(R.id.buttonGreet)
        textViewGreeting = findViewById(R.id.textViewGreeting)

        buttonGreet!!.setOnClickListener {
            val name = editTextName!!.text.toString().trim()
            val greeting = generateGreeting(name) // Panggil generateGreeting
            textViewGreeting!!.text = greeting
        }
    }

    // Ubah visibilitas menjadi public
    open fun generateGreeting(name: String): String {
        return if (name.isNotEmpty()) {
            "Hello, $name!"
        } else {
            "Please enter your name."
        }
    }
}
