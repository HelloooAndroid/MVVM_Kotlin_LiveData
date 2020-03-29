package com.seeker.mvvm_kotlin_livedata

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class UserViewModel(application: Application) : AndroidViewModel(application) {

    var usersData = MutableLiveData<User>()

    fun getUserdata(){
        /*Make NW call to get data*/
        /*instead, m generating data here only!*/
        Thread.sleep(2000)
        var user = User("Pratim P","M","pratim@gmail.com","9223456108","Navi mumbai")
        usersData.value=user
    }
}