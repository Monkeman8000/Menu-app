package com.example.mas

// CartManager.kt
object CartManager {
    private val cartItems = mutableListOf<cartItem>()

    fun addItem(item: cartItem) {
        val existingItem = cartItems.find { it.name == item.name }
        if (existingItem != null) {
            // If the item already exists in the cart, increase the quantity
            val updatedItem = existingItem.copy(quantity = existingItem.quantity + 1)
            cartItems[cartItems.indexOf(existingItem)] = updatedItem
        } else {
            // Add new item to the cart
            cartItems.add(item)
        }
    }

    fun getItems(): List<cartItem> {
        return cartItems
    }

    fun clearCart() {
        cartItems.clear()
    }
}