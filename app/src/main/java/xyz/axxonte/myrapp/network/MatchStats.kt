package xyz.axxonte.myrapp.network

import com.google.gson.annotations.SerializedName

data class MatchStats(

	@field:SerializedName("metadata")
	val metadata: Metadata? = null,

	@field:SerializedName("info")
	val info: Info? = null
)

data class Champion(

	@field:SerializedName("kills")
	val kills: Int? = null,

	@field:SerializedName("first")
	val first: Boolean? = null
)

data class Horde(

	@field:SerializedName("kills")
	val kills: Int? = null,

	@field:SerializedName("first")
	val first: Boolean? = null
)

data class SelectionsItem(

	@field:SerializedName("perk")
	val perk: Int? = null,

	@field:SerializedName("var3")
	val var3: Int? = null,

	@field:SerializedName("var2")
	val var2: Int? = null,

	@field:SerializedName("var1")
	val var1: Int? = null
)

data class Objectives(

	@field:SerializedName("baron")
	val baron: Baron? = null,

	@field:SerializedName("horde")
	val horde: Horde? = null,

	@field:SerializedName("inhibitor")
	val inhibitor: Inhibitor? = null,

	@field:SerializedName("dragon")
	val dragon: Dragon? = null,

	@field:SerializedName("riftHerald")
	val riftHerald: RiftHerald? = null,

	@field:SerializedName("champion")
	val champion: Champion? = null,

	@field:SerializedName("tower")
	val tower: Tower? = null
)

data class TeamsItem(

	@field:SerializedName("teamId")
	val teamId: Int? = null,

	@field:SerializedName("bans")
	val bans: List<BansItem?>? = null,

	@field:SerializedName("objectives")
	val objectives: Objectives? = null,

	@field:SerializedName("win")
	val win: Boolean? = null
)

data class RiftHerald(

	@field:SerializedName("kills")
	val kills: Int? = null,

	@field:SerializedName("first")
	val first: Boolean? = null
)

data class StylesItem(

	@field:SerializedName("selections")
	val selections: List<SelectionsItem?>? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("style")
	val style: Int? = null
)

