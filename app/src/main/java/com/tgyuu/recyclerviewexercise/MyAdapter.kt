package com.tgyuu.recyclerviewexercise

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val datas: MutableList<data>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvName.text = datas[position].name
        holder.tvDesc.text = datas[position].desc
        holder.tvTime.text = datas[position].time
        holder.iv.setImageResource(datas[position].img)
    }

    override fun getItemCount(): Int {
        return datas.size
    }
}