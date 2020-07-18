package com.example.dagger2example.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.dagger2example.R
import com.example.dagger2example.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<HomeFragmentBinding>(
            inflater, R.layout.home_fragment,container,false
        )
        binding.txtVw
        Log.d(TAG,"is LOADED")
        return binding.root
    }

    companion object {
        const val TAG = "HomeFragment"
    }
}