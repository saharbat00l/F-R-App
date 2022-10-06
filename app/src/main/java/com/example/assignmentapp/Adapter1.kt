package com.example.cardsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentapp.R

class Adapter1: RecyclerView.Adapter<Adapter1.ViewHolder>() {

    private var title = arrayOf("Chapter One" , "Chapter Two",
        "Chapter Three", "Chapter Four", "Chapter Five", "Chapter Six", "Chapter Seven", "Chapter Eight")
    private var details = arrayOf("Item Details", "Item Details", "Item Details",
        "Item Details","Item Details","Item Details","Item Details","Item Details","Item Details" )
    private var images = arrayOf(R.drawable.image,R.drawable.image,R.drawable.image,
        R.drawable.image,R.drawable.image,R.drawable.image, R.drawable.image,R.drawable.image )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])

    }

    override fun getItemCount(): Int {
        return title.size
    }





    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init{
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }

}