data class ParticipantsItem(

	@field:SerializedName("bountyLevel")
	val bountyLevel: Int? = null,

	@field:SerializedName("totalUnitsHealed")
	val totalUnitsHealed: Int? = null,

	@field:SerializedName("largestMultiKill")
	val largestMultiKill: Int? = null,

	@field:SerializedName("spell2Casts")
	val spell2Casts: Int? = null,

	@field:SerializedName("champExperience")
	val champExperience: Int? = null,

	@field:SerializedName("onMyWayPings")
	val onMyWayPings: Int? = null,

	@field:SerializedName("summonerLevel")
	val summonerLevel: Int? = null,

	@field:SerializedName("holdPings")
	val holdPings: Int? = null,

	@field:SerializedName("damageDealtToObjectives")
	val damageDealtToObjectives: Int? = null,

	@field:SerializedName("pushPings")
	val pushPings: Int? = null,

	@field:SerializedName("totalEnemyJungleMinionsKilled")
	val totalEnemyJungleMinionsKilled: Int? = null,

	@field:SerializedName("turretTakedowns")
	val turretTakedowns: Int? = null,

	@field:SerializedName("magicDamageTaken")
	val magicDamageTaken: Int? = null,

	@field:SerializedName("playerScore0")
	val playerScore0: Int? = null,

	@field:SerializedName("perks")
	val perks: Perks? = null,

	@field:SerializedName("deaths")
	val deaths: Int? = null,

	@field:SerializedName("objectivesStolen")
	val objectivesStolen: Int? = null,

	@field:SerializedName("detectorWardsPlaced")
	val detectorWardsPlaced: Int? = null,

	@field:SerializedName("enemyMissingPings")
	val enemyMissingPings: Int? = null,

	@field:SerializedName("magicDamageDealtToChampions")
	val magicDamageDealtToChampions: Int? = null,

	@field:SerializedName("playerScore7")
	val playerScore7: Int? = null,

	@field:SerializedName("wardsKilled")
	val wardsKilled: Int? = null,

	@field:SerializedName("playerScore8")
	val playerScore8: Int? = null,

	@field:SerializedName("pentaKills")
	val pentaKills: Int? = null,

	@field:SerializedName("playerScore5")
	val playerScore5: Int? = null,

	@field:SerializedName("playerScore6")
	val playerScore6: Int? = null,

	@field:SerializedName("playerScore3")
	val playerScore3: Int? = null,

	@field:SerializedName("playerScore4")
	val playerScore4: Int? = null,

	@field:SerializedName("playerScore1")
	val playerScore1: Int? = null,

	@field:SerializedName("playerScore2")
	val playerScore2: Int? = null,

	@field:SerializedName("spell3Casts")
	val spell3Casts: Int? = null,

	@field:SerializedName("firstTowerKill")
	val firstTowerKill: Boolean? = null,

	@field:SerializedName("individualPosition")
	val individualPosition: String? = null,

	@field:SerializedName("playerScore9")
	val playerScore9: Int? = null,

	@field:SerializedName("wardsPlaced")
	val wardsPlaced: Int? = null,

	@field:SerializedName("totalDamageDealt")
	val totalDamageDealt: Int? = null,

	@field:SerializedName("largestKillingSpree")
	val largestKillingSpree: Int? = null,

	@field:SerializedName("totalDamageDealtToChampions")
	val totalDamageDealtToChampions: Int? = null,

	@field:SerializedName("placement")
	val placement: Int? = null,

	@field:SerializedName("playerAugment2")
	val playerAugment2: Int? = null,

	@field:SerializedName("playerAugment3")
	val playerAugment3: Int? = null,

	@field:SerializedName("summoner2Id")
	val summoner2Id: Int? = null,

	@field:SerializedName("playerAugment1")
	val playerAugment1: Int? = null,

	@field:SerializedName("role")
	val role: String? = null,

	@field:SerializedName("totalTimeSpentDead")
	val totalTimeSpentDead: Int? = null,

	@field:SerializedName("playerAugment4")
	val playerAugment4: Int? = null,

	@field:SerializedName("inhibitorKills")
	val inhibitorKills: Int? = null,

	@field:SerializedName("puuid")
	val puuid: String? = null,

	@field:SerializedName("totalTimeCCDealt")
	val totalTimeCCDealt: Int? = null,

	@field:SerializedName("participantId")
	val participantId: Int? = null,

	@field:SerializedName("profileIcon")
	val profileIcon: Int? = null,

	@field:SerializedName("teamEarlySurrendered")
	val teamEarlySurrendered: Boolean? = null,

	@field:SerializedName("goldSpent")
	val goldSpent: Int? = null,

	@field:SerializedName("unrealKills")
	val unrealKills: Int? = null,

	@field:SerializedName("consumablesPurchased")
	val consumablesPurchased: Int? = null,

	@field:SerializedName("visionScore")
	val visionScore: Int? = null,

	@field:SerializedName("firstBloodKill")
	val firstBloodKill: Boolean? = null,

	@field:SerializedName("longestTimeSpentLiving")
	val longestTimeSpentLiving: Int? = null,

	@field:SerializedName("killingSprees")
	val killingSprees: Int? = null,

	@field:SerializedName("sightWardsBoughtInGame")
	val sightWardsBoughtInGame: Int? = null,

	@field:SerializedName("riotIdGameName")
	val riotIdGameName: String? = null,

	@field:SerializedName("eligibleForProgression")
	val eligibleForProgression: Boolean? = null,

	@field:SerializedName("missions")
	val missions: Missions? = null,

	@field:SerializedName("turretsLost")
	val turretsLost: Int? = null,

	@field:SerializedName("commandPings")
	val commandPings: Int? = null,

	@field:SerializedName("quadraKills")
	val quadraKills: Int? = null,

	@field:SerializedName("item4")
	val item4: Int? = null,

	@field:SerializedName("nexusTakedowns")
	val nexusTakedowns: Int? = null,

	@field:SerializedName("item3")
	val item3: Int? = null,

	@field:SerializedName("item6")
	val item6: Int? = null,

	@field:SerializedName("item5")
	val item5: Int? = null,

	@field:SerializedName("item0")
	val item0: Int? = null,

	@field:SerializedName("item2")
	val item2: Int? = null,

	@field:SerializedName("summoner1Id")
	val summoner1Id: Int? = null,

	@field:SerializedName("item1")
	val item1: Int? = null,

	@field:SerializedName("totalDamageShieldedOnTeammates")
	val totalDamageShieldedOnTeammates: Int? = null,

	@field:SerializedName("summoner2Casts")
	val summoner2Casts: Int? = null,

	@field:SerializedName("goldEarned")
	val goldEarned: Int? = null,

	@field:SerializedName("nexusLost")
	val nexusLost: Int? = null,

	@field:SerializedName("physicalDamageTaken")
	val physicalDamageTaken: Int? = null,

	@field:SerializedName("champLevel")
	val champLevel: Int? = null,

	@field:SerializedName("totalDamageTaken")
	val totalDamageTaken: Int? = null,

	@field:SerializedName("neutralMinionsKilled")
	val neutralMinionsKilled: Int? = null,

	@field:SerializedName("basicPings")
	val basicPings: Int? = null,

	@field:SerializedName("totalAllyJungleMinionsKilled")
	val totalAllyJungleMinionsKilled: Int? = null,

	@field:SerializedName("allInPings")
	val allInPings: Int? = null,

	@field:SerializedName("championTransform")
	val championTransform: Int? = null,

	@field:SerializedName("tripleKills")
	val tripleKills: Int? = null,

	@field:SerializedName("damageSelfMitigated")
	val damageSelfMitigated: Int? = null,

	@field:SerializedName("inhibitorsLost")
	val inhibitorsLost: Int? = null,

	@field:SerializedName("inhibitorTakedowns")
	val inhibitorTakedowns: Int? = null,

	@field:SerializedName("largestCriticalStrike")
	val largestCriticalStrike: Int? = null,

	@field:SerializedName("assistMePings")
	val assistMePings: Int? = null,

	@field:SerializedName("totalHealsOnTeammates")
	val totalHealsOnTeammates: Int? = null,

	@field:SerializedName("summoner1Casts")
	val summoner1Casts: Int? = null,

	@field:SerializedName("subteamPlacement")
	val subteamPlacement: Int? = null,

	@field:SerializedName("damageDealtToBuildings")
	val damageDealtToBuildings: Int? = null,

	@field:SerializedName("magicDamageDealt")
	val magicDamageDealt: Int? = null,

	@field:SerializedName("playerSubteamId")
	val playerSubteamId: Int? = null,

	@field:SerializedName("timePlayed")
	val timePlayed: Int? = null,

	@field:SerializedName("championName")
	val championName: String? = null,

	@field:SerializedName("timeCCingOthers")
	val timeCCingOthers: Int? = null,

	@field:SerializedName("teamPosition")
	val teamPosition: String? = null,

	@field:SerializedName("physicalDamageDealtToChampions")
	val physicalDamageDealtToChampions: Int? = null,

	@field:SerializedName("totalMinionsKilled")
	val totalMinionsKilled: Int? = null,

	@field:SerializedName("visionWardsBoughtInGame")
	val visionWardsBoughtInGame: Int? = null,

	@field:SerializedName("kills")
	val kills: Int? = null,

	@field:SerializedName("firstTowerAssist")
	val firstTowerAssist: Boolean? = null,

	@field:SerializedName("championId")
	val championId: Int? = null,

	@field:SerializedName("challenges")
	val challenges: Challenges? = null,

	@field:SerializedName("baitPings")
	val baitPings: Int? = null,

	@field:SerializedName("getBackPings")
	val getBackPings: Int? = null,

	@field:SerializedName("needVisionPings")
	val needVisionPings: Int? = null,

	@field:SerializedName("turretKills")
	val turretKills: Int? = null,

	@field:SerializedName("enemyVisionPings")
	val enemyVisionPings: Int? = null,

	@field:SerializedName("firstBloodAssist")
	val firstBloodAssist: Boolean? = null,

	@field:SerializedName("trueDamageTaken")
	val trueDamageTaken: Int? = null,

	@field:SerializedName("assists")
	val assists: Int? = null,

	@field:SerializedName("itemsPurchased")
	val itemsPurchased: Int? = null,

	@field:SerializedName("objectivesStolenAssists")
	val objectivesStolenAssists: Int? = null,

	@field:SerializedName("summonerId")
	val summonerId: String? = null,

	@field:SerializedName("damageDealtToTurrets")
	val damageDealtToTurrets: Int? = null,

	@field:SerializedName("totalHeal")
	val totalHeal: Int? = null,

	@field:SerializedName("visionClearedPings")
	val visionClearedPings: Int? = null,

	@field:SerializedName("win")
	val win: Boolean? = null,

	@field:SerializedName("lane")
	val lane: String? = null,

	@field:SerializedName("playerScore11")
	val playerScore11: Int? = null,

	@field:SerializedName("playerScore10")
	val playerScore10: Int? = null,

	@field:SerializedName("gameEndedInSurrender")
	val gameEndedInSurrender: Boolean? = null,

	@field:SerializedName("physicalDamageDealt")
	val physicalDamageDealt: Int? = null,

	@field:SerializedName("summonerName")
	val summonerName: String? = null,

	@field:SerializedName("trueDamageDealtToChampions")
	val trueDamageDealtToChampions: Int? = null,

	@field:SerializedName("dragonKills")
	val dragonKills: Int? = null,

	@field:SerializedName("baronKills")
	val baronKills: Int? = null,

	@field:SerializedName("doubleKills")
	val doubleKills: Int? = null,

	@field:SerializedName("nexusKills")
	val nexusKills: Int? = null,

	@field:SerializedName("trueDamageDealt")
	val trueDamageDealt: Int? = null,

	@field:SerializedName("spell1Casts")
	val spell1Casts: Int? = null,

	@field:SerializedName("gameEndedInEarlySurrender")
	val gameEndedInEarlySurrender: Boolean? = null,

	@field:SerializedName("teamId")
	val teamId: Int? = null,

	@field:SerializedName("riotIdTagline")
	val riotIdTagline: String? = null,

	@field:SerializedName("dangerPings")
	val dangerPings: Int? = null,

	@field:SerializedName("spell4Casts")
	val spell4Casts: Int? = null
)

