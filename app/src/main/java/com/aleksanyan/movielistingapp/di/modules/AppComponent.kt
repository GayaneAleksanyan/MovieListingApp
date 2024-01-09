package com.aleksanyan.movielistingapp.di.modules

import com.aleksanyan.movielistingapp.viewmodel.HomeFragmentViewModel
import com.aleksanyan.movielistingapp.viewmodel.SettingsFragmentViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        RemoteModule::class,
        DatabaseModule::class,
        DomainModule::class
    ]
)
interface AppComponent {
    fun inject(homeFragmentViewModel: HomeFragmentViewModel)
    fun inject(settingsFragmentViewModel: SettingsFragmentViewModel)
}