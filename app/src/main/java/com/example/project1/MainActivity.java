package com.example.project1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    TextView tv_p1,tv_p2;
    ImageView iv_11,iv_12,iv_13,iv_14,iv_21,iv_22,iv_23,iv_24,iv_31,iv_32,iv_33,iv_34,ib;
    Integer[] cardsArray = { 101, 102,103,104,105,106,201,202,203,204,205,206 };
    int image101,image102,image103,image104,image105,image106,image201,image202,image203,image204,image205,image206;
    int  firstcard,secondcard,clickedfirst,clickedsecond,cardno=1,turn=1,ppnts=0,cpnts=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
       // final MediaPlayer mp1 = MediaPlayer.create(this,R.raw.background_music);
        /*mp1.setLooping(true);*/
       // mp1.start();
        setContentView(R.layout.activity_main);

        tv_p1=(TextView)findViewById(R.id.tv_p1);
        tv_p2=(TextView)findViewById(R.id.tv_p2);
        iv_11=(ImageView)findViewById(R.id.iv_11);
        iv_12=(ImageView)findViewById(R.id.iv_12);
        iv_13=(ImageView)findViewById(R.id.iv_13);
        iv_14=(ImageView)findViewById(R.id.iv_14);
        iv_21=(ImageView)findViewById(R.id.iv_21);
        iv_22=(ImageView)findViewById(R.id.iv_22);
        iv_23=(ImageView)findViewById(R.id.iv_23);
        iv_24=(ImageView)findViewById(R.id.iv_24);
        iv_31=(ImageView)findViewById(R.id.iv_31);
        iv_32=(ImageView)findViewById(R.id.iv_32);
        iv_33=(ImageView)findViewById(R.id.iv_33);
        iv_34=(ImageView)findViewById(R.id.iv_34);
        ib=(ImageView)findViewById(R.id.back);

      /*ib.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = new Intent(MainActivity.this , LoginActivity.class);
              startActivity(i);
              MainActivity.this.finish();
          }
      });*/




        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        front();
        Collections.shuffle(Arrays.asList(cardsArray));


        tv_p2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                modify(iv_11,theCard);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                modify(iv_12,theCard);

            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                modify(iv_13,theCard);

            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                modify(iv_14,theCard);

            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                modify(iv_21,theCard);

            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                modify(iv_22,theCard);

            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                modify(iv_23,theCard);

            }
        });

        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                modify(iv_24,theCard);

            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                modify(iv_31,theCard);
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                modify(iv_32,theCard);

            }
        });

        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                modify(iv_33,theCard);

            }
        });

        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int theCard = Integer.parseInt((String) v.getTag());
                modify(iv_34,theCard);

            }
        });
    }



    private void modify(ImageView iv , int card)
    {
        if(cardsArray[card] == 101 )
        {
            iv.setImageResource(image101);
        }
        else if(cardsArray[card] == 102 )
        {
            iv.setImageResource(image102);
        }
        else if(cardsArray[card] == 103 )
        {
            iv.setImageResource(image103);
        }
        else if(cardsArray[card] == 104 )
        {
            iv.setImageResource(image104);
        }
        else if(cardsArray[card] == 105 )
        {
            iv.setImageResource(image105);
        }
        else if(cardsArray[card] == 106 )
        {
            iv.setImageResource(image106);
        }
        else if(cardsArray[card] == 201 )
        {
            iv.setImageResource(image201);
        }
        else if(cardsArray[card] == 202 )
        {
            iv.setImageResource(image202);
        }
        else if(cardsArray[card] == 203 )
        {
            iv.setImageResource(image203);
        }
        else if(cardsArray[card] == 204 )
        {
            iv.setImageResource(image204);
        }
        else if(cardsArray[card] == 205 )
        {
            iv.setImageResource(image205);
        }
        else if(cardsArray[card] == 206)
        {
            iv.setImageResource(image206);
        }

        if(cardno == 1)
        {
            firstcard = cardsArray[card];
            if(firstcard > 200)
            {
                firstcard = firstcard - 100;
            }
            cardno=2;
            clickedfirst=card;
            iv.setEnabled(false);
        }
        else if(cardno == 2)
        {
            secondcard = cardsArray[card];
            if(secondcard > 200)
            {
                secondcard = secondcard - 100;
            }
            cardno=1;
            clickedsecond=card;


            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    caluclate();
                }
            }, 1000);
        }
    }

    private void caluclate()
    {
        if(firstcard == secondcard)
        {
            MediaPlayer mp2 = MediaPlayer.create(this,R.raw.correct_answer);
            mp2.start();
            if(clickedfirst == 0)
            {
                iv_11.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst == 1)
            {
                iv_12.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst == 2)
            {
                iv_13.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst == 3)
            {
                iv_14.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst == 4)
            {
                iv_21.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst == 5)
            {
                iv_22.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst == 6)
            {
                iv_23.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst == 7)
            {
                iv_24.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst == 8)
            {
                iv_31.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst == 9)
            {
                iv_32.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst == 10)
            {
                iv_33.setVisibility(View.INVISIBLE);
            }
            else if(clickedfirst == 11)
            {
                iv_34.setVisibility(View.INVISIBLE);
            }

            if(clickedsecond == 0)
            {
                iv_11.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond == 1)
            {
                iv_12.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond == 2)
            {
                iv_13.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond == 3)
            {
                iv_14.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond == 4)
            {
                iv_21.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond == 5)
            {
                iv_22.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond == 6)
            {
                iv_23.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond == 7)
            {
                iv_24.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond == 8)
            {
                iv_31.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond == 9)
            {
                iv_32.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond == 10)
            {
                iv_33.setVisibility(View.INVISIBLE);
            }
            else if(clickedsecond == 11)
            {
                iv_34.setVisibility(View.INVISIBLE);
            }

            if(turn == 1)
            {
                ppnts++;
                tv_p1.setText("P1: " + ppnts);
            }
            else if(turn == 2)
            {
                cpnts++;
                tv_p2.setText("P2: " + ppnts);
            }
        }
        else
        {
            iv_11.setImageResource(R.drawable.i1);
            iv_12.setImageResource(R.drawable.i1);
            iv_13.setImageResource(R.drawable.i1);
            iv_14.setImageResource(R.drawable.i1);
            iv_21.setImageResource(R.drawable.i1);
            iv_22.setImageResource(R.drawable.i1);
            iv_23.setImageResource(R.drawable.i1);
            iv_24.setImageResource(R.drawable.i1);
            iv_31.setImageResource(R.drawable.i1);
            iv_32.setImageResource(R.drawable.i1);
            iv_33.setImageResource(R.drawable.i1);
            iv_34.setImageResource(R.drawable.i1);

            if(turn ==1)
            {
                turn=2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            }
            else if(turn ==2)
            {
                turn=1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);
            }

        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        checkEnd();
    }

    private void checkEnd()
    {
        if(iv_11.getVisibility() == View.INVISIBLE && iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE && iv_14.getVisibility() == View.INVISIBLE && iv_21.getVisibility() == View.INVISIBLE && iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE && iv_24.getVisibility() == View.INVISIBLE && iv_31.getVisibility() == View.INVISIBLE && iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE && iv_34.getVisibility() == View.INVISIBLE)
        {

            AlertDialog.Builder alrtdlgbld = new AlertDialog.Builder(MainActivity.this);
            alrtdlgbld
                    .setMessage("Game Over!\n P1: " + ppnts +"\n P2: " + cpnts)
                    .setCancelable(false)
                    .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                            finish();


                        }
                    })
                    .setNegativeButton("Back", new DialogInterface.OnClickListener() {
                        @Override


                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(MainActivity.this , LoginActivity.class);
                            startActivity(intent);
                            MainActivity.this.finish();

                        }
                    });

            AlertDialog alrtdlg = alrtdlgbld.create();
            alrtdlg.show();



        }
    }

    public void prev(View view)
    {
        Intent i = new Intent(MainActivity.this , ModeOptionActivity.class);
        startActivity(i);
        MainActivity.this.finish();

    }

    private void front()
    {
        image101=R.drawable.i2;
        image102=R.drawable.i3;
        image103=R.drawable.i4;
        image104=R.drawable.i5;
        image105=R.drawable.i6;
        image106=R.drawable.i7;
        image201=R.drawable.i21;
        image202=R.drawable.i31;
        image203=R.drawable.i41;
        image204=R.drawable.i51;
        image205=R.drawable.i61;
        image206=R.drawable.i71;

    }
}
