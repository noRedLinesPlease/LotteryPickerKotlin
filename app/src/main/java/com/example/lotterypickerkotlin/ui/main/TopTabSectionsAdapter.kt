package com.example.lotterypickerkotlin.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lotterypickerkotlin.BallListAdapter
import com.example.lotterypickerkotlin.MainActivity
import com.example.lotterypickerkotlin.R
import com.example.lotterypickerkotlin.fragments.*
import java.lang.reflect.Array.newInstance

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3,
    R.string.tab_text_4,
    R.string.tab_text_5,
    R.string.tab_text_7
)

class TopTabSectionsAdapter(
    private val context: Context,
    val testingList: List<Fragment>,
    fm: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle) {


    fun getPageTitle(position: Int): CharSequence {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getItemCount(): Int {
        return TAB_TITLES.size
    }

    override fun createFragment(position: Int): Fragment {
//      return when(position) {
//          0 -> Pick3Fragment()
//          1 -> Pick4Fragment()
//          2 -> Cash5Fragment()
//          3 -> MegaMillionFragment()
//          4 -> PowerballFragment()
//          5 -> Cash4LifeFragment()
//          else -> Pick3Fragment()
//      }

        return testingList[position]
    }
}