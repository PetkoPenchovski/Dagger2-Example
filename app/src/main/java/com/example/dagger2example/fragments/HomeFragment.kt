package com.example.dagger2example.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG,"is loaded")
    }
    companion object {
        const val TAG = "HomeFragment"
    }
}