package com.aleksanyan.movielistingapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aleksanyan.movielistingapp.App
import com.aleksanyan.movielistingapp.domain.Interactor
import javax.inject.Inject

class SettingsFragmentViewModel : ViewModel(){
    @Inject
    lateinit var interactor: Interactor
    val categoryPropertyLiveData: MutableLiveData<String> = MutableLiveData()

    init {
        App.instance.dagger.inject(this)
        getCategoryProperty()
    }

    private fun getCategoryProperty(){
        categoryPropertyLiveData.value = interactor.getDefaultCategoryFromPreference()
    }

    fun putCategoryProperty(category: String) {
        interactor.saveDefaultCategoryToPreferences(category)
        getCategoryProperty()
    }
}