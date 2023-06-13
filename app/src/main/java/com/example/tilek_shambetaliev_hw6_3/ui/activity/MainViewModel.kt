package com.example.tilek_shambetaliev_hw6_3.ui.activity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var count = 0
    private var plus = ""
    val mCounter = MutableLiveData<Int>()
    val operation = MutableLiveData<String>()

    fun increment() {
        count++
        mCounter.value = count
        plus = "\n+$plus"
        operation.value = plus
    }

    fun decrement() {
        count--
        mCounter.value = count
        plus = "\n-$plus"
        operation.value = plus
    }
}