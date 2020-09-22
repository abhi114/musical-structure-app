package com.example.musicalstructure;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Romantic extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Naina","Arijit Singh"));
        songs.add(new Song("Kabira","Arijit Singh"));
        songs.add(new Song("Channa Mereya","Arijit Singh"));

        songAdapter adapter = new songAdapter(this,songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Song currentSong = (Song) adapterView.getItemAtPosition(position);

        String songForPlaying = currentSong.getSongName();
        String singerForPlaying = currentSong.getSingerName();

        Intent songIntent = new Intent(this,NowPlaying.class);

        songIntent.putExtra("song",songForPlaying);
        songIntent.putExtra("singer",singerForPlaying);

        startActivity(songIntent);
    }
}
