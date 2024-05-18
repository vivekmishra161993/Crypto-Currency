package com.mtt.cryptocurrency.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.mtt.cryptocurrency.domain.models.Coin


data class CoinDto(

    val symbol: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val id: String,
    val type: String
)

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}

