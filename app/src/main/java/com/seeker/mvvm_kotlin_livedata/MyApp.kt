package com.seeker.mvvm_kotlin_livedata

import android.app.Application

class MyApp: Application() {

    companion object{
        lateinit var appInstance:MyApp
    }
    override fun onCreate() {
        appInstance = this
        super.onCreate()
    }

}