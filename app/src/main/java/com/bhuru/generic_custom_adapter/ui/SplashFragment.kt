package com.bhuru.generic_custom_adapter.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.bhuru.generic_custom_adapter.R
import com.bhuru.generic_custom_adapter.databinding.FragmentSplashBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : Fragment() {


    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_splash, container, false)




        return binding.root
    }


    override fun onResume() {
        super.onResume()

        GlobalScope.launch(context = Dispatchers.Main) {

            delay(3000)
            Log.i("resume", "onResume: Home")

            // code reduce always
            findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToHomeFragment())

        }
    }

}