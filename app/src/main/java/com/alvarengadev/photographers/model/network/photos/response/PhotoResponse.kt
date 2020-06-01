package com.alvarengadev.photographers.model.network.photos.response

import com.squareup.moshi.Json

class PhotoResponse(
    @field:Json(name = "id") val id: Int,
    @field:Json(name = "tags") val tags: String,
    @field:Json(name = "largeImageURL") val imageUrl: String,
    @field:Json(name = "likes") val likes: Int,
    @field:Json(name = "comments") val comments: Int
)
