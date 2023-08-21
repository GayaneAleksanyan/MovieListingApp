package com.aleksanyan.movielistingapp.di.modules

import com.aleksanyan.movielistingapp.data.MainRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun provideRepository() = MainRepository()
}