package com.aleksanyan.movielistingapp.data.Entity

import com.google.gson.annotations.SerializedName

data class TmdbResult(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val tmdbFilms: List<TmdbFilm>,
    @SerializedName("total_pages")
    val total_pages: Int,
    @SerializedName("total_results")
    val total_results: Int
)