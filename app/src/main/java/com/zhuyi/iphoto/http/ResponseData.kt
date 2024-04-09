package com.zhuyi.iphoto.http

//接受数据的基类
data class ResponseData<out T>(
 
    val errorCode: Int,
    val errorMsg: String,
    val data: T
)
