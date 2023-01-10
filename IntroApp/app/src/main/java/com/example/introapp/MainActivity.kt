package com.example.introapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloBtn = findViewById<Button>(R.id.helloButton)
        helloBtn.setOnClickListener {
            Log.v("Intro app", "Hello button clicked")
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }

        val darkThemeSwitch = findViewById<Switch>(R.id.darkThemeSwitch)
        darkThemeSwitch.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                Toast.makeText(this, "Night mode is on!", Toast.LENGTH_SHORT).show()
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                Toast.makeText(this, "Night mode is off!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}