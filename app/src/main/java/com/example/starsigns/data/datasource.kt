package com.example.starsigns.data
import com.example.starsigns.R
import com.example.starsigns.mode_forcode.affirm


class Datasource {

    fun loadAffirmations(): List<affirm> {
        return listOf<affirm>(
            affirm(R.string.leo),
            affirm(R.string.aries),
            affirm(R.string.taurus),
            affirm(R.string.gemini),
            affirm(R.string.cancer),
            affirm(R.string.virgo),
            affirm(R.string.libra),
            affirm(R.string.scorpio),
            affirm(R.string.sag),
            affirm(R.string.cap),
            affirm(R.string.aquarius),
            affirm(R.string.pisces)

        )
    }
}