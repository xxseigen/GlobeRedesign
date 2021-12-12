package com.example.android.globeredesignf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class welcomethree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcomethree)

        val btnwelcomethree = findViewById<Button>(R.id.btnwelcomethree)
        btnwelcomethree.setOnClickListener {
            val intent = Intent(this@welcomethree, register::class.java)
            startActivity(intent)
        }
    }
}