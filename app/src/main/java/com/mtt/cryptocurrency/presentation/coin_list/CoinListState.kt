package com.mtt.cryptocurrency.presentation.coin_list

import com.mtt.cryptocurrency.domain.models.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)