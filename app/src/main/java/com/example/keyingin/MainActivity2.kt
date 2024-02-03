package com.example.keyingin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.keyingin.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRed.setOnClickListener {
            Toast.makeText(this, "Red bosildi", Toast.LENGTH_SHORT).show()
            MyData.color = Color.RED
        }
        binding.btnGreen.setOnClickListener {
            Toast.makeText(this, "green bosildi", Toast.LENGTH_SHORT).show()
            MyData.color = Color.GREEN
        }
        binding.btnYellow.setOnClickListener {
            Toast.makeText(this,"Yellow bosildi", Toast.LENGTH_SHORT).show()
            MyData.color = Color.YELLOW
        }
        binding.btnHavo.setOnClickListener {
            Toast.makeText(this,"Blue bosildi", Toast.LENGTH_SHORT).show()
            MyData.color = Color.CYAN
        }
        binding.btnSiyoh.setOnClickListener {
            Toast.makeText(this,"Purple bosildi", Toast.LENGTH_SHORT).show()
            MyData.color = Color.MAGENTA
        }
        binding.btnKul.setOnClickListener {
            Toast.makeText(this,"Grey bosildi", Toast.LENGTH_SHORT).show()
            MyData.color = Color.LTGRAY
        }

    }
}