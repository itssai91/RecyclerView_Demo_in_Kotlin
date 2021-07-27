package com.infranetstudio.com.recyclerviewdemo

class SongList(private var title: String, private var artist: String, private var image:Int) {

    fun getTitle(): String {
        return title
    }

     fun setTitle(title: String) {
        this.title = title
    }

    fun getArtist(): String {
        return artist
    }

     fun setArtist(artist: String) {
        this.artist = artist
    }

    fun getImage():Int{
        return image
    }

    fun setImage(image:Int){
        this.image = image
    }

}