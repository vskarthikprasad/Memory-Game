package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class StartActivity extends AppCompatActivity {


    Timer t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_start);
        t = new Timer();
        t.schedule(new TimerTask()
        {
            @Override
            public void run() {
                Intent intent = new Intent(StartActivity.this , LoginActivity.class);
                startActivity(intent);
                StartActivity.this.finish();


            }
        },2000);
    }
}
