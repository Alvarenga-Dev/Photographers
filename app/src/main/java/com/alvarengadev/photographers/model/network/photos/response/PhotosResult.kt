package com.alvarengadev.photographers.model.network.photos.response

import com.squareup.moshi.Json

data class PhotosResult( @field:Json(name = "hits") val results: List<PhotoResponse>)
