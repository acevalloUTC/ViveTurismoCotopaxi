package com.example.marthita.viveturismo;

import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView mVideoView2= (VideoView)findViewById(R.id.videoView1);
        String uriPath2="android.resource://com.example.marthita.viveturismo/"+R.raw.logo;
        Uri uri2=Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();
        mVideoView2.start();
        new CountDownTimer(14000, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                Intent inten = new Intent(MainActivity.this, menu.class);
                startActivity(inten);
            }
        }.start();
    }
}
