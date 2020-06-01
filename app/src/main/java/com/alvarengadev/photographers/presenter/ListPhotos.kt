package com.alvarengadev.photographers.presenter

import com.alvarengadev.photographers.model.domain.Photo

interface ListPhotos {

    interface View {
        fun error(message: String)
        fun setList(photos: ArrayList<Photo>)
        fun apiKey() : String
    }

    interface Presenter {
        fun init()
    }

}
