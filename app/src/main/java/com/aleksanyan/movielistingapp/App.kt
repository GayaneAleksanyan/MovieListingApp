package com.aleksanyan.movielistingapp

import android.app.Application
import com.aleksanyan.movielistingapp.di.modules.AppComponent
import com.aleksanyan.movielistingapp.di.modules.DaggerAppComponent
import com.aleksanyan.movielistingapp.di.modules.DatabaseModule
import com.aleksanyan.movielistingapp.di.modules.DomainModule
import com.aleksanyan.movielistingapp.di.modules.RemoteModule

class App : Application() {
    lateinit var dagger: AppComponent
    override fun onCreate() {
        super.onCreate()
        instance = this
        dagger = DaggerAppComponent.builder()
            .remoteModule(RemoteModule())
            .databaseModule(DatabaseModule())
            .domainModule(DomainModule(this))
            .build()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}