package com.example.project21;

import android.graphics.Color;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
Button but;
    Card[] card;
    int z = 0;
    View rootView;
    TextView tv;
    public MainActivityFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_main, container,
                false);
        tv = (TextView) rootView.findViewById(R.id.textView);
        tv.setTextColor(Color.WHITE);
        rootView.setBackgroundColor(Color.BLACK);

        card = new Card[52];

        for (int i = 0; i < 4; i++) { //suit
            for (int j = 0; j < 13; j++) { //rank aka value
                card[z] = new Card(i, j);
                z++;
            }
        }

        return rootView;
    }



}
