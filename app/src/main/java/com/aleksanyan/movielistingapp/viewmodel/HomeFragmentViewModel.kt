package com.aleksanyan.movielistingapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aleksanyan.movielistingapp.App
import com.aleksanyan.movielistingapp.domain.Film
import com.aleksanyan.movielistingapp.domain.Interactor

class HomeFragmentViewModel : ViewModel() {
    private val filmsListLiveData: MutableLiveData<List<Film>> = MutableLiveData()
    val filmsListData = filmsListLiveData as LiveData<List<Film>>
    private var interactor: Interactor = App.instance.interactor

    init {
        val films = interactor.getFilmsDB()
        filmsListLiveData.postValue(films)
    }
}