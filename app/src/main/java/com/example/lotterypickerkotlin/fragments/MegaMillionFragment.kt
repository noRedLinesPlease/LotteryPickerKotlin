package com.example.lotterypickerkotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lotterypickerkotlin.BallListAdapter
import com.example.lotterypickerkotlin.MainViewModel
import com.example.lotterypickerkotlin.R

class MegaMillionFragment : Fragment() {
    private val mainViewModel by viewModels<MainViewModel>()
    private lateinit var gameNumbers: ArrayList<Int>
    private lateinit var refreshButton: Button
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        recyclerView = root.findViewById(R.id.ball_rv)
        refreshButton = root.findViewById(R.id.refresh_button)
        refreshButton.setOnClickListener {
            updateNumbers()
        }

        gameNumbers = if (savedInstanceState == null){
            mainViewModel.setMegaMillion()
        } else {
            mainViewModel.gameNumberList
        }

        recyclerView.adapter = BallListAdapter(gameNumbers)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        return root
    }

    private fun updateNumbers() {
        gameNumbers = mainViewModel.setMegaMillion()
        recyclerView.adapter = BallListAdapter(gameNumbers)
    }

}