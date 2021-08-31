package com.example.survival.util

import com.example.survival.data.domin.Team

class CsvParser {
    fun parse(line: String): Team {
        val tokens = line.split(",")
        return Team(
            rank = tokens[Constants.ColumnIndex.RANG].toInt(),
            teamName = tokens[Constants.ColumnIndex.TEAM],
            goldMedal = tokens[Constants.ColumnIndex.GOLD_MEDAL].toInt(),
            silverMedal = tokens[Constants.ColumnIndex.SILVER_MEDAL].toInt(),
            bronzeMedal = tokens[Constants.ColumnIndex.BRONZE_MEDAL].toInt(),
            rByTotal = tokens[Constants.ColumnIndex.R_BY_TOTAL].toInt(),
        )
    }
}