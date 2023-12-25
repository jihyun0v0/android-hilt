package com.jihyun.android_hilt.presentation.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.jihyun.android_hilt.data.model.ReqresResponseDto
import com.jihyun.android_hilt.data.remote.service.servicePool
import retrofit2.Call
import retrofit2.Response

class MainViewModel : ViewModel() {
    fun getUser() {
        servicePool.reqreseService.getUser(2)
            .enqueue(object : retrofit2.Callback<ReqresResponseDto> {
                override fun onResponse(
                    call: Call<ReqresResponseDto>,
                    response: Response<ReqresResponseDto>
                ) {
                    Log.e("success", call.toString())
                }

                override fun onFailure(call: Call<ReqresResponseDto>, t: Throwable) {
                    Log.e("fail", t.toString())
                }

            })
    }
}
