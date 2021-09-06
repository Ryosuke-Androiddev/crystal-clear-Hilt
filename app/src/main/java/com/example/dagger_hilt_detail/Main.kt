package com.example.dagger_hilt_detail

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface People{
    fun getName()
}

//class PeopleImpl: People {
//    override fun getName() {
//        Log.d("main","my name is Ryosuke")
//    }
//}

class PeopleImpl @Inject constructor(private val name: String): People {
    override fun getName() {
        Log.d("main","my name is $name")
    }
}

//class Main constructor(private val people: People){
//    fun getName(){
//        people.getName()
//    }
//}

class Main @Inject constructor(private val people: People){
    fun getName(){
        people.getName()
    }
}

//@Module
//@InstallIn(SingletonComponent::class)
//abstract class AppModule{
//
//    @Binds
//    @Singleton
//    abstract fun binding(
//        peopleImpl: PeopleImpl
//    ): People
//}

@Module
@InstallIn(SingletonComponent::class)
class AppModule{

    @Provides
    @Singleton
    fun binding(name: String): People = PeopleImpl(name)
}