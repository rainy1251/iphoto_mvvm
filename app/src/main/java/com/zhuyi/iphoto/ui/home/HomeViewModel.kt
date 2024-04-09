package com.zhuyi.iphoto.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zhuyi.iphoto.base.BaseViewModel
import com.zhuyi.iphoto.http.Banner

class HomeViewModel : BaseViewModel() {

    private val repository by lazy {
        BannerRepository()
    }

    private val bannerData by lazy {
        MutableLiveData<List<Banner>>()
    }

    fun getBanner(): LiveData<List<Banner>> {

        launchUI {
            val result = repository.getBanner()
            bannerData.value = result.data

        }

        return bannerData

    }
}