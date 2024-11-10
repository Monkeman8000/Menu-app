package com.example.mas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class introActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intro)
        val btnstart = findViewById<Button>(R.id.buttongetstarted)
        btnstart.setOnClickListener {
            val intent= Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}