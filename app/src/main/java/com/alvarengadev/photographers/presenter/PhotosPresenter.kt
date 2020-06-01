package com.alvarengadev.photographers.presenter

import com.alvarengadev.photographers.model.mapper.PhotoMapper
import com.alvarengadev.photographers.model.network.RetrofitInitializer
import com.alvarengadev.photographers.model.network.photos.response.PhotosResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PhotosPresenter(private val view: ListPhotos.View) : ListPhotos.Presenter, Callback<PhotosResult> {

    override fun init() {
        val call = RetrofitInitializer().photoService()
            .list(view.apiKey())

        call.enqueue(this)
    }

    override fun onResponse(call: Call<PhotosResult>, response: Response<PhotosResult>) {

        if (response.isSuccessful) {
            response.body()?.let {
                val listPhotos = PhotoMapper.responseToDomain(it.results)
                view.setList(listPhotos)
            }
        }

    }

    override fun onFailure(call: Call<PhotosResult>, t: Throwable) = view.error("Falha ao carregar a lista :(")

}
