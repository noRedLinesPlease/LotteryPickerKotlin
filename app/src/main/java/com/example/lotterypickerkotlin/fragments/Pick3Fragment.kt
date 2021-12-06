package com.example.lotterypickerkotlin.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lotterypickerkotlin.*


class Pick3Fragment : Fragment() {

    private lateinit var gameNumbers: ArrayList<String>
    private lateinit var refreshButton: Button
    private lateinit var recyclerView: RecyclerView
    private lateinit var saveNumbersButton: Button
    private lateinit var gotoSharedPrefsButton: Button

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
        gameNumbers = GenerateBallNumbers().setPick3()
        recyclerView.adapter = BallListAdapter(gameNumbers)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        return root
    }

    private fun updateNumbers() {
        gameNumbers = GenerateBallNumbers().setPick3()
        recyclerView.adapter = BallListAdapter(gameNumbers)
    }
}