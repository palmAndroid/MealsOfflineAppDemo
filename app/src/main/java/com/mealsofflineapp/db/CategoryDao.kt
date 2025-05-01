package com.mealsofflineapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mealsofflineapp.model.CategoryX

@Dao
interface CategoryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(category: CategoryX)

    @Query("SELECT * FROM CategoryX")
    fun getCategories(): LiveData<List<CategoryX>>

}