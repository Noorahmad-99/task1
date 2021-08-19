package com.example.currencyconverterapp.model.repository
import com.example.currencyconverterapp.model.domain.NameCurrency

class SimpleMathCurrencyConverter {
   private val currency : NameCurrency
       get() {
           TODO()
       }

    fun getResultCurrency() : Double{

        val value : Double = 0.0

        return when (currency) {
            NameCurrency.IQD ->  value / 1460
            NameCurrency.USD -> value * 1460
        }

    }
}