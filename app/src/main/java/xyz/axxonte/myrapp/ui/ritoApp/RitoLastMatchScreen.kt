package xyz.axxonte.myrapp.ui.ritoApp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import xyz.axxonte.myrapp.data.RitoRepo
import xyz.axxonte.myrapp.data.getDateTime
import xyz.axxonte.myrapp.network.Info
import xyz.axxonte.myrapp.network.MatchStats
import xyz.axxonte.myrapp.ui.theme.MyRAppTheme

@Composable
fun RitoLastMatch() {
    val ritoRepo : RitoRepo
    val match = ritoRepo.getPuuid()
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row {
            MatchInfo(match = )
        }
    }
}

@Composable
fun MatchInfo(match: MatchStats) {
    var isDeployed by remember { mutableStateOf(false) }
    if (!isDeployed) {
        Card {
            Row {
                Text(text = "Mode de jeu : ")
                Text(text = match.info?.gameMode ?: "N/A")
            }
            Row {
                Text(text = "Date : ")
                Text(text = getDateTime(match.info!!.gameStartTimestamp!!))
            }
            Row {
                Text(text = "Durée : ")
                Text(text = match.info?.gameDuration?.toString() ?: "N/A")
            }
        }
    }
}
/*
@Preview(showBackground = true)
@Composable
fun PreviewLastMatch(){
    MyRAppTheme {
        RitoLastMatch(MatchStats())
    }
}*/

@Preview(showBackground = true)
@Composable
fun PreviewMatchInfo() {
    MyRAppTheme {
        MatchInfo(match = MatchStats(info = Info(gameStartTimestamp = 1702284051L)))
    }
}