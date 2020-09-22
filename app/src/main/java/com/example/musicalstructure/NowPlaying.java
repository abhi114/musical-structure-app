package com.example.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        playing();
    }

    public void playing(){
        Intent songIntent = getIntent();

        TextView songTextView = (TextView) findViewById(R.id.song_name);
        String songForPlaying = songIntent.getStringExtra("song");
        songTextView.setText(songForPlaying);

        TextView singerTextView = (TextView) findViewById(R.id.singer_name);
        String singerForPlaying = songIntent.getStringExtra("singer");
        singerTextView.setText(singerForPlaying);

    }
}
