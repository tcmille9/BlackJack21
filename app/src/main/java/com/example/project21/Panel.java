package com.example.project21;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class Panel extends SurfaceView implements SurfaceHolder.Callback{
    //GLOBAL VARIABLES
    //Paint paint;
    private CanvasThread canvasthread;
    int localscore;
    CardDraw cardDraw;
    Bitmap background;

    public Panel(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        getHolder().addCallback(this);
        canvasthread = new CanvasThread(getHolder(), this);
        setFocusable(true);
        Bitmap background = BitmapFactory.decodeResource(context.getResources(), R.drawable.background);
        cardDraw = new CardDraw(context);
    }

    public Panel(Context context) {
        super(context);
        getHolder().addCallback(this);
        canvasthread = new CanvasThread(getHolder(), this);
        setFocusable(true);
    }


    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.BLACK);
        canvas.drawColor(Color.TRANSPARENT);

        //Dealer deal
        for(int q = 0; q <= 1; q++) {

            cardDraw.deal(canvas, q, (80 * q), -600);

            if(GetterSetter.buttonpressed == 1) {
                scoreit(q, true, false);
            }

        }

        //Player deal and draw until stand
        for(int q = 2; q <= GetterSetter.hit; q++) {

            cardDraw.deal(canvas, q, (80 * q) - 160, 0);

            if(GetterSetter.buttonpressed == 1) {
                scoreit(q, false, true);
            }

        }

        //Dealer draws after player stands
        for(int x = (GetterSetter.hit + 1); x <= GetterSetter.dealerhit; x++) {

            if (x > 2) {
                cardDraw.deal(canvas, x, 80 * (x - (GetterSetter.hit -1)), -600);
            }
            else {
                cardDraw.deal(canvas, x, (80 * x), -600);
            }
            if(GetterSetter.buttonpressed == 1) {
                scoreit(x, true, false);
            }
        }

        GetterSetter.buttonpressed = 0;
    }

    public void scoreit(int q, boolean dealer, boolean player) {
        if (q == 0 && GetterSetter.dealerhit < 3) {
            localscore = 0;
        }
        else {
            if (GetterSetter.card[q].rank == 12) {
                if (player) {
                    if (GetterSetter.playerScore > 10) {
                        localscore = 1;
                    } else {
                        localscore = 11;
                    }
                }
                if (dealer) {
                    if (GetterSetter.dealerScore > 10) {
                        localscore = 1;
                    } else {
                        localscore = 11;
                    }
                }
            } else if (GetterSetter.card[q].rank < 8) {
                localscore = GetterSetter.card[q].rank + 2;
            } else {
                localscore = 10;
            }
            if (player) {
                GetterSetter.playerScore = GetterSetter.playerScore + localscore;
            }

            if (dealer) {
                GetterSetter.dealerScore = GetterSetter.dealerScore + localscore;
            }
        }
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
        // TODO Auto-generated method stub

    }

    public void surfaceCreated(SurfaceHolder holder) {
        // TODO Auto-generated method stub
        canvasthread.setRunning(true);
        canvasthread.start();


    }

    public void surfaceDestroyed(SurfaceHolder holder) {
        // TODO Auto-generated method stub
        boolean retry = true;
        canvasthread.setRunning(false);
        while (retry) {
            try {
                canvasthread.join();
                retry = false;
            } catch (InterruptedException e) {
            }
        }





    }


}
