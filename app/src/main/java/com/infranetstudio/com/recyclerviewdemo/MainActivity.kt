package com.infranetstudio.com.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.infranetstudio.com.recyclerviewdemo.databinding.ActivityMainBinding
import kotlin.concurrent.fixedRateTimer

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var songs: ArrayList<SongList>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        songs = ArrayList<SongList>()
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))
        songs!!.add(SongList("Kal Ho Na Ho", "Sonu Nigam", R.drawable.img_avatar))

        binding.songsList.adapter = MyAdapter(songs!!)
        binding.songsList.layoutManager = LinearLayoutManager(this)
    }


}