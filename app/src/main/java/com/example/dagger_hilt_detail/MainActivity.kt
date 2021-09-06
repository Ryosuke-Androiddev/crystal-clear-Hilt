package com.example.dagger_hilt_detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger_hilt_detail.car.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var car: Car

    @Inject
    lateinit var main: Main

    @Inject
    lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //car.getCar()

        main.getName()

        person.getName()
    }
}