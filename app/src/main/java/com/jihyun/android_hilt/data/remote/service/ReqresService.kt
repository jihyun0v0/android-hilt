package com.jihyun.android_hilt.data.remote.service

import com.jihyun.android_hilt.data.model.ReqresResponseDto
import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

interface ReqresService {
    @POST("/api/users")
    fun getUser(
        @Query("page") page: Int
    ): Call<ReqresResponseDto>
}