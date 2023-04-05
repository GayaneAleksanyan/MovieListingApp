package com.aleksanyan.movielistingapp.domain

import com.aleksanyan.movielistingapp.data.MainRepository

class Interactor(val repository: MainRepository) {
    fun getFilmsDB(): List<Film> = repository.filmsDataBase
}