data class Metadata(

	@field:SerializedName("dataVersion")
	val dataVersion: String? = null,

	@field:SerializedName("matchId")
	val matchId: String? = null,

	@field:SerializedName("participants")
	val participants: List<String?>? = null
)

data class Tower(

	@field:SerializedName("kills")
	val kills: Int? = null,

	@field:SerializedName("first")
	val first: Boolean? = null
)

data class Inhibitor(

	@field:SerializedName("kills")
	val kills: Int? = null,

	@field:SerializedName("first")
	val first: Boolean? = null
)

data class Challenges(

	@field:SerializedName("acesBefore15Minutes")
	val acesBefore15Minutes: Int? = null,

	@field:SerializedName("wardTakedowns")
	val wardTakedowns: Int? = null,

	@field:SerializedName("firstTurretKilled")
	val firstTurretKilled: Int? = null,

	@field:SerializedName("saveAllyFromDeath")
	val saveAllyFromDeath: Int? = null,

	@field:SerializedName("elderDragonMultikills")
	val elderDragonMultikills: Int? = null,

	@field:SerializedName("poroExplosions")
	val poroExplosions: Int? = null,

	@field:SerializedName("soloKills")
	val soloKills: Int? = null,

	@field:SerializedName("turretPlatesTaken")
	val turretPlatesTaken: Int? = null,

	@field:SerializedName("abilityUses")
	val abilityUses: Int? = null,

	@field:SerializedName("dodgeSkillShotsSmallWindow")
	val dodgeSkillShotsSmallWindow: Int? = null,

	@field:SerializedName("damagePerMinute")
	val damagePerMinute: Any? = null,

	@field:SerializedName("knockEnemyIntoTeamAndKill")
	val knockEnemyIntoTeamAndKill: Int? = null,

	@field:SerializedName("killParticipation")
	val killParticipation: Any? = null,

	@field:SerializedName("turretTakedowns")
	val turretTakedowns: Int? = null,

	@field:SerializedName("killsOnOtherLanesEarlyJungleAsLaner")
	val killsOnOtherLanesEarlyJungleAsLaner: Int? = null,

	@field:SerializedName("goldPerMinute")
	val goldPerMinute: Any? = null,

	@field:SerializedName("perfectGame")
	val perfectGame: Int? = null,

	@field:SerializedName("skillshotsHit")
	val skillshotsHit: Int? = null,

	@field:SerializedName("multikills")
	val multikills: Int? = null,

	@field:SerializedName("wardTakedownsBefore20M")
	val wardTakedownsBefore20M: Int? = null,

	@field:SerializedName("outerTurretExecutesBefore10Minutes")
	val outerTurretExecutesBefore10Minutes: Int? = null,

	@field:SerializedName("takedownsInAlcove")
	val takedownsInAlcove: Int? = null,

	@field:SerializedName("kda")
	val kda: Any? = null,

	@field:SerializedName("unseenRecalls")
	val unseenRecalls: Int? = null,

	@field:SerializedName("takedownsFirstXMinutes")
	val takedownsFirstXMinutes: Int? = null,

	@field:SerializedName("kTurretsDestroyedBeforePlatesFall")
	val kTurretsDestroyedBeforePlatesFall: Int? = null,

	@field:SerializedName("epicMonsterKillsNearEnemyJungler")
	val epicMonsterKillsNearEnemyJungler: Int? = null,

	@field:SerializedName("survivedSingleDigitHpCount")
	val survivedSingleDigitHpCount: Int? = null,

	@field:SerializedName("outnumberedNexusKill")
	val outnumberedNexusKill: Int? = null,

	@field:SerializedName("damageTakenOnTeamPercentage")
	val damageTakenOnTeamPercentage: Any? = null,

	@field:SerializedName("laneMinionsFirst10Minutes")
	val laneMinionsFirst10Minutes: Int? = null,

	@field:SerializedName("quickCleanse")
	val quickCleanse: Int? = null,

	@field:SerializedName("initialCrabCount")
	val initialCrabCount: Int? = null,

	@field:SerializedName("completeSupportQuestInTime")
	val completeSupportQuestInTime: Int? = null,

	@field:SerializedName("takedownsAfterGainingLevelAdvantage")
	val takedownsAfterGainingLevelAdvantage: Int? = null,

	@field:SerializedName("controlWardsPlaced")
	val controlWardsPlaced: Int? = null,

	@field:SerializedName("epicMonsterStolenWithoutSmite")
	val epicMonsterStolenWithoutSmite: Int? = null,

	@field:SerializedName("tookLargeDamageSurvived")
	val tookLargeDamageSurvived: Int? = null,

	@field:SerializedName("enemyJungleMonsterKills")
	val enemyJungleMonsterKills: Int? = null,

	@field:SerializedName("teamDamagePercentage")
	val teamDamagePercentage: Any? = null,

	@field:SerializedName("jungleCsBefore10Minutes")
	val jungleCsBefore10Minutes: Int? = null,

	@field:SerializedName("lostAnInhibitor")
	val lostAnInhibitor: Int? = null,

	@field:SerializedName("takedownsBeforeJungleMinionSpawn")
	val takedownsBeforeJungleMinionSpawn: Int? = null,

	@field:SerializedName("elderDragonKillsWithOpposingSoul")
	val elderDragonKillsWithOpposingSoul: Int? = null,

	@field:SerializedName("killsWithHelpFromEpicMonster")
	val killsWithHelpFromEpicMonster: Int? = null,

	@field:SerializedName("killingSprees")
	val killingSprees: Int? = null,

	@field:SerializedName("outnumberedKills")
	val outnumberedKills: Int? = null,

	@field:SerializedName("wardsGuarded")
	val wardsGuarded: Int? = null,

	@field:SerializedName("flawlessAces")
	val flawlessAces: Int? = null,

	@field:SerializedName("teamRiftHeraldKills")
	val teamRiftHeraldKills: Int? = null,

	@field:SerializedName("turretsTakenWithRiftHerald")
	val turretsTakenWithRiftHerald: Int? = null,

	@field:SerializedName("dragonTakedowns")
	val dragonTakedowns: Int? = null,

	@field:SerializedName("riftHeraldTakedowns")
	val riftHeraldTakedowns: Int? = null,

	@field:SerializedName("takedowns")
	val takedowns: Int? = null,

	@field:SerializedName("fullTeamTakedown")
	val fullTeamTakedown: Int? = null,

	@field:SerializedName("buffsStolen")
	val buffsStolen: Int? = null,

	@field:SerializedName("takedownsInEnemyFountain")
	val takedownsInEnemyFountain: Int? = null,

	@field:SerializedName("enemyChampionImmobilizations")
	val enemyChampionImmobilizations: Int? = null,

	@field:SerializedName("soloBaronKills")
	val soloBaronKills: Int? = null,

	@field:SerializedName("multikillsAfterAggressiveFlash")
	val multikillsAfterAggressiveFlash: Int? = null,

	@field:SerializedName("deathsByEnemyChamps")
	val deathsByEnemyChamps: Int? = null,

	@field:SerializedName("takedownOnFirstTurret")
	val takedownOnFirstTurret: Int? = null,

	@field:SerializedName("twentyMinionsIn3SecondsCount")
	val twentyMinionsIn3SecondsCount: Int? = null,

	@field:SerializedName("killsUnderOwnTurret")
	val killsUnderOwnTurret: Int? = null,

	@field:SerializedName("moreEnemyJungleThanOpponent")
	val moreEnemyJungleThanOpponent: Int? = null,

	@field:SerializedName("killAfterHiddenWithAlly")
	val killAfterHiddenWithAlly: Int? = null,

	@field:SerializedName("hadOpenNexus")
	val hadOpenNexus: Int? = null,

	@field:SerializedName("doubleAces")
	val doubleAces: Int? = null,

	@field:SerializedName("blastConeOppositeOpponentCount")
	val blastConeOppositeOpponentCount: Int? = null,

	@field:SerializedName("epicMonsterSteals")
	val epicMonsterSteals: Int? = null,

	@field:SerializedName("baronTakedowns")
	val baronTakedowns: Int? = null,

	@field:SerializedName("junglerTakedownsNearDamagedEpicMonster")
	val junglerTakedownsNearDamagedEpicMonster: Int? = null,

	@field:SerializedName("epicMonsterKillsWithin30SecondsOfSpawn")
	val epicMonsterKillsWithin30SecondsOfSpawn: Int? = null,

	@field:SerializedName("killedChampTookFullTeamDamageSurvived")
	val killedChampTookFullTeamDamageSurvived: Int? = null,

	@field:SerializedName("maxKillDeficit")
	val maxKillDeficit: Int? = null,

	@field:SerializedName("mythicItemUsed")
	val mythicItemUsed: Int? = null,

	@field:SerializedName("multiKillOneSpell")
	val multiKillOneSpell: Int? = null,

	@field:SerializedName("landSkillShotsEarlyGame")
	val landSkillShotsEarlyGame: Int? = null,

	@field:SerializedName("mejaisFullStackInTime")
	val mejaisFullStackInTime: Int? = null,

	@field:SerializedName("quickFirstTurret")
	val quickFirstTurret: Int? = null,

	@field:SerializedName("initialBuffCount")
	val initialBuffCount: Int? = null,

	@field:SerializedName("quickSoloKills")
	val quickSoloKills: Int? = null,

	@field:SerializedName("snowballsHit")
	val snowballsHit: Int? = null,

	@field:SerializedName("immobilizeAndKillWithAlly")
	val immobilizeAndKillWithAlly: Int? = null,

	@field:SerializedName("stealthWardsPlaced")
	val stealthWardsPlaced: Int? = null,

	@field:SerializedName("twoWardsOneSweeperCount")
	val twoWardsOneSweeperCount: Int? = null,

	@field:SerializedName("effectiveHealAndShielding")
	val effectiveHealAndShielding: Int? = null,

	@field:SerializedName("dancedWithRiftHerald")
	val dancedWithRiftHerald: Int? = null,

	@field:SerializedName("pickKillWithAlly")
	val pickKillWithAlly: Int? = null,

	@field:SerializedName("teamElderDragonKills")
	val teamElderDragonKills: Int? = null,

	@field:SerializedName("gameLength")
	val gameLength: Any? = null,

	@field:SerializedName("multiTurretRiftHeraldCount")
	val multiTurretRiftHeraldCount: Int? = null,

	@field:SerializedName("killsOnRecentlyHealedByAramPack")
	val killsOnRecentlyHealedByAramPack: Int? = null,

	@field:SerializedName("perfectDragonSoulsTaken")
	val perfectDragonSoulsTaken: Int? = null,

	@field:SerializedName("teamBaronKills")
	val teamBaronKills: Int? = null,

	@field:SerializedName("skillshotsDodged")
	val skillshotsDodged: Int? = null,

	@field:SerializedName("legendaryCount")
	val legendaryCount: Int? = null,

	@field:SerializedName("getTakedownsInAllLanesEarlyJungleAsLaner")
	val getTakedownsInAllLanesEarlyJungleAsLaner: Int? = null,

	@field:SerializedName("visionScorePerMinute")
	val visionScorePerMinute: Int? = null,

	@field:SerializedName("alliedJungleMonsterKills")
	val alliedJungleMonsterKills: Int? = null,

	@field:SerializedName("scuttleCrabKills")
	val scuttleCrabKills: Int? = null,

	@field:SerializedName("shortestTimeToAceFromFirstTakedown")
	val shortestTimeToAceFromFirstTakedown: Any? = null,

	@field:SerializedName("bountyGold")
	val bountyGold: Int? = null,

	@field:SerializedName("killsNearEnemyTurret")
	val killsNearEnemyTurret: Int? = null,

	@field:SerializedName("12AssistStreakCount")
	val jsonMember12AssistStreakCount: Int? = null,

	@field:SerializedName("survivedThreeImmobilizesInFight")
	val survivedThreeImmobilizesInFight: Int? = null,

	@field:SerializedName("fastestLegendary")
	val fastestLegendary: Any? = null,

	@field:SerializedName("highestChampionDamage")
	val highestChampionDamage: Int? = null
)

