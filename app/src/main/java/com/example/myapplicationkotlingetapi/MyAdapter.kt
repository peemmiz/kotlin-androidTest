package com.example.myapplicationkotlingetapi

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapter(private val postList: List<Food>, private val context: Context) :RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.food_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.BindTextValue!!.text = postList[position].name
        holder.BindContentValue!!.text = postList[position].calories
        holder.BindCardView!!.setOnClickListener{
            val intent = Intent(context,DetailActivity::class.java)
            intent.putExtra("ID",postList[position].id)
            context!!.startActivity(intent)
        }
        Picasso.get().load(postList[position].image).error(R.mipmap.ic_launcher)
            .placeholder(R.mipmap.ic_launcher)
            .into(holder.BindImageView)
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}