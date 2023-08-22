package com.aleksanyan.movielistingapp

import android.app.Application
import com.aleksanyan.movielistingapp.di.modules.AppComponent
import com.aleksanyan.movielistingapp.di.modules.DaggerAppComponent

class App : Application() {
    lateinit var dagger: AppComponent
    override fun onCreate() {
        super.onCreate()
        instance = this
        dagger = DaggerAppComponent.create()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}