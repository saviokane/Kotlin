package com.example.teladelogin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teladelogin.databinding.ActivityLoginOkBinding

class LoginOkActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginOkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginOkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val p = intent
        val nome = p.extras?.getString("username");
        binding.textViewMsg.setText("Seja bem vindo $nome!!!")

        binding.buttonLogout.setOnClickListener{

            val i = Intent(this, MainActivity::class.java)
            startActivity(i);
        }




    }
}