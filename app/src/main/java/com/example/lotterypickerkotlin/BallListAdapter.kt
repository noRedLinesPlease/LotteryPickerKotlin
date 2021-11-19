package com.example.lotterypickerkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class BallListAdapter(
      private val gameNumbersList: ArrayList<Int>,
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
            holder.extraBallTV.visibility = View.GONE
        if (position == 5){
            holder.extraBallTV.visibility = View.VISIBLE
            holder.extraBallTV.text = gameNumbersList[position].toString()

        }
    }

    override fun getItemCount() = gameNumbersList.size

    inner class BallViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val ballTV: TextView = itemView.findViewById(R.id.one_ball)
            val extraBallTV: TextView = itemView.findViewById(R.id.extra_ball)
    }


}