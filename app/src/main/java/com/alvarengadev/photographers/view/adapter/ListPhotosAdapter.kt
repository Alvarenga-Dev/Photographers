package com.alvarengadev.photographers.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alvarengadev.photographers.R

class ListPhotosAdapter : RecyclerView.Adapter<ListPhotosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListPhotosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_photo, parent, false)
        return ListPhotosViewHolder(view)
    }

    override fun getItemCount(): Int = 5

    override fun onBindViewHolder(holder: ListPhotosViewHolder, position: Int) {

    }

}
