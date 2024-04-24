package com.example.greetingapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var editTextName: EditText? = null
    private var buttonGreet: Button? = null
    private var textViewGreeting: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        buttonGreet = findViewById(R.id.buttonGreet)
        textViewGreeting = findViewById(R.id.textViewGreeting)

        val editText = editTextName // Simpan referensi EditText dalam variabel lokal
        val button = buttonGreet // Simpan referensi Button dalam variabel lokal
        val textView = textViewGreeting // Simpan referensi TextView dalam variabel lokal

        button!!.setOnClickListener {
            val name = editText!!.text.toString().trim { it <= ' ' }
            val greeting = generateGreeting(name) // Panggil generateGreeting
            textView!!.text = greeting
        }
    }

    // Ubah visibilitas menjadi public
    open fun generateGreeting(name: String): String? {
        return if (!name.isEmpty()) {
            "Hello, $name!"
        } else {
            "Please enter your name."
        }
    }

}