package com.thg.estudokoin.data

import com.google.gson.Gson
import com.thg.estudokoin.model.Currency

class LocalDataRepository(private val gson: Gson): DataRepository {

    override fun getCurrencies(jsonString: String): List<Currency> {
        return gson.fromJson(jsonString, Array<Currency>::class.java).toList()
    }
}