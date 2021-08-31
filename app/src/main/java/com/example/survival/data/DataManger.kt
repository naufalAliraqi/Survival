package com.example.survival.data

import com.example.survival.data.domin.Team

object DataManger {
    private val teamList = mutableListOf<Team>()
    val teams: List<Team>
    get() = teamList

    private var teamIndex = 0
    fun addVaccine(team: Team) {
        teamList.add(team)
    }

    fun getTeam(): Team = teamList[teamIndex]
}