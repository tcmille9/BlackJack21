package com.example.project21;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import androidx.fragment.app.Fragment;
/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    Button but;
    Card[] card;
    int z = 0;
    View rootView;
    TextView tv, tv1, gg;
    Handler mHandler;

    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_main, container,
                false);
        tv = rootView.findViewById(R.id.textView);
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(21);
        tv1 = rootView.findViewById(R.id.textView2);
        tv1.setTextColor(Color.WHITE);
        tv1.setTextSize(21);
        gg = rootView.findViewById(R.id.textView3);
        gg.setTextColor(Color.WHITE);
        gg.setTextSize(21);
        
        rootView.setBackgroundColor(Color.TRANSPARENT);
        //rootView.setBackgroundColor(Color.BLACK);

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

        mHandler = new Handler();
        mHandler.post(mUpdate);

        return rootView;
    }

    private Runnable mUpdate = new Runnable() {
        public void run() {

            if(GetterSetter.playerScore <= 21) {
                tv.setText("Player: " + GetterSetter.playerScore + " ");
                tv1.setText("Dealer: " + GetterSetter.dealerScore + " ");
                gg.setText("");
                //tv.setText("Player: " + GetterSetter.playerScore + " ");
                //tv1.setText("Dealer: " + GetterSetter.dealerScore + " ");
            }
            else {
                tv.setText(" ");
                tv1.setText(" ");
                gg.setText("BUST!");
                GetterSetter.isStanding = true;
            }

            if(GetterSetter.buttonpressed == 0) {
                if(GetterSetter.dealerhit > 1) {
                    if(GetterSetter.dealerScore < GetterSetter.playerScore && GetterSetter.dealerScore != 0) {
                        GetterSetter.playerScore = 0;
                        GetterSetter.dealerScore = 0;
                        if(GetterSetter.isStanding) {
                            GetterSetter.dealerhit++;
                            GetterSetter.buttonpressed = 1;
                        }
                    }
                }
            }


            if(GetterSetter.isStanding && (GetterSetter.dealerScore >= GetterSetter.playerScore)) {
                tv.setText("You lose!");
            }
            if(GetterSetter.dealerScore > 21) {
                tv.setText("YOU WIN!");
                tv1.setText("Dealer bust!");
            }

            mHandler.postDelayed(this, 5);
        }
    };


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
