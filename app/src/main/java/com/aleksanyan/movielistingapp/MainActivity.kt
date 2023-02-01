package com.aleksanyan.movielistingapp

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initNavigation()

        val myAnimation = AnimationUtils.loadAnimation(this, R.anim.poster_animation)
    }



    private fun initNavigation() {
        topBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.settings -> {
                    Toast.makeText(this, R.string.menu_settings_title, Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }

        }

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.favorites -> {
                    Toast.makeText(this, R.string.menu_favorites_title, Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.watch_later -> {
                    Toast.makeText(this, R.string.menu_watch_later_title, Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.selections -> {
                    Toast.makeText(this, R.string.menu_selections_title, Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }

}