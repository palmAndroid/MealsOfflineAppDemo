package com.mealsofflineapp.di

import android.app.Application
import androidx.room.Room
import com.mealsofflineapp.db.CategoryDao
import com.mealsofflineapp.db.CategoryDatabase
import org.koin.dsl.module

fun provideDataBase(application: Application): CategoryDatabase =
        Room.databaseBuilder(
            application,
            CategoryDatabase::class.java,
            "category_db"
        ).
        fallbackToDestructiveMigration().build()

    fun provideDao(postDataBase: CategoryDatabase): CategoryDao = postDataBase.categoryDao()


    val dataBaseModule= module {
        single { provideDataBase(get()) }
        single { provideDao(get()) }

}