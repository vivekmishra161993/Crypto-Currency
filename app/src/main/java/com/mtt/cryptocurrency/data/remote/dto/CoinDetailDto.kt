package com.mtt.cryptocurrency.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.mtt.cryptocurrency.domain.models.CoinDetail

data class CoinDetailDto(
	val symbol: String,
	@SerializedName("is_active")
	val isActive: Boolean,
	@SerializedName("is_new")
	val isNew: Boolean,
	@SerializedName("proof_type")
	val proofType: String,
	val firstDataAt: String,
	val description: String,
	val team: List<TeamMember>,
	val linksExtended: List<LinksExtendedItem>,
	val type: String,
	val message: String,
	val tags: List<TagsItem>,
	val lastDataAt: String,
	val whitepaper: Whitepaper,
	val orgStructure: String,
	val hardwareWallet: Boolean,
	val name: String,
	val developmentStatus: String,
	val hashAlgorithm: String,
	val rank: Int,
	val logo: String,
	val startedAt: String,
	val links: Links,
	val id: String,
	val openSource: Boolean
)

data class LinksExtendedItem(
	val type: String,
	val url: String,
	val stats: Stats
)

data class Stats(
	val followers: Int,
	val contributors: Int,
	val stars: Int,
	val subscribers: Int
)

data class Whitepaper(
	val thumbnail: String,
	val link: String
)

data class Links(
	val youtube: List<String>,
	val website: List<String>,
	val facebook: List<String>,
	val explorer: List<String>,
	val reddit: List<String>,
	val sourceCode: List<String?>
)

data class TeamMember(
	val name: String,
	val id: String,
	val position: String
)

data class TagsItem(
	val coinCounter: Int,
	val icoCounter: Int,
	val name: String,
	val id: String
)

fun CoinDetailDto.toCoinDetail(): CoinDetail {
	return CoinDetail(
		coinId = id,
		name = name,
		description = description,
		symbol = symbol,
		rank = rank,
		isActive = isActive,
		tags = tags.map { it.name },
		team = team
	)
}

