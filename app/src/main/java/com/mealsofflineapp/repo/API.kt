package com.mealsofflineapp.repo

import com.mealsofflineapp.model.Categories
import com.mealsofflineapp.model.CategoryX
import retrofit2.Response
import retrofit2.http.GET

interface API {

    @GET("/api/json/v1/1/categories.php")
    suspend fun getCategories(): Response<Categories>
}