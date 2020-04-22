package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.net.URI;
import java.time.Instant;
import java.time.temporal.TemporalAdjuster;

public class MainActivity extends AppCompatActivity {
    ImageView imgv;
    String indirizzo[]={"https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSf5U9gSMY3EpBqygzMEGnlnhA5-IICHcCVxtAf_9vo7Dh6PQ7S&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ-M77EWvDunVLWbs4Tu9dsvd4SMi5MDJvN6j4O908cKHyEpFAO&usqp=CAU"};
    private Instant Glide;
    Context context = this;
    private ImageView ProfileImage;
    private Object Image;
    Button b1;
    int g=-1;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        b1=findViewById (R.id.button);

        b1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
               g=g+1;
               if (g>1) g=0;
        ProfileImage=findViewById(R.id.imageView);
        Picasso.with(MainActivity.this)
                .load( indirizzo[g])
                .placeholder(R.drawable.icon_user)
                .into(ProfileImage);
            }

        });
    }
}
