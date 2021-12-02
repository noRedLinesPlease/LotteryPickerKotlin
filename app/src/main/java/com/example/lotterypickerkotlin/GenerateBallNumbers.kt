package com.example.lotterypickerkotlin

import kotlin.random.Random

class GenerateBallNumbers : ArrayList<String>() {
    var listSize = 0
    var gameNumberList = ArrayList<String>()

    fun setPick3(): ArrayList<String> {
        gameNumberList.clear()

        for (index in 0 until 3) {
            val number = Random.nextInt(1, 10)
            gameNumberList.add(number.toString())
        }
        listSize = gameNumberList.size

        return gameNumberList
    }

    fun setPick4(): ArrayList<String> {
        gameNumberList.clear()

        for (index in 0 until 4) {
            val number = Random.nextInt(1, 10)
            gameNumberList.add(number.toString())
        }
        listSize = gameNumberList.size

        return gameNumberList
    }

    fun setCash5(): ArrayList<String> {
        gameNumberList.clear()
        var index = 0

        while (index < 5) {
            val number = Random.nextInt(1, 42)
            val sameNumber = gameNumberList.contains(number)
            if (!sameNumber) {
                gameNumberList.add(number.toString())
                index++
            } else {
                continue
            }
        }
        gameNumberList.sort()
        listSize = gameNumberList.size

        return gameNumberList
    }

    fun setMegaMillion(): ArrayList<String> {
        gameNumberList.clear()
        var index = 0

        while (index < 6) {
            if (index == 5) {
                val megaball = Random.nextInt(1, 26)
                gameNumberList.add(megaball.toString())
                break
            }
            val number = Random.nextInt(1, 71)
            if (index >= 0) {
                val sameNumber: Boolean = gameNumberList.contains(number)
                if (!sameNumber) {
                    gameNumberList.add(number.toString())
                    index++
                    gameNumberList.sort()
                } else {
                    continue
                }
            }
        }

        listSize = gameNumberList.size

        return gameNumberList
    }

    fun setPowerball(): ArrayList<String> {
        gameNumberList.clear()
        var index = 0

        while (index < 6) {
            if (index == 5) {
                val powerball = Random.nextInt(1, 27)
                gameNumberList.add(powerball.toString())
                break
            }
            val number = Random.nextInt(1, 70)
            if (index >= 0) {
                val sameNumber: Boolean = gameNumberList.contains(number)
                if (!sameNumber) {
                    gameNumberList.add(number.toString())
                    index++
                    gameNumberList.sort()
                } else {
                    continue
                }
            }
        }
        listSize = gameNumberList.size

        return gameNumberList
    }

    fun setCash4Life(): ArrayList<String> {
        gameNumberList.clear()
        var index = 0

        while (index < 6) {
            if (index == 5) {
                val cashball = Random.nextInt(1, 5)
                gameNumberList.add(cashball.toString())
                break
            }
            val number = Random.nextInt(1, 61)
            if (index >= 0) {
                val sameNumber: Boolean = gameNumberList.contains(number)
                if (!sameNumber) {
                    gameNumberList.add(number.toString())
                    index++
                    gameNumberList.sort()
                } else {
                    continue
                }
            }
        }
        listSize = gameNumberList.size

        return gameNumberList
    }
}