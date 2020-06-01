package com.alvarengadev.photographers.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.alvarengadev.photographers.R
import com.alvarengadev.photographers.model.domain.Photo
import com.alvarengadev.photographers.presenter.ListPhotos
import com.alvarengadev.photographers.view.adapter.ListPhotosAdapter
import com.alvarengadev.photographers.presenter.PhotosPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ListPhotos.View {

    private val photosPresenter = PhotosPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        photosPresenter.init()
    }

    override fun setList(photos: ArrayList<Photo>) {
        val adapterPhotos = ListPhotosAdapter(photos)

        listPhotosRcy.apply {
            hasFixedSize()
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = adapterPhotos
        }
    }

    override fun apiKey(): String = resources.getString(R.string.api_key).replace("–", "-")

    override fun error(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

}
