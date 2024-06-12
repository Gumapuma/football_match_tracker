package com.example.football_match_tracker

import kotlin.math.abs

class FootballMatch (private var firstTeamGoals: Int = 0, private var secondTeamGoals: Int = 0) {
    override fun toString(): String {
        return "Match($firstTeamGoals, $secondTeamGoals)"
    }

    fun isMatchDraw(): Boolean = firstTeamGoals == secondTeamGoals

    fun getGap(): Int = abs(firstTeamGoals - secondTeamGoals)

    fun setGoals(firstTeamGoals: Int, secondTeamGoals: Int) {
        this.firstTeamGoals = firstTeamGoals
        this.secondTeamGoals = secondTeamGoals
    }
}