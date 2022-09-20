package com.example.myapplicationkotlingetapi

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val BindTextValue: TextView? = itemView.findViewById(R.id.textTitle)
    val BindContentValue: TextView? = itemView.findViewById(R.id.textContent)
    val BindImageView: ImageView? = itemView.findViewById(R.id.imageView)
    val BindCardView: CardView? = itemView.findViewById(R.id.cardView)
}
