package com.example.android.globeredesignf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class verificationtwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verificationtwo)

        val btnreturnverification = findViewById<Button>(R.id.btnreturnverification)
        btnreturnverification.setOnClickListener {
            val intent = Intent(this@verificationtwo, verification::class.java)
            startActivity(intent)
        }

        val btnverificationtwo = findViewById<Button>(R.id.btnverificationtwo)
        btnverificationtwo.setOnClickListener {
            val intent = Intent(this@verificationtwo, verificationthree::class.java)
            startActivity(intent)
        }
    }
}