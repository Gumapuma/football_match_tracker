package com.example.football_match_tracker

class Homework1 {
    fun homework() {
        val matches = createFootballMatches()
        println(matches.toString())

        for (c in matches.size - 1 downTo 0) if (matches[c].isMatchDraw()) matches.removeAt(c)
        println(matches.toString())

        val maximalGapSet = createSetOfMaximalGap(matches)
        println(maximalGapSet)
    }
}

fun createFootballMatches(): MutableList<FootballMatch> {
    val matches: MutableList<FootballMatch> = MutableList(10) {
        FootballMatch((0..5).random(), (0..5).random())
    }
    println(matches.size)
    return matches
}

fun createSetOfMaximalGap(matches: MutableList<FootballMatch>): MutableSet<FootballMatch> {
    val maximalGapSet: MutableSet<FootballMatch> = mutableSetOf()
    var maximalGap = 0

    matches.forEach { if (it.getGap() > maximalGap) maximalGap = it.getGap() }
    matches.forEach { if (it.getGap() == maximalGap) maximalGapSet.add(it) }

    return maximalGapSet
}
