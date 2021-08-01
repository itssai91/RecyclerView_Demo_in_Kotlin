package com.infranetstudio.com.recyclerviewdemo

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import java.util.zip.Inflater


class MyAdapter(val songs:ArrayList<SongList>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.title.text = songs[position].getTitle()
        holder.artist.text = songs[position].getArtist()
        holder.img.setImageResource(songs[position].getImage())
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var title  = itemView.findViewById<TextView>(R.id.tvItemTitle)
        var artist = itemView.findViewById<TextView>(R.id.tvItemDesc)
        var img = itemView.findViewById<ImageView>(R.id.ivImage)

    }
}