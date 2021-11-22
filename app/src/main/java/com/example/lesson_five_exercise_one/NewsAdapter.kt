package com.example.lesson_five_exercise_one

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_news.view.*


class NewsAdapter(val context: Context, val news: ArrayList<News>): RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_news,parent,false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.icon.setImageBitmap(news[position].icon)
        holder.header.text = news[position].header
        holder.newstext.text = news[position].news


    }

    override fun getItemCount(): Int {
        return news.size
    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val icon = itemView.ivIcon
    val header = itemView.tvHeader
    val newstext = itemView.tvNewsText
}

