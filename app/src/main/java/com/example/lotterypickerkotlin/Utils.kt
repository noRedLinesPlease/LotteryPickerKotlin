package com.example.lotterypickerkotlin

import android.content.Context
import android.content.SharedPreferences

class Utils {
    fun saveNumbers(context: Context, lottoNumbers: Set<String>){
        val sharedPrefs: SharedPreferences  = context.getSharedPreferences("numbers",Context.MODE_PRIVATE)
            sharedPrefs.edit()
                .putStringSet("numbers",lottoNumbers)
                .apply()
    }

    fun removeNumbers(context: Context, lottoNumbers: List<Int>){
        val sharedPrefs: SharedPreferences  = context.getSharedPreferences("numbers",Context.MODE_PRIVATE)
        var index = 0
        while(index < lottoNumbers.size){
            sharedPrefs.edit()
                .remove("numbers")
                .apply()
            index++
        }

    }

}