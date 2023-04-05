package com.aleksanyan.movielistingapp

import android.app.Application
import com.aleksanyan.movielistingapp.data.MainRepository
import com.aleksanyan.movielistingapp.domain.Interactor

class App : Application() {
    lateinit var repository: MainRepository
    lateinit var interactor: Interactor

    override fun onCreate() {
        super.onCreate()
        instance = this
        repository = MainRepository()
        interactor = Interactor(repository)
    }

    companion object {
        lateinit var instance: App
            private set
    }
}