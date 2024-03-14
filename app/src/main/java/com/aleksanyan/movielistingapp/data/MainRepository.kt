package com.aleksanyan.movielistingapp.data

import androidx.lifecycle.LiveData
import com.aleksanyan.movielistingapp.data.entity.Film
import com.aleksanyan.movielistingapp.data.dao.FilmDao
import java.util.concurrent.Executors

class MainRepository(private val filmDao: FilmDao) {
    fun putToDb(films: List<Film>) {
        Executors.newSingleThreadExecutor().execute {
            filmDao.insertAll(films)
        }
    }

    fun getAllFromDB(): LiveData<List<Film>> =
        filmDao.getCachedFilms()
}