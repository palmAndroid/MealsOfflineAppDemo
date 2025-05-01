package com.mealsofflineapp.di

import com.mealsofflineapp.repo.NetworkRepository
import org.koin.dsl.module


val repositoryModule = module {
    factory { NetworkRepository(get(),get()) }
}