package com.example.dagger_hilt_detail

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton

class Person @Inject constructor(
    @LName
    private val lName: String,
    @FName
    private val fName: String
    ) {

    fun getName(){
        Log.d("main", "my name is $fName $lName")
    }
}

@Module
@InstallIn(SingletonComponent::class)
class PersonAppModule{

    @Provides
    @FName
    fun getFName(): String = "Ryosuke"

    @Provides
    @LName
    fun getLName(): String = "Nikushi"
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName