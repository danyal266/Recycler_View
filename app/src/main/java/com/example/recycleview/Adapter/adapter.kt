package com.example.recycleview.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import com.example.recycleview.model.model

class adapter(private val context:Context, private val dataset:List<model>,val listener:foodItemClicked): RecyclerView.Adapter<adapter.repiViewHolder>() {
    class repiViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.food_image)
        val  text = itemView.findViewById<TextView>(R.id.text_food)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): repiViewHolder {
        val layoutinflate =
            LayoutInflater.from(parent.context).inflate(R.layout.sample_recycle, parent, false)
        val viewHolder = repiViewHolder(layoutinflate)
                  layoutinflate.setOnClickListener {
              listener.onItemClicked(dataset[viewHolder.adapterPosition])
          }
        return viewHolder
    }

    override fun onBindViewHolder(holder: repiViewHolder, position: Int) {
        val model = dataset[position]
        holder.imageView.setImageResource(model.pic)
        holder.text.text = model.text

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}
interface foodItemClicked{
    fun onItemClicked(item: model)
}
//








