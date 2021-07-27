package com.infranetstudio.com.recyclerviewdemo

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater


class MyAdapter(val songs: ArrayList<SongList>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        return MyViewHolder(
//            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
//        )
        val inflate: LayoutInflater? = LayoutInflater.from(parent.context)
        val view: View = inflate!!.inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = songs[position].getTitle()
        holder.artist.text = songs[position].getArtist()
        holder.image.setImageResource(songs[position].getImage())

        var color = "#EEEEEE"
        if (position % 2 == 0) {
            color = "#CCCCCC"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById<TextView>(R.id.tvItemTitle)
        val artist = itemView.findViewById<TextView>(R.id.tvItemDesc)
        val image = itemView.findViewById<ImageView>(R.id.ivImage)
        val container = itemView.findViewById<LinearLayout>(R.id.container)

    }
}