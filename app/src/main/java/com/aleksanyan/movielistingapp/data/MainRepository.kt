package com.aleksanyan.movielistingapp.data

import com.aleksanyan.movielistingapp.R
import com.aleksanyan.movielistingapp.domain.Film

class MainRepository {
    val filmsDataBase = listOf(
        Film(
            "Avatar: The Way of Water",
            R.drawable.avatar,
            "Jake Sully lives with his newfound family formed on the extrasolar moon Pandora. Once a familiar threat returns to finish what was previously started, Jake must work with Neytiri and the army of the Na'vi race to protect their home.",
            7.8f
        ),
        Film(
            "Dual",
            R.drawable.dual,
            "A woman opts for a cloning procedure after she receives a terminal diagnosis but when she recovers her attempts to have her clone decommissioned fail, leading to a court-mandated duel to the death.",
            5.8f
        ),
        Film(
            "Elemental",
            R.drawable.elemental,
            "Follows Ember and Wade, in a city where fire-, water-, land- and air-residents live together.",
            0f
        ),
        Film(
            "Garden State",
            R.drawable.garden_state,
            "A quietly troubled young man returns home for his mother's funeral after being estranged from his family for a decade.",
            7.4f
        ),
        Film(
            "Inferno",
            R.drawable.inferno,
            "When Robert Langdon wakes up in an Italian hospital with amnesia, he teams up with Dr. Sienna Brooks and they race across Europe together against the clock to foil a deadly global plot.",
            6.2f
        ),
        Film(
            "Marcel the Shell with Shoes on",
            R.drawable.marcel,
            "Feature adaptation of the animated short film interviewing a mollusk named Marcel.",
            7.7f
        ),
        Film(
            "The Family",
            R.drawable.the_family,
            "The Manzoni family, a notorious mafia clan, is relocated to Normandy, France under the Witness Protection Program, where fitting in soon becomes challenging, as their old habits die hard.",
            6.3f
        ),
        Film(
            "Turning Red",
            R.drawable.turning_red,
            "A 13-year-old girl named Meilin turns into a giant red panda whenever she gets too excited.",
            7.0f
        ),
        Film(
            "Arcane",
            R.drawable.arcane,
            "Set in Utopian Piltover and the oppressed underground of Zaun, the story follows the origins of two iconic League Of Legends champions and the power that will tear them apart.",
            9.0f
        ),
        Film(
            "Dungeons and Dragons: Honor Among Thieves",
            R.drawable.dungeons_and_dragons_honor_among_thieves,
            "A charming thief and a band of unlikely adventurers embark on an epic quest to retrieve a lost relic, but things go dangerously awry when they run afoul of the wrong people.",
            7.6f
        )
    )
}