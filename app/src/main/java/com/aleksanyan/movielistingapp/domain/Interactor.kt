package com.aleksanyan.movielistingapp.domain

import com.aleksanyan.movielistingapp.data.Entity.API
import com.aleksanyan.movielistingapp.data.Entity.TmdbResult
import com.aleksanyan.movielistingapp.data.MainRepository
import com.aleksanyan.movielistingapp.data.TmdbApi
import com.aleksanyan.movielistingapp.data.preferences.PreferenceProvider
import com.aleksanyan.movielistingapp.utils.Converter
import com.aleksanyan.movielistingapp.viewmodel.HomeFragmentViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Interactor(private val repository: MainRepository, private val retrofitService: TmdbApi, private val preferences: PreferenceProvider) {

    fun getFilmsFromApi(page: Int, callback: HomeFragmentViewModel.ApiCallback) {
        retrofitService.getFilms(getDefaultCategoryFromPreference(), API.KEY, "en-US", page).enqueue(object : Callback<TmdbResult> {
            override fun onResponse(
                call: Call<TmdbResult>,
                response: Response<TmdbResult>
            ) {
                callback.onSuccess(Converter.convertApiListToDtoList(response.body()?.tmdbFilms))
            }

            override fun onFailure(call: Call<TmdbResult>, t: Throwable) {
                callback.onFailure()
            }
        })
    }

    fun saveDefaultCategoryToPreferences(category: String) {
        preferences.saveDefaultCategory(category)
    }
    fun getDefaultCategoryFromPreference() = preferences.getDefaultCategory()
}