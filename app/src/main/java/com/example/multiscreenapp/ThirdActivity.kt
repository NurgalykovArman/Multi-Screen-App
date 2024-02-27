package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiscreenapp.databinding.ActivitySecondBinding
import com.example.multiscreenapp.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        val views = binding.root
        setContentView(views)
        Log.d("ThirdActivity", "onCreate")
        binding.textView.text = "Third Activity"

        binding.forwardButton.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
        binding.backButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
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