package com.mealsofflineapp.repo

import com.mealsofflineapp.db.CategoryDao


class NetworkRepository(private val categoryDao: CategoryDao,
                        private val apiService: APIService)  {

    suspend fun getCategoriesData() {
        var response = apiService.getCategories()
        if (response.isSuccessful) {
            response.body()?.let {
                for (category in it.categories)
                categoryDao.insert(category)
            }
        }
    }

}