package com.example.android.globeredesignf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnregister = findViewById<Button>(R.id.btnregister)
        btnregister.setOnClickListener {
            val intent = Intent(this@register, verification::class.java)
            startActivity(intent)
        }
    }
}