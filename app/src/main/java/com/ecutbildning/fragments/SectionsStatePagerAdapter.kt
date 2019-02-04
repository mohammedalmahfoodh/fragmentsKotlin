package com.ecutbildning.fragments

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class SectionsStatePagerAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager) {

    private var mFragmentList = mutableListOf<Fragment>()
    private var mFragmentTitleList = mutableListOf<String>()
    override fun getItem(p0: Int): Fragment {
     return mFragmentList.get(p0)
    }

    override fun getCount(): Int {
      return mFragmentList.size
    }
    fun addFragment(fragment:Fragment,title:String){
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }
}