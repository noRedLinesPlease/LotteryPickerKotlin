package com.example.lotterypickerkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.lotterypickerkotlin.fragments.Cash5Fragment
import com.example.lotterypickerkotlin.fragments.Pick3Fragment
import com.example.lotterypickerkotlin.fragments.Pick4Fragment
import com.example.lotterypickerkotlin.ui.main.TopTabSectionsAdapter
import com.example.lotterypickerkotlin.ui.main.Utils
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = TopTabSectionsAdapter(this, supportFragmentManager, lifecycle)
        val viewPager: ViewPager2 = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                Utils.index = tabs.selectedTabPosition
                sectionsPagerAdapter.createFragment(tabs.selectedTabPosition)
//                when(Utils.index){
//                    0 -> Pick3Fragment()
//                    1 -> Pick4Fragment()
//                    2 -> Cash5Fragment()
//                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = sectionsPagerAdapter.getPageTitle(position)
            viewPager.currentItem = 0

        }.attach()

    }
}