package com.example.keyingin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.keyingin.databinding.ActivityMain2Binding
import com.example.keyingin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnK.setOnClickListener {
          startActivity(Intent(this, MainActivity2::class.java))
        }

    }

    override fun onResume() {
        super.onResume()
    binding.liner1.setBackgroundColor(MyData.color)

    }

}