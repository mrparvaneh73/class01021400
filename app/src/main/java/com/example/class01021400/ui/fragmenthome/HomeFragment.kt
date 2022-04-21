package com.example.class01021400.ui.fragmenthome

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.class01021400.R
import com.example.class01021400.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment: Fragment(R.layout.fragment_home) {
    private var _binding:FragmentHomeBinding?=null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentHomeBinding.bind(view)

    }
}