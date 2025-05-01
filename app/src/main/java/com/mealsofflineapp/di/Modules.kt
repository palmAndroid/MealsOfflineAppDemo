package com.mealsofflineapp.di

import com.mealsofflineapp.db.CategoryDao
import com.mealsofflineapp.db.CategoryDatabase
import com.mealsofflineapp.repo.NetworkRepository
import com.mealsofflineapp.utils.Constants
import com.mealsofflineapp.viewmodel.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import retrofit2.Retrofit

//val appModule = module {
//    //retrofit network class injection
//    //using single to create singleton type instance of retrofit
//    single { Retrofit.Builder().baseUrl(Constants.BASE_URL).build() }
//
//    //Room Database class injection
//    single{ CategoryDatabase.getInstance(context = androidContext())}
//
//    factory {get<CategoryDatabase>().categoryDao() }
//
//
//    single { NetworkRepository(get()) }
////    singleOf(::UserRepositoryImpl) { bind<UserRepository>() }
//
//    //viewmodel injection
//    viewModel{MainViewModel(networkRepository = get())}
//
//
//}