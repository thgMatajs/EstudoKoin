package com.thg.estudokoin.presentation

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.thg.estudokoin.R
import com.thg.estudokoin.model.Currency

class CurrenciesAdapter: RecyclerView.Adapter<CurrenciesAdapter.ViewHolder>() {

    var currencies: List<Currency> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_currency, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = currencies.count()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.curremcyView.setCurrency(currencies[position])


    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val curremcyView: CurrencyView = view.findViewById(R.id.view_currency)
    }
}