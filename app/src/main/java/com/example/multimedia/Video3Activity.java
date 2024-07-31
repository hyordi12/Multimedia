package com.example.multimedia;


import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class Video3Activity extends AppCompatActivity {

    private VideoView videoView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video3);

        videoView = findViewById(R.id.videoView3);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView.setVideoURI(videoUri);
        videoView.start();
    }
}

