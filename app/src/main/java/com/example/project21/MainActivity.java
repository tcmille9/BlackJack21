package com.example.project21;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toolbar;

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
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        FragmentManager fm = getSupportFragmentManager();
        fragment = fm.findFragmentById(R.id.fragment);
        tv = fragment.tv;


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate menu and add items to action bar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void clickMethod(View view) {
        tv.setText("Card Number:" + a + " suit:" + fragment.card[a].suit + " rank:" + fragment.card[a].rank);
        a++;
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