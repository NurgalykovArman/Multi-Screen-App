package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiscreenapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val views = binding.root
        setContentView(views)
        Log.d("FirstActivity", "onCreate")
        binding.textView.text = "First Activity"

        binding.forwardButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        binding.backButton.setOnClickListener {
            finishAffinity()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("FirstActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FirstActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FirstActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FirstActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FirstActivity", "onDestroy")
    }
}