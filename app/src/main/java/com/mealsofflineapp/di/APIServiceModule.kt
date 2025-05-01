package com.mealsofflineapp.di

import com.mealsofflineapp.repo.APIService
import org.koin.dsl.module

val remoteDataSourceModule= module {
    factory {  APIService(get()) }
}