package com.example.lotterypickerkotlin.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lotterypickerkotlin.GenerateBallNumbers

class PageViewModel : ViewModel() {
     val _index = MutableLiveData<Int>()
     var numbersList = ArrayList<Int>()

    fun setIndex(index: Int) {
        _index.value = index
    }

    fun getNumbersList() {
        val generateObject = GenerateBallNumbers()
        when(_index.value){
            0 -> numbersList = generateObject.setPick3()
            1 -> numbersList = generateObject.setPick4()
            2 -> numbersList = generateObject.setCash5()
            3 -> numbersList = generateObject.setMegaMillion()
            }
        }
}