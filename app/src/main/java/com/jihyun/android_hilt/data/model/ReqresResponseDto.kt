package com.jihyun.android_hilt.data.model

import com.jihyun.android_hilt.domain.JiHyun
import kotlinx.serialization.Serializable

@Serializable
data class ReqresResponseDto(
    val `data`: List<Data>,
    val page: Int,
    val per_page: Int,
    val support: Support,
    val total: Int,
    val total_pages: Int
) {
    @Serializable
    data class Data(
        val avatar: String,
        val email: String,
        val first_name: String,
        val id: Int,
        val last_name: String
    )

    @Serializable
    data class Support(
        val text: String,
        val url: String
    )
}

fun ReqresResponseDto.toJiHyunEntity() =
    JiHyun(
        page = page,
        total = total,
        data = data[0]
    )

