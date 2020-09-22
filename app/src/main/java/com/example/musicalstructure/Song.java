package com.example.musicalstructure;

public class Song {

    private String mSongName;
    private String mSingerName;

    public Song(String SongName,String SingerName){
        mSongName=SongName;
        mSingerName=SingerName;
    }
    public String getSongName(){return mSongName;}

    public String getSingerName(){return  mSingerName;}
}
