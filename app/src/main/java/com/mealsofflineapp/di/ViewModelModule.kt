package com.mealsofflineapp.di

import com.mealsofflineapp.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule= module {
    viewModel{ MainViewModel(get(),get(),get()) }
}