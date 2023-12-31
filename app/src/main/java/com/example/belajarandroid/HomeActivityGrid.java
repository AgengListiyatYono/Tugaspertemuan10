package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class HomeActivityGrid extends AppCompatActivity {

    CardView button_hello;
    CardView button_count;
    CardView button_fibonacci;
    CardView button_sinaida;
    CardView button_twoactivity;
    CardView button_alarm;
    CardView button_maps;
    Uri geoLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_grid);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        button_hello = (CardView) findViewById(R.id.to_hello);
        button_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_hello = new Intent(HomeActivityGrid.this, HelloActivity.class);
                startActivity(intent_hello);
            }
        });

        button_count = (CardView) findViewById(R.id.to_count);
        button_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_count = new Intent(HomeActivityGrid.this, CountActivity.class);
                startActivity(intent_count);
            }
        });

        button_twoactivity = (CardView) findViewById(R.id.to_twoactivity);
        button_twoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_twoactivity = new Intent(HomeActivityGrid.this, TwoActivity.class);
                startActivity(intent_twoactivity);
            }
        });

        button_sinaida = (CardView) findViewById(R.id.to_sianida);
        button_sinaida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_sinaida = new Intent(HomeActivityGrid.this, SinaidaActivity.class);
                startActivity(intent_sinaida);
            }
        });

        button_fibonacci = (CardView) findViewById(R.id.to_fibonacci);
        button_fibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_fibonacci = new Intent(HomeActivityGrid.this, MainActivity.class);
                startActivity(intent_fibonacci);
            }
        });

        button_alarm = (CardView) findViewById(R.id.to_alarm);
        button_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_alarm = new Intent(HomeActivityGrid.this, AlarmActivity.class);
                startActivity(intent_alarm);
            }
        });

        button_maps = (CardView) findViewById(R.id.to_map);
        button_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(geoLocation);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }
}