data class Dragon(

	@field:SerializedName("kills")
	val kills: Int? = null,

	@field:SerializedName("first")
	val first: Boolean? = null
)

data class Info(

	@field:SerializedName("gameId")
	val gameId: Long? = null,

	@field:SerializedName("gameType")
	val gameType: String? = null,

	@field:SerializedName("queueId")
	val queueId: Int? = null,

	@field:SerializedName("gameDuration")
	val gameDuration: Int? = null,

	@field:SerializedName("teams")
	val teams: List<TeamsItem?>? = null,

	@field:SerializedName("gameEndTimestamp")
	val gameEndTimestamp: Long? = null,

	@field:SerializedName("gameStartTimestamp")
	val gameStartTimestamp: Long? = null,

	@field:SerializedName("platformId")
	val platformId: String? = null,

	@field:SerializedName("gameCreation")
	val gameCreation: Long? = null,

	@field:SerializedName("gameName")
	val gameName: String? = null,

	@field:SerializedName("tournamentCode")
	val tournamentCode: String? = null,

	@field:SerializedName("gameVersion")
	val gameVersion: String? = null,

	@field:SerializedName("mapId")
	val mapId: Int? = null,

	@field:SerializedName("gameMode")
	val gameMode: String? = null,

	@field:SerializedName("participants")
	val participants: List<ParticipantsItem?>? = null
)

