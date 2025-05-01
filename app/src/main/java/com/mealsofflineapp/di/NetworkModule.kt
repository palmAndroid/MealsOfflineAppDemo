package com.mealsofflineapp.di


import com.mealsofflineapp.repo.API
import com.mealsofflineapp.utils.Constants
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

    fun provideHttpClient(): OkHttpClient {
        return OkHttpClient
            .Builder()
            .readTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(60, TimeUnit.SECONDS)
            .build()
    }


    fun provideConverterFactory(): GsonConverterFactory =
        GsonConverterFactory.create()


    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    fun provideService(retrofit: Retrofit): API =
        retrofit.create(API::class.java)


    val networkModule = module {
        single { provideHttpClient() }
        single { provideConverterFactory() }
        single { provideRetrofit(get(),get()) }
        single { provideService(get()) }
    }
