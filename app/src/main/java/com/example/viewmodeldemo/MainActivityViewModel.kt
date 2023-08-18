package com.example.viewmodeldemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
//    var count = 0
    var count = MutableLiveData<Int>()
    init{
        count.value = 0
    }
    fun updateCount(){
//        ++count
        count.value = (count.value)?.plus(1)
    }
}