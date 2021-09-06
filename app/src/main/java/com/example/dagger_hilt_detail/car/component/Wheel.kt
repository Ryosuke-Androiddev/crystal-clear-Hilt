package com.example.dagger_hilt_detail.car.component

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor(){

    fun getWheel(){
        Log.d("main", "wheel called ...")
    }
}