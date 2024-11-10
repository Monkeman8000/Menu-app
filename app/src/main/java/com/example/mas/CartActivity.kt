package com.example.mas

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cart)
        val listView: ListView = findViewById(R.id.cart_list_view)
        val cartItems = CartManager.getItems().map { "${it.name} (x${it.quantity})" }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cartItems)
        listView.adapter = adapter
    }

}