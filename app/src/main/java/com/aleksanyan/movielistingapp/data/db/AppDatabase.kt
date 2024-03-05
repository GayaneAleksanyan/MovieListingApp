package com.aleksanyan.movielistingapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aleksanyan.movielistingapp.data.Entity.Film
import com.aleksanyan.movielistingapp.data.dao.FilmDao

@Database(entities = [Film::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun filmDao(): FilmDao
}