data class BansItem(

	@field:SerializedName("championId")
	val championId: Int? = null,

	@field:SerializedName("pickTurn")
	val pickTurn: Int? = null
)

data class Missions(

	@field:SerializedName("playerScore7")
	val playerScore7: Int? = null,

	@field:SerializedName("playerScore8")
	val playerScore8: Int? = null,

	@field:SerializedName("playerScore5")
	val playerScore5: Int? = null,

	@field:SerializedName("playerScore6")
	val playerScore6: Int? = null,

	@field:SerializedName("playerScore3")
	val playerScore3: Int? = null,

	@field:SerializedName("playerScore4")
	val playerScore4: Int? = null,

	@field:SerializedName("playerScore1")
	val playerScore1: Int? = null,

	@field:SerializedName("playerScore2")
	val playerScore2: Int? = null,

	@field:SerializedName("playerScore0")
	val playerScore0: Int? = null,

	@field:SerializedName("playerScore11")
	val playerScore11: Int? = null,

	@field:SerializedName("playerScore9")
	val playerScore9: Int? = null,

	@field:SerializedName("playerScore10")
	val playerScore10: Int? = null
)

data class Baron(

	@field:SerializedName("kills")
	val kills: Int? = null,

	@field:SerializedName("first")
	val first: Boolean? = null
)

data class StatPerks(

	@field:SerializedName("offense")
	val offense: Int? = null,

	@field:SerializedName("defense")
	val defense: Int? = null,

	@field:SerializedName("flex")
	val flex: Int? = null
)

data class Perks(

	@field:SerializedName("statPerks")
	val statPerks: StatPerks? = null,

	@field:SerializedName("styles")
	val styles: List<StylesItem?>? = null
)
