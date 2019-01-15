package com.thg.estudokoin.data

import com.thg.estudokoin.model.Currency

interface DataRepository {

    fun getCurrencies(jsonString: String): List<Currency>
}