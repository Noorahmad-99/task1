package com.example.currencyconverterapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.currencyconverterapp.model.domain.NameCurrency
import com.example.currencyconverterapp.model.repository.SimpleMathCurrencyConverter

class MainViewModel : ViewModel() {

    private val repository = SimpleMathCurrencyConverter()

    private val  _currentCurrency = MutableLiveData<Double>()
    val  currentCurrency: LiveData<Double>
        get() =  _currentCurrency

    fun getCurrency() {
        _currentCurrency.postValue(repository.getResultCurrency())
    }



}