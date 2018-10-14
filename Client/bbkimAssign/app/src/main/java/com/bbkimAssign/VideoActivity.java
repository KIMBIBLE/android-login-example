package com.bbkimAssign;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.bbkimAssign.R;

public class VideoActivity extends AppCompatActivity {
    private String MOVIE_URL = "http://bbkim92.com/storage/sample.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        android.widget.VideoView vv = (android.widget.VideoView) findViewById(R.id.videoView);

        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(vv);

// Set video link (mp4 format )

        Uri video = Uri.parse(MOVIE_URL);

        vv.setMediaController(mediaController);

        vv.setVideoURI(video);

        vv.requestFocus();

        vv.start();



    }
}
