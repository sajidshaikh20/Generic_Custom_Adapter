package com.bhuru.generic_custom_adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bhuru.generic_custom_adapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}