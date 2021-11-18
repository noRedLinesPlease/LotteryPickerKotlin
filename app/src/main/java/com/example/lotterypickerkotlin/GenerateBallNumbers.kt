package com.example.lotterypickerkotlin

import kotlin.random.Random

class GenerateBallNumbers : ArrayList<Int>() {
    var listSize = 0
    var gameNumberList = ArrayList<Int>()

    fun setPick3() : ArrayList<Int>{
        gameNumberList.clear()
        for (index in 0 until 3) {
            val number = Random.nextInt(1, 9)
            gameNumberList.add(number)
        }
        listSize = gameNumberList.size
        return gameNumberList
    }

    fun setPick4(): ArrayList<Int> {
        gameNumberList.clear()
        for (index in 0 until 4) {
            val number = Random.nextInt(1, 9)
            gameNumberList.add(number)
        }
        listSize = gameNumberList.size
        return gameNumberList
    }

//    fun setCash5() : ArrayList<Int>{
//
//    }
}