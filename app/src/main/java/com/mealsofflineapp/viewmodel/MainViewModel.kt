package com.mealsofflineapp.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.mealsofflineapp.db.CategoryDao
import com.mealsofflineapp.model.CategoryX
import com.mealsofflineapp.repo.NetworkRepository
import kotlinx.coroutines.launch

class MainViewModel(var networkRepository: NetworkRepository, application: Application, var categoryDao: CategoryDao)  :BaseViewModel(application) {


    fun refreshData() {
        viewModelScope.launch {
            networkRepository.getCategoriesData()
        }
    }

    val categoriesList: LiveData<List<CategoryX>> = categoryDao.getCategories()
}