package xyz.axxonte.jacquesnoirremastered.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import xyz.axxonte.myrapp.network.Rank
import xyz.axxonte.myrapp.network.Summoner

private const val TOKEN: String = "RGAPI-01ee26a8-bf5b-4711-ae86-9a3d8c85e711"

interface ApiInterface {


    @GET("/lol/summoner/v4/summoners/by-name/{summonerName}?api_key=${TOKEN}")
    suspend fun getSummoner(@Path("summonerName") summonerName: String): Response<Summoner>

    @GET("/lol/league/v4/entries/by-summoner/{encryptedSummonerId}?api_key=${TOKEN}")
    suspend fun getRanks(@Path("encryptedSummonerId") encryptedSummonerId: String): Response<List<Rank>>

//    @GET("cards/{num}")
//    suspend fun getCardById(@Path("num") num: Int): Response<>
//
//    @GET("name/{name}")
//    suspend fun getCardsByName(@Path("name") name : String): Response<MutableList<>>
//    @GET("sets")
//    suspend fun getSets(): Response<MutableList<CardSet>>
}