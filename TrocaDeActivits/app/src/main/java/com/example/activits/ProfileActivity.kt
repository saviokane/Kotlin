package com.example.activits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activits.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonVoltar.setOnClickListener{
            finish()
        }
    }
}