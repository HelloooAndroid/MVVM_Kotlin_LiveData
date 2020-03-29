package com.seeker.mvvm_kotlin_livedata

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class UserActivity : AppCompatActivity() {

    lateinit var userViewModel :UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userDataTV :TextView= findViewById(R.id.userData);

        /*Initializa Viewmodel*/
        userViewModel =
            ViewModelProviders.of(this).get(UserViewModel::class.java)

        /*Observe live data
        * iflive data changes, then observe callBack will receive updated User model */
        userViewModel.usersData.observe(this, Observer {
            /*Set data to view*/
            userDataTV.text=it.username +
                    "\n"+it.gender+
                    "\n"+it.email+
                    "\n"+it.contact+
                    "\n"+it.address
        })


        userViewModel.getUserdata()
    }
}
