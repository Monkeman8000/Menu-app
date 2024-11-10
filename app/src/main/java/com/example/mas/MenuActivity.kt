package com.example.mas // Replace with your actual package name

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MenuActivity : AppCompatActivity() {

    // Define arrays for different courses
    private val starters = arrayOf("Bruschetta", "Stuffed Mushrooms", "Caprese Salad")
    private val mains = arrayOf("Grilled Chicken", "Pasta Primavera", "Beef Tacos")
    private val desserts = arrayOf("Cheesecake", "Chocolate Mousse", "Tiramisu")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu) // Ensure this matches your layout file name

        // Initialize the ViewPager and TabLayout
        val viewPager: ViewPager = findViewById(R.id.food_viewpager)
        val tabLayout: TabLayout = findViewById(R.id.food_tab)

        // Set up the ViewPager with an adapter
        val adapter = MenuPagerAdapter(supportFragmentManager)
        adapter.addFragment(CourseFragment.newInstance(starters), "Starters")
        adapter.addFragment(CourseFragment.newInstance(mains), "Mains")
        adapter.addFragment(CourseFragment.newInstance(desserts), "Desserts")
        viewPager.adapter = adapter

        // Connect TabLayout with ViewPager
        tabLayout.setupWithViewPager(viewPager)
        val foodCart: ImageView = findViewById(R.id.food_cart)
        foodCart.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

    }
}
