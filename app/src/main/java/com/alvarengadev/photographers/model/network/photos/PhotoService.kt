package com.alvarengadev.photographers.model.network.photos

import com.alvarengadev.photographers.model.network.photos.response.PhotosResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PhotoService {
    @GET("https://pixabay.com/api/")
    fun list(@Query("key") apiKey: String) : Call<PhotosResult>
}
