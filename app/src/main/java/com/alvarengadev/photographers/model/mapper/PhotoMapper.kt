package com.alvarengadev.photographers.model.mapper

import com.alvarengadev.photographers.model.domain.Photo
import com.alvarengadev.photographers.model.network.photos.response.PhotoResponse

class PhotoMapper {
    companion object {
        fun responseToDomain(listPhotoResponse: List<PhotoResponse>): ArrayList<Photo> {
            val listPhotos = ArrayList<Photo>()

            for (photosResponse in listPhotoResponse ) {
                val photo = Photo(
                    photosResponse.id,
                    photosResponse.tags,
                    photosResponse.imageUrl,
                    photosResponse.likes,
                    photosResponse.comments
                )
                listPhotos.add(photo)
            }
            return listPhotos
        }
    }
}
