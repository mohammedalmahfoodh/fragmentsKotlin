package com.ecutbildning.fragments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.support.v4.view.ViewPager



class MainActivity : AppCompatActivity() {
    val TAG:String="MainActivity"
    private var mViewPager: ViewPager? = null
    private val mSectionsStatePagerAdapter= SectionsStatePagerAdapter(supportFragmentManager)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: Started.")
        mViewPager = findViewById(R.id.container)
        if (mViewPager != null) {
            setupViewPager(mViewPager!!)
        }

    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = SectionsStatePagerAdapter(supportFragmentManager)
        adapter.addFragment(Fragment1(), "Fragment1")
        adapter.addFragment(Fragment2(), "Fragment2")
        adapter.addFragment(Fragment3(), "Fragment3")
        viewPager.adapter = adapter
    }

    fun setViewPager(fragmentNumber: Int) {
        mViewPager?.setCurrentItem(fragmentNumber)
    }
}
