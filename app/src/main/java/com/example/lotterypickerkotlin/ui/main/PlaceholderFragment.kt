package com.example.lotterypickerkotlin.ui.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lotterypickerkotlin.BallListAdapter
import com.example.lotterypickerkotlin.R

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    private val pageViewModel by viewModels<PageViewModel>()
    private lateinit var gameNumbers: ArrayList<Int>
    private lateinit var refreshButton: Button
    var testing: Int = Utils.index

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel.apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
        pageViewModel.getNumbersList()

    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        val recyclerView: RecyclerView = root.findViewById(R.id.ball_rv)
        refreshButton = root.findViewById(R.id.refresh_button)
        refreshButton.setOnClickListener {
            updateNumbers()
            recyclerView.adapter = BallListAdapter(gameNumbers)
        }

        gameNumbers = pageViewModel.numbersList
        recyclerView.adapter = BallListAdapter(gameNumbers)
        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        return root
    }

    private fun updateNumbers() {
        pageViewModel.getNumbersList()
        gameNumbers = pageViewModel.numbersList
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, testing)
                }
            }
        }
    }
}
