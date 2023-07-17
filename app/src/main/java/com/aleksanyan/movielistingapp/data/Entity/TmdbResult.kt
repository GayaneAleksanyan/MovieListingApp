package com.aleksanyan.movielistingapp.data.Entity

data class TmdbResult(
    val page: Int,
    val tmdbFilms: List<TmdbFilm>,
    val total_pages: Int,
    val total_results: Int
)