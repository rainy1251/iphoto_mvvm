package com.zhuyi.iphoto.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.zhuyi.iphoto.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        initData(homeViewModel)
        return root
    }

    private fun initData(homeViewModel:HomeViewModel) {
        val banner = homeViewModel.getBanner()
        Log.i("rainlaunchUI","++++${banner.value?.size}")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}