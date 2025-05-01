package com.mealsofflineapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "CategoryX")
data class CategoryX(
    @PrimaryKey
    val idCategory: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
)