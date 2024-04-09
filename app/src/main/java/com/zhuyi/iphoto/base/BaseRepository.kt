package com.zhuyi.iphoto.base

import android.util.Log
import com.zhuyi.iphoto.http.ResponseData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

open class BaseRepository {
 
    suspend fun <T : Any> request(call: suspend () -> ResponseData<T>): ResponseData<T> {
        return withContext(Dispatchers.IO) {
            call.invoke()
        }.apply {
            Log.e("接口返回数据---------->,${this.errorCode}","")
            when (errorCode) {
                0, 200 -> this
                100, 401 -> ""
                403 -> ""
                404 -> ""
                500 -> ""
                else -> ""
 
            }
        }
    }
 
}

