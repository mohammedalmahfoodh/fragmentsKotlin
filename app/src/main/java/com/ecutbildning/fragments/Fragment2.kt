package com.ecutbildning.fragments

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class Fragment2: Fragment() {
    private var btnNavFrag1: Button? = null
    private var btnNavFrag2: Button? = null
    private var btnNavFrag3: Button? = null
    private var btnNavSecondActivity: Button? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment2_layout, container, false)
        btnNavFrag1 = view.findViewById<View>(R.id.btnNavFrag1) as Button
        btnNavFrag2 = view.findViewById<View>(R.id.btnNavFrag2) as Button
        btnNavFrag3 = view.findViewById<View>(R.id.btnNavFrag3) as Button
        btnNavSecondActivity = view.findViewById<View>(R.id.btnNavSecondActivity) as Button
        Log.d(TAG, "onCreateView: started.")

        btnNavFrag1!!.setOnClickListener {
            Toast.makeText(activity, "Going to Fragment 1", Toast.LENGTH_SHORT).show()

            (activity as MainActivity).setViewPager(0)
        }

        btnNavFrag2!!.setOnClickListener {
            Toast.makeText(activity, "Going to Fragment 2", Toast.LENGTH_SHORT).show()
            (activity as MainActivity).setViewPager(1)
        }

        btnNavFrag3!!.setOnClickListener {
            Toast.makeText(activity, "Going to Fragment 3", Toast.LENGTH_SHORT).show()
            (activity as MainActivity).setViewPager(2)
        }

        btnNavSecondActivity!!.setOnClickListener {
            Toast.makeText(activity, "Going to Fragment 1", Toast.LENGTH_SHORT).show()
            val intent = Intent(activity, SeconedActivity::class.java)
            startActivity(intent)
        }


        return view
    }

    companion object {
        private val TAG = "Fragment2"
    }
}