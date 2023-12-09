package xyz.axxonte.myrapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import xyz.axxonte.jacquesnoirremastered.network.ApiClient
import xyz.axxonte.myrapp.network.Rank
import xyz.axxonte.myrapp.network.Summoner

class AppViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<AppState>(AppState.Idle)
    val uiState = _uiState.asStateFlow()

    fun getFirstSummoner(summonerName: String) {

        _uiState.update { AppState.Loading }

        viewModelScope.launch {
            runBlocking {
                viewModelScope.async {
                    if (summonerName.isBlank() || summonerName.isEmpty()) {
                        _uiState.update { AppState.Error(error = "Vous devez entrer un nom !") }
                    } else {
                        val summonerAnswer = ApiClient.apiService.getSummoner(summonerName)
                        if (summonerAnswer.code() <= 199 || summonerAnswer.code() >= 300) {
                            _uiState.update { AppState.Error(error = summonerAnswer.message()) }
                        } else {
                            val response = summonerAnswer.body()
                            if (response != null) {

                                val responseRanked = Summoner(
                                    accountId = response.accountId,
                                    profileIconId = response.profileIconId,
                                    revisionDate = response.revisionDate,
                                    name = response.name,
                                    puuid = response.puuid,
                                    id = response.id,
                                    summonerLevel = response.summonerLevel,
                                    ranks = getRanks(id = response.id)
                                )

                                _uiState.update {
                                    AppState.Success(
                                        listOf(responseRanked)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    fun getNextSummoner(summonerName: String, olderResults: List<Summoner>) {
        runBlocking {
            viewModelScope.async {
                if (summonerName.isBlank() || summonerName.isEmpty()) {
                    _uiState.update { AppState.Error(error = "Vous devez entrer un nom !") }
                } else {
                    val brutAnswer = ApiClient.apiService.getSummoner(summonerName)
                    if (brutAnswer.code() <= 199 || brutAnswer.code() >= 300) {
                        _uiState.update { AppState.Error(error = brutAnswer.message()) }
                    } else {
                        val response = brutAnswer.body()
                        if (response != null) {
                            response.copy(ranks = getRanks(response.id))

                            val responseRanked = Summoner(
                                accountId = response.accountId,
                                profileIconId = response.profileIconId,
                                revisionDate = response.revisionDate,
                                name = response.name,
                                puuid = response.puuid,
                                id = response.id,
                                summonerLevel = response.summonerLevel,
                                ranks = getRanks(id = response.id)
                            )
                            println(olderResults)
                            val newSummonersList = olderResults + listOf(responseRanked)
                            _uiState.update {
                                AppState.Success(
                                    newSummonersList
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    suspend fun getRanks(id: String): List<Rank> {
        val response = ApiClient.apiService.getRanks(id)
        if (response.code() <= 199 || response.code() >= 300) {
            _uiState.update { AppState.Error(response.message()) }
        }
        return response.body() ?: listOf()
    }
}

sealed interface AppState {
    object Idle : AppState

    data class Success(
        val searchedSummoners: List<Summoner>
    ) : AppState

    object Loading : AppState

    data class Error(
        val error: String,
    ) : AppState
}