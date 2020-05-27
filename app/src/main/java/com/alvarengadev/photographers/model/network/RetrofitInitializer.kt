package com.alvarengadev.photographers.model.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitInitializer {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://pixabay.com/api/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    fun photoService(){

    }

}
