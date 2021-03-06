package com.example.project21;

import android.graphics.Bitmap;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

public class CardDraw {
    int x,y;
    Bitmap cardBack;
    Bitmap twoSpades, threeSpades, fourSpades, fiveSpades, sixSpades, sevenSpades, eightSpades, nineSpades, tenSpades, jackSpades, queenSpades, kingSpades, aceSpades;
    Bitmap twoClubs, threeClubs, fourClubs, fiveClubs, sixClubs, sevenClubs, eightClubs, nineClubs, tenClubs, jackClubs, queenClubs, kingClubs, aceClubs;
    Bitmap twoHearts, threeHearts, fourHearts, fiveHearts, sixHearts, sevenHearts, eightHearts, nineHearts, tenHearts, jackHearts, queenHearts, kingHearts, aceHearts;
    Bitmap twoDiamonds, threeDiamonds, fourDiamonds, fiveDiamonds, sixDiamonds, sevenDiamonds, eightDiamonds, nineDiamonds, tenDiamonds, jackDiamonds, queenDiamonds, kingDiamonds, aceDiamonds;

    public CardDraw(Context context) {
        cardBack = BitmapFactory.decodeResource(context.getResources(), R.drawable.back);
        cardBack = Bitmap.createScaledBitmap(cardBack, cardBack.getWidth()/4, cardBack.getWidth()/3, false);

        //Spades
        twoSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_2);
        twoSpades = Bitmap.createScaledBitmap(twoSpades, twoSpades.getWidth()/4, twoSpades.getWidth()/3, false);
        threeSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_3);
        threeSpades = Bitmap.createScaledBitmap(threeSpades, threeSpades.getWidth()/4, threeSpades.getWidth()/3, false);
        fourSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_4);
        fourSpades = Bitmap.createScaledBitmap(fourSpades, fourSpades.getWidth()/4, fourSpades.getWidth()/3, false);
        fiveSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_5);
        fiveSpades = Bitmap.createScaledBitmap(fiveSpades, fiveSpades.getWidth()/4, fiveSpades.getWidth()/3, false);
        sixSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_6);
        sixSpades = Bitmap.createScaledBitmap(sixSpades, sixSpades.getWidth()/4, sixSpades.getWidth()/3, false);
        sevenSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_7);
        sevenSpades = Bitmap.createScaledBitmap(sevenSpades, sevenSpades.getWidth()/4, sevenSpades.getWidth()/3, false);
        eightSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_8);
        eightSpades = Bitmap.createScaledBitmap(eightSpades, eightSpades.getWidth()/4, eightSpades.getWidth()/3, false);
        nineSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_9);
        nineSpades = Bitmap.createScaledBitmap(nineSpades, nineSpades.getWidth()/4, nineSpades.getWidth()/3, false);
        tenSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_10);
        tenSpades = Bitmap.createScaledBitmap(tenSpades, tenSpades.getWidth()/4, tenSpades.getWidth()/3, false);
        jackSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_jack);
        jackSpades = Bitmap.createScaledBitmap(jackSpades, jackSpades.getWidth()/4, jackSpades.getWidth()/3, false);
        queenSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_queen);
        queenSpades = Bitmap.createScaledBitmap(queenSpades, queenSpades.getWidth()/4, queenSpades.getWidth()/3, false);
        kingSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_king);
        kingSpades = Bitmap.createScaledBitmap(kingSpades, kingSpades.getWidth()/4, kingSpades.getWidth()/3, false);
        aceSpades = BitmapFactory.decodeResource(context.getResources(), R.drawable.spades_ace);
        aceSpades = Bitmap.createScaledBitmap(aceSpades, aceSpades.getWidth()/4, aceSpades.getWidth()/3, false);

        //Clubs
        twoClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_2);
        twoClubs = Bitmap.createScaledBitmap(twoClubs, twoClubs.getWidth()/4, twoClubs.getWidth()/3, false);
        threeClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_3);
        threeClubs = Bitmap.createScaledBitmap(threeClubs, threeClubs.getWidth()/4, threeClubs.getWidth()/3, false);
        fourClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_4);
        fourClubs = Bitmap.createScaledBitmap(fourClubs, fourClubs.getWidth()/4, fourClubs.getWidth()/3, false);
        fiveClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_5);
        fiveClubs = Bitmap.createScaledBitmap(fiveClubs, fiveClubs.getWidth()/4, fiveClubs.getWidth()/3, false);
        sixClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_6);
        sixClubs = Bitmap.createScaledBitmap(sixClubs, sixClubs.getWidth()/4, sixClubs.getWidth()/3, false);
        sevenClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_7);
        sevenClubs = Bitmap.createScaledBitmap(sevenClubs, sevenClubs.getWidth()/4, sevenClubs.getWidth()/3, false);
        eightClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_8);
        eightClubs = Bitmap.createScaledBitmap(eightClubs, eightClubs.getWidth()/4, eightClubs.getWidth()/3, false);
        nineClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_9);
        nineClubs = Bitmap.createScaledBitmap(nineClubs, nineClubs.getWidth()/4, nineClubs.getWidth()/3, false);
        tenClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_10);
        tenClubs = Bitmap.createScaledBitmap(tenClubs, tenClubs.getWidth()/4, tenClubs.getWidth()/3, false);
        jackClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_jack);
        jackClubs = Bitmap.createScaledBitmap(jackClubs, jackClubs.getWidth()/4, jackClubs.getWidth()/3, false);
        queenClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_queen);
        queenClubs = Bitmap.createScaledBitmap(queenClubs, queenClubs.getWidth()/4, queenClubs.getWidth()/3, false);
        kingClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_king);
        kingClubs = Bitmap.createScaledBitmap(kingClubs, kingClubs.getWidth()/4, kingClubs.getWidth()/3, false);
        aceClubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.clubs_ace);
        aceClubs = Bitmap.createScaledBitmap(aceClubs, aceClubs.getWidth()/4, aceClubs.getWidth()/3, false);

        //Hearts
        twoHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_2);
        twoHearts = Bitmap.createScaledBitmap(twoHearts, twoHearts.getWidth()/4, twoHearts.getWidth()/3, false);
        threeHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_3);
        threeHearts = Bitmap.createScaledBitmap(threeHearts, threeHearts.getWidth()/4, threeHearts.getWidth()/3, false);
        fourHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_4);
        fourHearts = Bitmap.createScaledBitmap(fourHearts, fourHearts.getWidth()/4, fourHearts.getWidth()/3, false);
        fiveHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_5);
        fiveHearts = Bitmap.createScaledBitmap(fiveHearts, fiveHearts.getWidth()/4, fiveHearts.getWidth()/3, false);
        sixHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_6);
        sixHearts = Bitmap.createScaledBitmap(sixHearts, sixHearts.getWidth()/4, sixHearts.getWidth()/3, false);
        sevenHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_7);
        sevenHearts = Bitmap.createScaledBitmap(sevenHearts, sevenHearts.getWidth()/4, sevenHearts.getWidth()/3, false);
        eightHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_8);
        eightHearts = Bitmap.createScaledBitmap(eightHearts, eightHearts.getWidth()/4, eightHearts.getWidth()/3, false);
        nineHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_9);
        nineHearts = Bitmap.createScaledBitmap(nineHearts, nineHearts.getWidth()/4, nineHearts.getWidth()/3, false);
        tenHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_10);
        tenHearts = Bitmap.createScaledBitmap(tenHearts, tenHearts.getWidth()/4, tenHearts.getWidth()/3, false);
        jackHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_jack);
        jackHearts = Bitmap.createScaledBitmap(jackHearts, jackHearts.getWidth()/4, jackHearts.getWidth()/3, false);
        queenHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_queen);
        queenHearts = Bitmap.createScaledBitmap(queenHearts, queenHearts.getWidth()/4, queenHearts.getWidth()/3, false);
        kingHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_king);
        kingHearts = Bitmap.createScaledBitmap(kingHearts, kingHearts.getWidth()/4, kingHearts.getWidth()/3, false);
        aceHearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.hearts_ace);
        aceHearts = Bitmap.createScaledBitmap(aceHearts, aceHearts.getWidth()/4, aceHearts.getWidth()/3, false);

        //Diamonds
        twoDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_2);
        twoDiamonds = Bitmap.createScaledBitmap(twoDiamonds, twoDiamonds.getWidth()/4, twoDiamonds.getWidth()/3, false);
        threeDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_3);
        threeDiamonds = Bitmap.createScaledBitmap(threeDiamonds, threeDiamonds.getWidth()/4, threeDiamonds.getWidth()/3, false);
        fourDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_4);
        fourDiamonds = Bitmap.createScaledBitmap(fourDiamonds, fourDiamonds.getWidth()/4, fourDiamonds.getWidth()/3, false);
        fiveDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_5);
        fiveDiamonds = Bitmap.createScaledBitmap(fiveDiamonds, fiveDiamonds.getWidth()/4, fiveDiamonds.getWidth()/3, false);
        sixDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_6);
        sixDiamonds = Bitmap.createScaledBitmap(sixDiamonds, sixDiamonds.getWidth()/4, sixDiamonds.getWidth()/3, false);
        sevenDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_7);
        sevenDiamonds = Bitmap.createScaledBitmap(sevenDiamonds, sevenDiamonds.getWidth()/4, sevenDiamonds.getWidth()/3, false);
        eightDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_8);
        eightDiamonds = Bitmap.createScaledBitmap(eightDiamonds, eightDiamonds.getWidth()/4, eightDiamonds.getWidth()/3, false);
        nineDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_9);
        nineDiamonds = Bitmap.createScaledBitmap(nineDiamonds, nineDiamonds.getWidth()/4, nineDiamonds.getWidth()/3, false);
        tenDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_10);
        tenDiamonds = Bitmap.createScaledBitmap(tenDiamonds, tenDiamonds.getWidth()/4, tenDiamonds.getWidth()/3, false);
        jackDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_jack);
        jackDiamonds = Bitmap.createScaledBitmap(jackDiamonds, jackDiamonds.getWidth()/4, jackDiamonds.getWidth()/3, false);
        queenDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_queen);
        queenDiamonds = Bitmap.createScaledBitmap(queenDiamonds, queenDiamonds.getWidth()/4, queenDiamonds.getWidth()/3, false);
        kingDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_king);
        kingDiamonds = Bitmap.createScaledBitmap(kingDiamonds, kingDiamonds.getWidth()/4, kingDiamonds.getWidth()/3, false);
        aceDiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.diamonds_ace);
        aceDiamonds = Bitmap.createScaledBitmap(aceDiamonds, aceDiamonds.getWidth()/4, aceDiamonds.getWidth()/3, false);
    }

    public void getCanvasDimensions(Canvas canvas) {
        y = canvas.getHeight();
        x = canvas.getWidth();
    }

    public void deal(Canvas canvas, int cardnum, int xdistance, int ydistance) {

        getCanvasDimensions(canvas);

        //Face-down on dealer's first draw
        if (cardnum == 501) {
            canvas.drawBitmap(cardBack, ((x / 2) - 500) + xdistance, (y /2) + ydistance, null );
        }
        else {
            //Spades
            if (GetterSetter.card[cardnum].suit == 0) {

                if (GetterSetter.card[cardnum].rank == 0) {
                    canvas.drawBitmap(twoSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 1) {
                    canvas.drawBitmap(threeSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 2) {
                    canvas.drawBitmap(fourSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 3) {
                    canvas.drawBitmap(fiveSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 4) {
                    canvas.drawBitmap(sixSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 5) {
                    canvas.drawBitmap(sevenSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 6) {
                    canvas.drawBitmap(eightSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 7) {
                    canvas.drawBitmap(nineSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 8) {
                    canvas.drawBitmap(tenSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 9) {
                    canvas.drawBitmap(jackSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 10) {
                    canvas.drawBitmap(queenSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 11) {
                    canvas.drawBitmap(kingSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 12) {
                    canvas.drawBitmap(aceSpades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
            }

            //Clubs
            if (GetterSetter.card[cardnum].suit == 1) {

                if (GetterSetter.card[cardnum].rank == 0) {
                    canvas.drawBitmap(twoClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 1) {
                    canvas.drawBitmap(threeClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 2) {
                    canvas.drawBitmap(fourClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 3) {
                    canvas.drawBitmap(fiveClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 4) {
                    canvas.drawBitmap(sixClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 5) {
                    canvas.drawBitmap(sevenClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 6) {
                    canvas.drawBitmap(eightClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 7) {
                    canvas.drawBitmap(nineClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 8) {
                    canvas.drawBitmap(tenClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 9) {
                    canvas.drawBitmap(jackClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 10) {
                    canvas.drawBitmap(queenClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 11) {
                    canvas.drawBitmap(kingClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 12) {
                    canvas.drawBitmap(aceClubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
            }

            //Hearts
            if (GetterSetter.card[cardnum].suit == 2) {

                if (GetterSetter.card[cardnum].rank == 0) {
                    canvas.drawBitmap(twoHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 1) {
                    canvas.drawBitmap(threeHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 2) {
                    canvas.drawBitmap(fourHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 3) {
                    canvas.drawBitmap(fiveHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 4) {
                    canvas.drawBitmap(sixHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 5) {
                    canvas.drawBitmap(sevenHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 6) {
                    canvas.drawBitmap(eightHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 7) {
                    canvas.drawBitmap(nineHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 8) {
                    canvas.drawBitmap(tenHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 9) {
                    canvas.drawBitmap(jackHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 10) {
                    canvas.drawBitmap(queenHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 11) {
                    canvas.drawBitmap(kingHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 12) {
                    canvas.drawBitmap(aceHearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
            }

            //Diamonds
            if (GetterSetter.card[cardnum].suit == 3) {

                if (GetterSetter.card[cardnum].rank == 0) {
                    canvas.drawBitmap(twoDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 1) {
                    canvas.drawBitmap(threeDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 2) {
                    canvas.drawBitmap(fourDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 3) {
                    canvas.drawBitmap(fiveDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 4) {
                    canvas.drawBitmap(sixDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 5) {
                    canvas.drawBitmap(sevenDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 6) {
                    canvas.drawBitmap(eightDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 7) {
                    canvas.drawBitmap(nineDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 8) {
                    canvas.drawBitmap(tenDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 9) {
                    canvas.drawBitmap(jackDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 10) {
                    canvas.drawBitmap(queenDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 11) {
                    canvas.drawBitmap(kingDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 12) {
                    canvas.drawBitmap(aceDiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
            }
        }
    }
}
