package com.aleksanyan.movielistingapp.di

import com.aleksanyan.movielistingapp.BuildConfig
import com.aleksanyan.movielistingapp.data.Entity.ApiConstants
import com.aleksanyan.movielistingapp.data.MainRepository
import com.aleksanyan.movielistingapp.data.TmdbApi
import com.aleksanyan.movielistingapp.domain.Interactor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import org.koin.dsl.module
import java.util.concurrent.TimeUnit

object DI {
    val mainModule = module {
        single { MainRepository() }
        single<TmdbApi> {
            val okHttpClient = OkHttpClient.Builder()
                .callTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(HttpLoggingInterceptor().apply {
                    if (BuildConfig.DEBUG) {
                        level = HttpLoggingInterceptor.Level.BASIC
                    }
                })
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(ApiConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
            retrofit.create(TmdbApi::class.java)
        }
        single { Interactor(get(), get()) }
    }
}