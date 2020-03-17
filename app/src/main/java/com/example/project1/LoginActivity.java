package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    private ImageView i1,i2,i3,i4,quit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.star);
        final MediaPlayer mp1 = MediaPlayer.create(this,R.raw.background_music);
        //mp1.setLooping(true);

            mp1.start();
            mp1.setLooping(true);

        i1= (ImageView)findViewById(R.id.img1);
        i2= (ImageView)findViewById(R.id.img2);
        quit=(ImageView)findViewById(R.id.imageView7);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    mp1.setLooping(false);
                    mp1.stop();
                    //mp1.release();
                    finish();
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mp1.isPlaying())
                {
                    mp1.start();
                }
            }
        });
        i4= (ImageView)findViewById(R.id.musoff);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp1.isPlaying())
                {
                    mp1.pause();
                }

            }
        });
        i3= (ImageView)findViewById(R.id.img3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(LoginActivity.this,PopupActivity.class));
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mp.start();
                next();
            }
        });
    }


    private void next()
    {
        Intent i = new Intent(this , ModeOptionActivity.class);
        startActivity(i);
        LoginActivity.this.finish();

    }

}
