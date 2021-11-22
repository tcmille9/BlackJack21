package com.example.project21;

import android.graphics.Color;
//import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    Button but;
    Card[] card;
    int z = 0;
    View rootView;
    TextView tv;

    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_main, container,
                false);
        tv = (TextView) rootView.findViewById(R.id.textView);
        tv.setTextColor(Color.WHITE);
        rootView.setBackgroundColor(Color.BLACK);

        //Creates the deck array
        card = new Card[52];

        //Assigns a rank and suit to each card in the card array
        for (int suit = 0; suit < 4; suit++) { //suit
            for (int rank = 0; rank < 13; rank++) { //rank aka value
                card[z] = new Card(suit, rank);
                z++;
            }
        }
        card = shuffleDeck(card);
        GetterSetter.card = card;

        return rootView;
    }

    public Card[] shuffleDeck(Card[] deck) {
        Random rnd = new Random();
        Card tempCard = new Card(0, 0);
        for (int shuffleCount = 0; shuffleCount < 52; shuffleCount++) {
            int randomCard = rnd.nextInt(52);
            tempCard = deck[randomCard];
            deck[randomCard] = deck[shuffleCount];
            deck[shuffleCount] = tempCard;
        }
        return deck;
    }



}
