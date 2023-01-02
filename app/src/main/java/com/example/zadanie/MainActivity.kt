package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            var haslo = findViewById<TextInputEditText>(R.id.Haslo).text.toString()
            var potwierdz = findViewById<TextInputEditText>(R.id.Potwierdz).text.toString()

            if( haslo==potwierdz){
                findViewById<TextView>(R.id.textView).text="Hasla sa zgodne"
            }
            else{
                findViewById<TextView>(R.id.textView).text="Hasla nie sa zgodne"
            }

        }
    }





}