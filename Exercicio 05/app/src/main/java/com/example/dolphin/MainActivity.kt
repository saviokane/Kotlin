package com.example.dolphin

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import com.example.dolphin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val editText = binding.textViewEscrevaCoisas
        val button = binding.buttonEnviar
        val listView = binding.userlistListas

        val list = ArrayList<String>()
        val adapter = ArrayAdapter(this,
        R.layout.simple_list_item_1,list)
        listView.adapter = adapter

        binding.buttonEnviar.setOnClickListener {
        val text = binding.textViewEscrevaCoisas.toString()
        if(text != ""){
            list.add(text)
            adapter.notifyDataSetChanged()
            editText.setText("")
            editText.requestFocus()
        }


        }

        listView.setOnItemCLickListener { parent,view,position, id ->
            editText.setText(list[position])
        }

        listView.setOnItemClickListener{ parent, view, position, id = >
        list.removeAt(position)
        adapter.notifyDataSetChanged()
        true
        }
    }
}