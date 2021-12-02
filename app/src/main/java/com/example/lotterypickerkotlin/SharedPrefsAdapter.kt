package com.example.lotterypickerkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SharedPrefsAdapter(private val gameNumberList: ArrayList<String>) : RecyclerView.Adapter<SharedPrefsAdapter.SharedPrefsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SharedPrefsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.clicked_numbers_list,
            parent,
            false
        )

        return SharedPrefsViewHolder(view)
    }

    override fun onBindViewHolder(holder: SharedPrefsViewHolder, position: Int) {
        holder.listTextView.text = gameNumberList.toString()
    }

    override fun getItemCount(): Int {
        return gameNumberList.size
    }

    inner class SharedPrefsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val listTextView: TextView = itemView.findViewById(R.id.saved_numbers_list)

    }

}