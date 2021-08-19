package com.example.currencyconverterapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.currencyconverterapp.R
import com.example.currencyconverterapp.databinding.ActivityMainBinding
import com.example.currencyconverterapp.viewModel.MainViewModel
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        go()
    }

    private fun go() {
        binding.Converter.setOnClickListener {
            viewModel.getCurrency()
        }
        viewModel.currentCurrency.observe(this,{
            binding.newCurrency.text = it.absoluteValue.toString()
        })

    }
}