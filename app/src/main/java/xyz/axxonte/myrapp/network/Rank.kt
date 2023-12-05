package xyz.axxonte.myrapp.network

import com.google.gson.annotations.SerializedName

data class Rank(

	@field:SerializedName("wins")
	val wins: Int? = null,

	@field:SerializedName("freshBlood")
	val freshBlood: Boolean? = null,

	@field:SerializedName("summonerName")
	val summonerName: String? = null,

	@field:SerializedName("leaguePoints")
	val leaguePoints: Int? = null,

	@field:SerializedName("losses")
	val losses: Int? = null,

	@field:SerializedName("inactive")
	val inactive: Boolean? = null,

	@field:SerializedName("tier")
	val tier: String? = null,

	@field:SerializedName("veteran")
	val veteran: Boolean? = null,

	@field:SerializedName("leagueId")
	val leagueId: String? = null,

	@field:SerializedName("hotStreak")
	val hotStreak: Boolean? = null,

	@field:SerializedName("queueType")
	val queueType: String? = null,

	@field:SerializedName("rank")
	val rank: String? = null,

	@field:SerializedName("summonerId")
	val summonerId: String? = null
)
