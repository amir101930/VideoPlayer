package com.mohammadjavadtd.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //access to the videoViewWidget with findViewById
        VideoView videoViewMain = findViewById(R.id.videoViewMain);
        //add & Set MediaControllers on videoViewWidget
        MediaController mediaControllerMain = new MediaController(this);
        videoViewMain.setMediaController(mediaControllerMain);
        //getting url and convert to the Uri and set on videoViewWidget
        Uri videoUri = Uri.parse("https://hajifirouz1.cdn.asset.aparat.com/aparat-video/3b11bee74f86abf3cc4bcb3d5a06e72930270542-360p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6ImIxYTE4YTIxOGIyNDIyZDM4Yjg4NTM1NjkxY2NhYzQ4IiwiZXhwIjoxNjE0MTAxMjIzLCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.QyslZLhIaoHlBWPGNDYtZU9nZvlqJJZA_xT8DLnK-kY");
        videoViewMain.setVideoURI(videoUri);
        //Start Streaming video
        videoViewMain.start();
    }
}