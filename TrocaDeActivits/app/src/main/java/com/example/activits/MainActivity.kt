package com.example.activits

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activits.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonIr.setOnClickListener{
            /*val i = Intenet(this,ProfileActivity::class.java)
            startActivity(i)*/

            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}