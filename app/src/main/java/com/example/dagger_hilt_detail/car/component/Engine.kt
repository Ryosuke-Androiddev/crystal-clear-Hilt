package com.example.dagger_hilt_detail.car.component

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {

    fun getEngine(){
        Log.d("main","Engine started ...")
    }
}