package com.example.mas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var signUpTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        emailEditText = findViewById(R.id.emailreg)
        passwordEditText = findViewById(R.id.passwordreg)
        loginButton = findViewById(R.id.SignupButton)
        signUpTextView = findViewById(R.id.SignupTextView)
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Add your login logic here
            if (email.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Logging in...", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, loadingsplash2::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }
        }

        signUpTextView.setOnClickListener {
            // Navigate to SignUp Activity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }

}