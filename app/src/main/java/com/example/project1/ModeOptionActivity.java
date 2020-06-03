package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ModeOptionActivity extends AppCompatActivity {

    ImageView i1,i2,i3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_option);
        i1=(ImageView)findViewById(R.id.one);
        i2=(ImageView)findViewById(R.id.two);
        i3=(ImageView)findViewById(R.id.back);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(ModeOptionActivity.this,onep.class);
                startActivity(i);
                ModeOptionActivity.this.finish();
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(ModeOptionActivity.this,MainActivity.class);
                startActivity(i);
                ModeOptionActivity.this.finish();

            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(ModeOptionActivity.this,LoginActivity.class);
                startActivity(i);
                ModeOptionActivity.this.finish();
            }
        });

    }
}
