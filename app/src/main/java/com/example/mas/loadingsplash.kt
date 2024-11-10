package com.example.mas

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class loadingsplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loadingsplash)
        // Delay of 4 seconds before moving to another page
        Handler(Looper.getMainLooper()).postDelayed({
            // Start the new activity
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()  // Optional: Call finish() if you don't want to return to this activity
        }, 4000)  // 4000 milliseconds = 4 seconds
    }
}