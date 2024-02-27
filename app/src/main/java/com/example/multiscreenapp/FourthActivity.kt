package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiscreenapp.databinding.ActivityFourthBinding
import com.example.multiscreenapp.databinding.ActivityThirdBinding

class FourthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        val views = binding.root
        setContentView(views)
        Log.d("FourthActivity", "onCreate")
        binding.textView.text = "Fourth Activity"

        binding.forwardButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.backButton.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("ThirdActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ThirdActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ThirdActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ThirdActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ThirdActivity", "onDestroy")
    }
}