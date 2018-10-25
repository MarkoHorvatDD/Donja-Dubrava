package com.marko.horvat.donjadubravaapp;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activty);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivty.this, MainActivity.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(SplashActivity.this).toBundle());
                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(SplashActivty.this).toBundle());
                }
                finish();
            }
        }, 1000);

    }
}
