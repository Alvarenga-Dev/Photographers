package com.alvarengadev.photographers.model.network

import com.alvarengadev.photographers.model.network.photos.PhotoService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitInitializer {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://pixabay.com/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    fun photoService() : PhotoService = retrofit.create(PhotoService::class.java)
}
