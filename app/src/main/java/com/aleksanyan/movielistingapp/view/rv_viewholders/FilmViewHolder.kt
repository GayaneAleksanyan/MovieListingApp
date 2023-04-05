package com.aleksanyan.movielistingapp.view.rv_viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.aleksanyan.movielistingapp.domain.Film
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.film_item.view.*

class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val title = itemView.title
    private val image = itemView.poster
    private val description = itemView.description

    private val ratingDonut = itemView.rating_donut

    fun bind(film: Film) {
        title.text = film.title

        Glide.with(itemView)
            .load(film.poster)
            .centerCrop()
            .into(image)

        description.text = film.description
        ratingDonut.setProgress((film.rating * 10).toInt())
    }
}