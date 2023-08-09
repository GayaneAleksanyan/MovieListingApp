package com.aleksanyan.movielistingapp.utils

import com.aleksanyan.movielistingapp.data.Entity.TmdbFilm
import com.aleksanyan.movielistingapp.domain.Film

object Converter {
    fun convertApiListToDtoList(list: List<TmdbFilm>?): List<Film> {
        val result = mutableListOf<Film>()
        list?.forEach {
            result.add(
                Film(
                    title = it.title,
                    poster = it.poster_path,
                    description = it.overview,
                    rating = it.vote_average,
                    isInFavorites = false
                )
            )
        }
        return result
    }
}