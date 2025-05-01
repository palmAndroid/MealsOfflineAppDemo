package com.mealsofflineapp.application

import android.app.Application
import com.mealsofflineapp.di.dataBaseModule
import com.mealsofflineapp.di.networkModule
import com.mealsofflineapp.di.remoteDataSourceModule
import com.mealsofflineapp.di.repositoryModule
import com.mealsofflineapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MealsOfflineAppDemo : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MealsOfflineAppDemo)
            modules(dataBaseModule, networkModule, remoteDataSourceModule, repositoryModule,viewModelModule)
        }
    }
}