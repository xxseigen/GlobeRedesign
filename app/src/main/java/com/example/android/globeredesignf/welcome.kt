package com.example.android.globeredesignf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnwelcome = findViewById<Button>(R.id.btnwelcome)
        btnwelcome.setOnClickListener {
            val intent = Intent(this@welcome, welcometwo::class.java)
            startActivity(intent)
        }
    }
}