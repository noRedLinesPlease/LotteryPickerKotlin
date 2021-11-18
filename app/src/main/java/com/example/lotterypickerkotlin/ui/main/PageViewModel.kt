package com.example.lotterypickerkotlin.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lotterypickerkotlin.GenerateBallNumbers

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
     var numbersList = ArrayList<Int>()

    fun setIndex(index: Int) {
        _index.value = index
    }

    fun getNumbersList() {
        val generateObject = GenerateBallNumbers()
        when(_index.value){
            1 -> numbersList = generateObject.setPick3()
            2 -> numbersList = generateObject.setPick4()
        }

    }
}