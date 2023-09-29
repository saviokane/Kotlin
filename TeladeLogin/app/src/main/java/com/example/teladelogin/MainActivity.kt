package com.example.teladelogin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.teladelogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogar.setOnClickListener{
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editUsername.text.toString().trim()
            if(username.equals("admin") && password.equals("admin")){
                Toast.makeText(applicationContext,"Login efetuado",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"Deu ruim",Toast.LENGTH_SHORT).show()

            }

            binding.editUsername.setText("")
            binding.editPassword.setText("")
        }
    }


}
