package com.example.android.globeredesignf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class verification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)

        val btnreturnregister = findViewById<Button>(R.id.btnreturnregister)
        btnreturnregister.setOnClickListener {
            val intent = Intent(this@verification, register::class.java)
            startActivity(intent)
        }

        val btnverificationtwo = findViewById<Button>(R.id.btnverification)
        btnverificationtwo.setOnClickListener {
            val intent = Intent(this@verification, verificationtwo::class.java)
            startActivity(intent)
        }
    }
}