package com.jihyun.android_hilt.data.remote.repository

import com.jihyun.android_hilt.data.model.toJiHyunEntity
import com.jihyun.android_hilt.data.remote.datasource.JiHyunRemoteDataSource
import com.jihyun.android_hilt.domain.JiHyun
import com.jihyun.android_hilt.domain.JiHyunRepository
import javax.inject.Inject

class JiHyunRepositoryImpl @Inject constructor(private val jiHyunRemoteDataSource: JiHyunRemoteDataSource) :
    JiHyunRepository {
    override fun getDate(): JiHyun {
        return jiHyunRemoteDataSource.getDate().toJiHyunEntity()
    }

}