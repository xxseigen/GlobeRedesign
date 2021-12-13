package com.example.android.globeredesignf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class verificationthree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verificationthree)

        val btndashboard = findViewById<Button>(R.id.btndashboard)
        btndashboard.setOnClickListener {
            val intent = Intent(this@verificationthree, dashboard::class.java)
            startActivity(intent)
        }
    }
}