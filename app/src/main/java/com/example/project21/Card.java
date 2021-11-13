package com.example.project21;

public class Card {

    int suit;
    int rank;

    public Card(int suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
    }
    public int getNum() {
        return rank;
    }

    public String toString(){
        String numStr = "";
        switch(this.rank){
            case 1:
                numStr = "Ace";
                break;
            case 2:
                numStr = "Two";
                break;
            case 3:
                numStr = "Three";
                break;
            case 4:
                numStr = "Four";
                break;
            case 5:
                numStr = "Five";
                break;
            case 6:
                numStr = "Six";
                break;
            case 7:
                numStr = "Seven";
                break;
            case 8:
                numStr = "Eight";
                break;
            case 9:
                numStr = "Nine";
                break;
            case 10:
                numStr = "Ten";
                break;
            case 11:
                numStr = "Jack";
                break;
            case 12:
                numStr = "Queen";
                break;
            case 13:
                numStr = "King";
                break;
        }
        return String.format("%s of %s", numStr, suit.toString()); ;
    }
}
