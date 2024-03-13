package com.aleksanyan.movielistingapp.view.rv_viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.aleksanyan.movielistingapp.data.Entity.Film
import com.aleksanyan.movielistingapp.data.entity.ApiConstants
import com.aleksanyan.movielistingapp.databinding.FilmItemBinding
import com.bumptech.glide.Glide

class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val filmItemBinding = FilmItemBinding.bind(itemView)

    private val title = filmItemBinding.title
    private val image = filmItemBinding.poster
    private val description = filmItemBinding.description

    private val ratingDonut = filmItemBinding.ratingDonut

    fun bind(film: Film) {
        title.text = film.title

        Glide.with(itemView)
            .load(ApiConstants.IMAGES_URL + "w342" + film.poster)
            .centerCrop()
            .into(image)

        description.text = film.description
        ratingDonut.setProgress((film.rating * 10).toInt())
    }
}