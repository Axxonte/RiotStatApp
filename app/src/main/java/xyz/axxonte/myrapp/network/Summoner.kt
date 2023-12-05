package xyz.axxonte.myrapp.network

import com.google.gson.annotations.SerializedName

data class Summoner(

	@field:SerializedName("accountId")
	val accountId: String,

	@field:SerializedName("profileIconId")
	val profileIconId: Int,

	@field:SerializedName("revisionDate")
	val revisionDate: Long,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("puuid")
	val puuid: String,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("summonerLevel")
	val summonerLevel: Int,

	val ranks : List<Rank>?
)
