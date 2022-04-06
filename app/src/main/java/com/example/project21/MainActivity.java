package com.example.project21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button but;
    FragmentManager fm;
    MainActivityFragment fragment;
    int i = 0;
    TextView tv,tv1 = null;
    int a = 0;

    private SoundPool soundPool;
    private int shuffle, deal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        fragment = (MainActivityFragment)fm.findFragmentById(R.id.fragment);
        tv = fragment.tv;
        //tv1 = fragment.tv1;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(2)
                    .setAudioAttributes(audioAttributes)
                    .build();
        }
        else {
            soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        }

        shuffle = soundPool.load(this, R.raw.shuffle, 1);
        deal = soundPool.load(this, R.raw.deal, 1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate menu and add items to action bar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //Hit button
    public void clickMethod(View view) {

        if(!GetterSetter.isStanding) {
            GetterSetter.playerScore = 0;
            GetterSetter.dealerScore = 0;
            GetterSetter.hit++;
            GetterSetter.buttonpressed = 1;
            soundPool.play(deal, 2,2, 0, 0, 1);
        }
    }

    //Stand button
    public void clickMethod1(View view) {

        GetterSetter.playerScore = 0;
        GetterSetter.dealerScore = 0;
        GetterSetter.dealerhit = GetterSetter.hit;
        GetterSetter.buttonpressed = 1;
        GetterSetter.isStanding = true;
    }

    //New Hand button
    public void clickMethod2(View view) {

        if(GetterSetter.isStanding) {
            GetterSetter.playerScore = 0;
            GetterSetter.dealerScore = 0;
            GetterSetter.hit = 3;
            GetterSetter.dealerhit = 1;
            GetterSetter.buttonpressed = 1;
            fragment.shuffleDeck(GetterSetter.card);
            GetterSetter.playerHasAce = false;
            GetterSetter.dealerHasAce = false;
            GetterSetter.isStanding = false;
            soundPool.play(shuffle, 0.5F,0.5F, 0, 0, 1);

        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }
}