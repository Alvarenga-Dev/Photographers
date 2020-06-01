package com.alvarengadev.photographers.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alvarengadev.photographers.R
import com.alvarengadev.photographers.model.domain.Photo

class ListPhotosAdapter(private val arrayPhotos: ArrayList<Photo>) : RecyclerView.Adapter<ListPhotosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListPhotosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_photo, parent, false)
        return ListPhotosViewHolder(view)
    }

    override fun getItemCount(): Int = arrayPhotos.size

    override fun onBindViewHolder(holder: ListPhotosViewHolder, position: Int) {
        holder.bind(arrayPhotos[position])
    }

}
