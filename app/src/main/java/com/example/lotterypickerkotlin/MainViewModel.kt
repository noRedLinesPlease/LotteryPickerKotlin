package com.example.lotterypickerkotlin

import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {
    var gameNumberList = ArrayList<Int>()

    fun setPick3(): ArrayList<Int> {
        gameNumberList.clear()

        for (index in 0 until 3) {
            val number = Random.nextInt(1, 10)
            gameNumberList.add(number)
        }

        return gameNumberList
    }

    fun setPick4(): ArrayList<Int> {
        gameNumberList.clear()

        for (index in 0 until 4) {
            val number = Random.nextInt(1, 10)
            gameNumberList.add(number)
        }

        return gameNumberList
    }

    fun setCash5(): ArrayList<Int> {
        gameNumberList.clear()
        var index = 0

        while (index < 5) {
            val number = Random.nextInt(1, 42)
            val sameNumber = number in gameNumberList
            if (!sameNumber) {
                gameNumberList.add(number)
                index++
            } else {
                continue
            }
        }
        gameNumberList.sort()

        return gameNumberList
    }

    fun setMegaMillion(): ArrayList<Int> {
        gameNumberList.clear()
        var index = 0

        while (index < 6) {
            if (index == 5) {
                val megaball = Random.nextInt(1, 26)
                gameNumberList.add(megaball)
                break
            }
            val number = Random.nextInt(1, 71)
            if (index >= 0) {
                val sameNumber: Boolean = number in gameNumberList
                if (!sameNumber) {
                    gameNumberList.add(number)
                    index++
                    gameNumberList.sort()
                } else {
                    continue
                }
            }
        }

        return gameNumberList
    }

    fun setPowerball(): ArrayList<Int> {
        gameNumberList.clear()
        var index = 0

        while (index < 6) {
            if (index == 5) {
                val powerball = Random.nextInt(1, 27)
                gameNumberList.add(powerball)
                break
            }
            val number = Random.nextInt(1, 70)
            if (index >= 0) {
                val sameNumber: Boolean = number in gameNumberList
                if (!sameNumber) {
                    gameNumberList.add(number)
                    index++
                    gameNumberList.sort()
                } else {
                    continue
                }
            }
        }

        return gameNumberList
    }

    fun setCash4Life(): ArrayList<Int> {
            gameNumberList.clear()

            var index = 0

            while (index < 6) {
                if (index == 5) {
                    val cashBall = Random.nextInt(1, 5)
                    gameNumberList.sort()
                    gameNumberList.add(cashBall)
                    break
                }
                val number = Random.nextInt(1, 61)
                if (index >= 0) {
                    val sameNumber: Boolean = number in gameNumberList
                    if (!sameNumber) {
                        gameNumberList.add(number)
                        index++
                    } else {
                        continue
                    }
                }
            }

        return gameNumberList
    }
}