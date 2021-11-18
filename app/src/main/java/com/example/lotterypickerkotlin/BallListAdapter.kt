package com.example.lotterypickerkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BallListAdapter(
      private val gameNumbersList: ArrayList<Int>
) : RecyclerView.Adapter<BallListAdapter.BallViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BallViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
                R.layout.single_ball_item,
                parent,
                false
        )
        return BallViewHolder(view)
    }

    override fun onBindViewHolder(holder: BallViewHolder, position: Int) {
            holder.ballTV.text = gameNumbersList[position].toString()
    }

    override fun getItemCount() = gameNumbersList.size


    inner class BallViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val ballTV: TextView = itemView.findViewById(R.id.one_ball)
    }


}