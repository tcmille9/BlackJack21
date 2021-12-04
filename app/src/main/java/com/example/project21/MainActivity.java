package com.example.project21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
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
    TextView tv = null;
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        fragment = (MainActivityFragment)fm.findFragmentById(R.id.fragment);
        tv = fragment.tv;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate menu and add items to action bar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void clickMethod(View view) {
        GetterSetter.playerScore = 0;
        GetterSetter.dealerScore = 0;
        GetterSetter.hit++;
        GetterSetter.buttonpressed = 1;

    }

    public void clickMethod1(View view) {
        GetterSetter.playerScore = 0;
        GetterSetter.dealerScore = 0;
        GetterSetter.dealerhit = GetterSetter.hit;
        GetterSetter.buttonpressed = 1;

    }

    public void clickMethod2(View view) {
        GetterSetter.playerScore = 0;
        GetterSetter.dealerScore = 0;
        GetterSetter.hit = 3;
        GetterSetter.dealerhit = 1;
        GetterSetter.buttonpressed = 1;
        fragment.shuffleDeck(GetterSetter.card);

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
}