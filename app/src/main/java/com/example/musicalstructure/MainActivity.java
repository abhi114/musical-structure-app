package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView romantic = (TextView) findViewById(R.id.Romantic);

        romantic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent romantic = new Intent(MainActivity.this,Romantic.class);
                startActivity(romantic);
            }

        });

        TextView party = (TextView) findViewById(R.id.Party);

        party.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent party = new Intent(MainActivity.this,Party.class);
                startActivity(party);
            }
        });

        TextView electronic = (TextView) findViewById(R.id.Electronic);

        electronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent electronic  = new Intent(MainActivity.this,Electronic.class);
                startActivity(electronic);
            }
        });



    }
}
