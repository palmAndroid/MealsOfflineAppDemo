package com.mealsofflineapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.InvalidationTracker
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mealsofflineapp.model.CategoryX

@Database (entities = [CategoryX::class], version = 1, exportSchema = false)
abstract class CategoryDatabase : RoomDatabase() {

    abstract fun categoryDao(): CategoryDao

//    companion object {
//            @Volatile private var INSTANCE: CategoryDatabase? = null
//
//            fun getInstance(context: Context): CategoryDatabase {
//                return INSTANCE ?: synchronized(this) {
//
//                    Room.databaseBuilder(
//                        context.applicationContext,
//                        CategoryDatabase::class.java,
//                        "category_db"
//                    ).build().also { INSTANCE = it }
//                }
//            }
//    }

}