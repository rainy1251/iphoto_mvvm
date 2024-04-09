package com.zhuyi.iphoto.ui.home

import com.zhuyi.iphoto.base.BaseRepository
import com.zhuyi.iphoto.http.Banner
import com.zhuyi.iphoto.http.ResponseData
import com.zhuyi.iphoto.http.RetrofitClient

class BannerRepository : BaseRepository() {

    suspend fun getBanner(): ResponseData<List<Banner>> = request {
        RetrofitClient.service.getBanner()
    }
}