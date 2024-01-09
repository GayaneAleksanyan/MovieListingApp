package com.aleksanyan.movielistingapp.di.modules

import android.content.Context
import com.aleksanyan.movielistingapp.data.MainRepository
import com.aleksanyan.movielistingapp.data.TmdbApi
import com.aleksanyan.movielistingapp.data.preferences.PreferenceProvider
import com.aleksanyan.movielistingapp.domain.Interactor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DomainModule (val context: Context) {
    @Provides
    fun provideContext() = context

    @Singleton
    @Provides
    fun providePreferences(context: Context) = PreferenceProvider(context)

    @Singleton
    @Provides
    fun provideInteractor(repository: MainRepository, tmdbApi: TmdbApi, preferenceProvider: PreferenceProvider) = Interactor(repository = repository, retrofitService = tmdbApi, preferences = preferenceProvider)
}