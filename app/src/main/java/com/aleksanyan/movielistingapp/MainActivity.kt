package com.aleksanyan.movielistingapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initButtons()
    }

    fun initButtons() {
        button_menu.setOnClickListener {
            Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show()
        }

        button_favourites.setOnClickListener {
            Toast.makeText(this, "Favourites", Toast.LENGTH_SHORT).show()
        }

        button_watchLater.setOnClickListener {
            Toast.makeText(this, "Watch Later", Toast.LENGTH_SHORT).show()
        }

        button_selections.setOnClickListener {
            Toast.makeText(this, "Selections", Toast.LENGTH_SHORT).show()
        }

        button_settings.setOnClickListener {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
        }
    }
}