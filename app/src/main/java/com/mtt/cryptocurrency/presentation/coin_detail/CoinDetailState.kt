package com.mtt.cryptocurrency.presentation.coin_detail

import com.mtt.cryptocurrency.domain.models.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)