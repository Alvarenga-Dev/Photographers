package com.alvarengadev.photographers.view.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alvarengadev.photographers.R
import com.alvarengadev.photographers.model.domain.Photo
import com.squareup.picasso.Picasso

class ListPhotosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val photoIv = itemView.findViewById(R.id.photoIv) as ImageView
    private val likesTv = itemView.findViewById(R.id.likesTv) as TextView
    private val commentsTv = itemView.findViewById(R.id.commentsTv) as TextView

    fun bind(photo: Photo) {

        likesTv.text = photo.likes.toString()
        commentsTv.text = photo.comments.toString()

        Picasso.get()
            .load(photo.imageUrl)
            .fit()
            .into(photoIv)

    }

}
