package com.ecutbildning.fragments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class SeconedActivity : AppCompatActivity() {
    val TAG:String="Seconed Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        Log.d(TAG, "onCreate: started.")
    }
    }
