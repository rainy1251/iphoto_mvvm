package com.zhuyi.iphoto.ui.dashboard

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zhuyi.iphoto.base.BaseViewModel
import com.zhuyi.iphoto.http.Banner
import com.zhuyi.iphoto.ui.home.BannerRepository

class DashboardViewModel : BaseViewModel() {

//    private val _text = MutableLiveData<String>().apply {
//        value = "This is hahh"
//    }
//    val hha: LiveData<String> = _text


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