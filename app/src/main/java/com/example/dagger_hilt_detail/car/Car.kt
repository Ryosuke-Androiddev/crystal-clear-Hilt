package com.example.dagger_hilt_detail.car

import android.util.Log
import com.example.dagger_hilt_detail.car.component.Engine
import com.example.dagger_hilt_detail.car.component.Wheel
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, private val wheel: Wheel) {

    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("main","getCar is Called")
    }
}