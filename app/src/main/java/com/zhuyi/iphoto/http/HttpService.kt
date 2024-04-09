package com.zhuyi.iphoto.http

import retrofit2.http.GET

interface HttpService {
    @GET("banner/json")
    suspend fun getBanner(): ResponseData<List<Banner>>
}
