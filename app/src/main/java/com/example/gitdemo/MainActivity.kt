package com.example.gitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  var number = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = "$number"
        binding.buttonAdd.setOnClickListener{binding.textView.text = "${++number}"}

    }
}