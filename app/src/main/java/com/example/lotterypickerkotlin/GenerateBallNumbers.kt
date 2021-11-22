package com.example.lotterypickerkotlin

import kotlin.random.Random

class GenerateBallNumbers : ArrayList<Int>() {
    var listSize = 0
    var gameNumberList = ArrayList<Int>()

    fun setPick3(): ArrayList<Int> {
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

    fun setCash5(): ArrayList<Int> {
        gameNumberList.clear()

        for (index in 0 until 5) {
            val number = Random.nextInt(1, 41)
            gameNumberList.add(number)
        }
        listSize = gameNumberList.size

        return gameNumberList

    }

    fun setMegaMillion(): ArrayList<Int> {
        gameNumberList.clear()
        var index = 0

        while (index < 6) {
            if (index == 6) {
                val megaball = Random.nextInt(1, 25)
                gameNumberList.add(megaball)
                break
            }
            val number = Random.nextInt(1, 70)
            if (index >= 0) {
                val sameNumber: Boolean = gameNumberList.contains(number)
                if (!sameNumber) {
                    gameNumberList.add(number)
                    index++
                } else {
                    index--
                }
            }
        }
        gameNumberList.sort()
        listSize = gameNumberList.size

        return gameNumberList
    }
}