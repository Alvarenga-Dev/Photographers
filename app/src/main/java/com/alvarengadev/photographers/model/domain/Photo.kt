package com.alvarengadev.photographers.model.domain

data class Photo(
    val id: Int,
    val tags: String,
    val imageUrl: String,
    val likes: Int,
    val comments: Int
)
