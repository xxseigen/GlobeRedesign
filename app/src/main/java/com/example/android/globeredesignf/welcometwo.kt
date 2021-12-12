package com.example.android.globeredesignf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class welcometwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcometwo)

        val btnwelcometwo = findViewById<Button>(R.id.btnwelcometwo)
        btnwelcometwo.setOnClickListener {
            val intent = Intent(this@welcometwo, welcomethree::class.java)
            startActivity(intent)
        }
    }
}