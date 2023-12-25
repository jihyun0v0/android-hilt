package com.jihyun.android_hilt.data.remote.datasource

import com.jihyun.android_hilt.data.model.ReqresResponseDto

interface JiHyunRemoteDataSource {
    fun getDate() : ReqresResponseDto
}