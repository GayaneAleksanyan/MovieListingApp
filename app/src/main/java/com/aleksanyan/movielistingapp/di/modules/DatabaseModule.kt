package com.aleksanyan.movielistingapp.di.modules

import android.content.Context
import com.aleksanyan.movielistingapp.data.MainRepository
import com.aleksanyan.movielistingapp.data.db.DatabaseHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabaseHelper(context: Context) = DatabaseHelper(context)

    @Provides
    @Singleton
    fun provideRepository(databaseHelper: DatabaseHelper) = MainRepository(databaseHelper)
}