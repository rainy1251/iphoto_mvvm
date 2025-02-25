package com.zhuyi.iphoto.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel>(
    private val inflate: (LayoutInflater, ViewGroup?, Boolean) -> VB,
    private val viewModelClass: Class<VM>?
) : Fragment() {

    private val viewModel by lazy {
        val viewModelProvider = ViewModelProvider(owner = this)
        viewModelClass?.let {
            viewModelProvider[it]
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = inflate(inflater, container, false)
        initFragment(binding, viewModel)
        return binding.root
    }

    abstract fun initFragment(binding: VB, viewModel: VM?)

}