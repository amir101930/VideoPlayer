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
        Uri videoUri = Uri.parse("https://hajifirouz1.cdn.asset.aparat.com/aparat-video/c45b7fd66deba6ca3dbd9f1fd94d246630270848-240p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6IjMxN2Y2ZmU3NGQzMGFkYTM2MTVkNzg2YWY5ZjcwNjFmIiwiZXhwIjoxNjE0MTEyNTE4LCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.OveiEgSrRzXNO-NP5kYET1u5CC2DDPQL4uYtKT4aJjM");
        videoViewMain.setVideoURI(videoUri);
        //Start Streaming video
        videoViewMain.start();
    }
}