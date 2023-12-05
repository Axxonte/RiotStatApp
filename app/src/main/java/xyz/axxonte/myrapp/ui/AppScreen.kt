package xyz.axxonte.myrapp.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import xyz.axxonte.myrapp.R
import xyz.axxonte.myrapp.network.Rank
import xyz.axxonte.myrapp.network.Summoner
import xyz.axxonte.myrapp.ui.theme.MyRAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScreen(appViewModel: AppViewModel = viewModel()) {
    val appUiState by appViewModel.uiState.collectAsState()


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
//                            .height(32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "LoL NoLife Stats"
                        )
                    }
                },
                modifier = Modifier.background(MaterialTheme.colorScheme.secondaryContainer),
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.primaryContainer)

            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = it),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var recherche by remember { mutableStateOf("") }


            OutlinedTextField(
                value = recherche,
                onValueChange = { type -> recherche = type },
                singleLine = true,
                label = {
                        Text("Entrez un nom de joueur")
                },
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Search,
                    autoCorrect = false,
                    capitalization = KeyboardCapitalization.None
                ),
                keyboardActions = KeyboardActions(onSearch = {
                    if (appUiState is AppState.Success) {
                        appViewModel.getNextSummoner(recherche, (appUiState as AppState.Success).searchedSummoners)
                    } else {
                        appViewModel.getFirstSummoner(
                            recherche
                        )
                    }
                })
            )
            

            OutlinedButton(onClick = {
                if (appUiState is AppState.Success){
                    if ((appUiState as AppState.Success).searchedSummoners.isNotEmpty()) appViewModel.getNextSummoner(recherche, (appUiState as AppState.Success).searchedSummoners)
                } else {
                    appViewModel.getFirstSummoner(recherche)
                }
                
            }) {
                Text(text = "Rechercher")
            }

            when (val state = appUiState) {
                is AppState.Error -> {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(vertical = 16.dp),
                        contentAlignment = Alignment.TopCenter
                    )
                    {
                        Text(text = state.error)
                    }
                }

                AppState.Idle -> {
                    Column {
                        Spacer(modifier = Modifier.padding(16.dp))
                        Text("Aucun nom de joueur saisi.")
                    }

                }

                AppState.Loading -> {
                    Box(
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator(modifier = Modifier.padding(16.dp))
                    }
                }

                is AppState.Success -> {
                    LazyColumn {
                        items(state.searchedSummoners){ summoner ->
                            SummonerInfos(summoner = summoner)
                        }
                    }

                }
            }
        }
    }
}

@Composable
fun SummonerInfos(modifier: Modifier = Modifier, summoner: Summoner) {
    var isDeployed by remember { mutableStateOf(false) }
    val ranks = summoner.ranks ?: listOf()
    OutlinedCard(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable {
                isDeployed = !isDeployed
            },
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primaryContainer)
    ) {
        Text(
            text = summoner.name,
            modifier = Modifier.padding(16.dp)
        )
        if (isDeployed) {
            Divider(modifier = Modifier.padding(bottom = 16.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Row {
                        Text(text = "Niveau : ")
                        Text(text = summoner.summonerLevel.toString())
                    }
                    Spacer(modifier = Modifier.padding(12.dp))

                    if (ranks.isEmpty()) {
                        Text(text = "Ce joueur n'est pas classé.")
                    } else {
                        Column(
                            content = {
                                for (it in ranks) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(0.60f),
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Column {
                                            if (it.queueType == "RANKED_FLEX_SR") {
                                                Text(text = "Flexible : ")
                                            } else {
                                                Text(text = "Solo Queue : ")
                                            }
                                            Row(
                                                horizontalArrangement = Arrangement.SpaceBetween
                                            ) {
                                                Column {
                                                    Text(text = "${it.tier} ${it.rank}")
                                                    Text(text = "LP : ${it.leaguePoints}")
                                                }

                                            }

                                            Spacer(modifier = Modifier.padding(12.dp))
                                        }
                                        val imgId: Int = when (it.tier) {
                                            "IRON" -> R.drawable.iron
                                            "BRONZE" -> R.drawable.bronze
                                            "SILVER" -> R.drawable.silver
                                            "GOLD" -> R.drawable.gold
                                            "PLATINUM" -> R.drawable.platinum
                                            "EMERALD" -> R.drawable.emerald
                                            "DIAMOND" -> R.drawable.diamond
                                            "MASTER" -> R.drawable.master
                                            "GRANDMASTER" -> R.drawable.grandmaster
                                            "CHALLENGER" -> R.drawable.challenger
                                            else -> R.drawable.missingtexture
                                        }
                                        Image(
                                            modifier = Modifier.size(110.dp),
                                            painter = painterResource(id = imgId),
                                            contentDescription = null
                                        )
                                    }
                                }
                            }
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .size(110.dp)
                ) {
                    AsyncImage(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentScale = ContentScale.FillBounds,
                        model = "https://ddragon.leagueoflegends.com/cdn/13.23.1/img/profileicon/${summoner.profileIconId}.png",
                        contentDescription = "Profile Picture"
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreviewDark() {
    MyRAppTheme(useDarkTheme = true) {
        AppScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyRAppTheme {
        AppScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun InfosPreview() {


    val dummyRanks = listOf(
        Rank(
            leaguePoints = 55,
            tier = "BRONZE",
            rank = "IV",
            queueType = "RANKED_FLEX_SR"
        ),
        Rank(
            leaguePoints = 98,
            tier = "GRANDMASTER",
            rank = "IV",
            queueType = "RANKED_SOLO_5x5"
        )
    )

    val dummySummoner = Summoner(
        id = "hBwemIzdR1hZGn0WM4IS-YlUJdVYN9YP-GDdtrg7hSbhcHk9",
        accountId = "pvJQQh3tvsdKhTQR-_MyHab0pRIehQetPFVe8-YgfFUJPJED6Y10_rWO",
        puuid = "IB3w2q5pBWPZQy8Cn6uhB9eGpNYqFbH1S_JFW2npNBKUbmgFES5RzhQX7dQ8cL2Q60sJXOuwDD15SQ",
        name = "Maxbaxter",
        profileIconId = 6369,
        revisionDate = 1701104189000,
        summonerLevel = 417,
        ranks = dummyRanks
    )
    MyRAppTheme(useDarkTheme = true) {
        SummonerInfos(summoner = dummySummoner)
    }
}