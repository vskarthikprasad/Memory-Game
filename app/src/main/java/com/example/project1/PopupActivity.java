package com.example.project1;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class PopupActivity extends Activity {

    ImageView i7,i6,i5;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.9),(int)(height*.75));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x=0;
        params.y=-20;

        getWindow().setAttributes(params);
        i5=(ImageView)findViewById(R.id.imageView5);
        i6=(ImageView)findViewById(R.id.imageView6);
        i7=(ImageView)findViewById(R.id.imageView7);




    }
    public void open1(View view)
    {
        Intent web1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.androbaby.game2048"));
        startActivity(web1);

    }
    public void open2(View view) {
        Intent web2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=nerdscorner.memory.fruits"));
        startActivity(web2);
    }
    public void open3(View view) {
        Intent web3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.bigduckgames.flow"));
        startActivity(web3);
    }


}
