package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.concurrent.Delayed;

public class splashAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // membuat timer dan berpindah activity
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // merubah activity ke activity lain
                Intent gotogetstarted = new Intent(splashAct.this,getStartedAct.class);
                startActivity(gotogetstarted);
                finish();
            }
        }, 1000); // 1000ms = 1s
    }
}
