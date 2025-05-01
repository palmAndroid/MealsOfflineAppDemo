package com.mealsofflineapp.repo

import com.mealsofflineapp.model.Categories
import retrofit2.Response

class APIService(val api: API) {
    suspend fun getCategories(): Response<Categories> {
        return api.getCategories()
    }

}