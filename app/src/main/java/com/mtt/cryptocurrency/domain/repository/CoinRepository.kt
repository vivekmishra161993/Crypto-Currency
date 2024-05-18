package com.mtt.cryptocurrency.domain.repository

import com.mtt.cryptocurrency.data.remote.dto.CoinDetailDto
import com.mtt.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto

}