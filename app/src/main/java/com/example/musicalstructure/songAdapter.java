package com.example.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class songAdapter extends ArrayAdapter<Song> {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View SongitemView = convertView;
        if(SongitemView==null){
            SongitemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Song currentSong = getItem(position);

        TextView songTextView = (TextView) SongitemView.findViewById(R.id.Song_text_view);
        songTextView.setText(currentSong.getSongName());

        TextView SingerTextView = (TextView) SongitemView.findViewById(R.id.singer_text_view);
        SingerTextView.setText(currentSong.getSingerName());

        return SongitemView;
    }
    public songAdapter(Activity context, ArrayList<Song> songs){
        super(context,0,songs);
    }
}
