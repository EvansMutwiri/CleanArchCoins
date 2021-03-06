package com.example.cleanapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanapp.R
import com.example.cleanapp.databinding.CoincardBinding
import com.example.domain.model.Coin

class CoinRecyclerAdapter(val coinList: List<Coin>): RecyclerView.Adapter<CoinRecyclerAdapter.CoinViewHolder>() {
    class CoinViewHolder(val binding: CoincardBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.coincard, parent, false)
        return CoinViewHolder(CoincardBinding.bind(v))
    }

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        holder.binding.coinSymbol.text = coinList[position].symbol
        holder.binding.coinName.text = coinList[position].name
        holder.binding.coinPrice.text = coinList[position].isActive.toString()
        holder.binding.coinRank.text = coinList[position].rank.toString()
        holder.binding.coinType.text = coinList[position].type
    }

    override fun getItemCount(): Int {
        return coinList.size
    }

}
