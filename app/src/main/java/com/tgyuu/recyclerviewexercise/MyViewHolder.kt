package com.tgyuu.recyclerviewexercise

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(val view : View) : RecyclerView.ViewHolder(view) {
    val tvDesc = view.findViewById<TextView>(R.id.item_tv_descripition)
    val tvName = view.findViewById<TextView>(R.id.item_tv_name)
    val tvTime = view.findViewById<TextView>(R.id.item_tv_time)
    val iv = view.findViewById<ImageView>(R.id.item_iv)
}