package com.example.currencyconverterapp.view


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.currencyconverterapp.R
import com.example.currencyconverterapp.databinding.ActivityMainBinding
import com.example.currencyconverterapp.viewModel.MainViewModel


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

    }
}