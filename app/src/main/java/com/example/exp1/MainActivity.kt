package com.example.exp1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val result = findViewById<TextView>(R.id.result)
        val name = findViewById<EditText>(R.id.name)
        val submit = findViewById<Button>(R.id.submit)

        submit.setOnClickListener {
            val res = "Hello ${name.text}"
            result.text = res
        }
    }
}