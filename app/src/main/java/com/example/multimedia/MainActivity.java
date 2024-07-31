package com.example.multimedia;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAudio = findViewById(R.id.button_audio);
        Button buttonCamera = findViewById(R.id.button_camera);
        Button buttonVideo1 = findViewById(R.id.button_video1);
        Button buttonVideo2 = findViewById(R.id.button_video2);
        Button buttonVideo3 = findViewById(R.id.button_video3);

        buttonAudio.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AudioActivity.class)));
        buttonCamera.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CameraActivity.class)));
        buttonVideo1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Video1Activity.class)));
        buttonVideo2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Video2Activity.class)));
        buttonVideo3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Video3Activity.class)));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
