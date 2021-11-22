package com.example.project21;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class Panel extends SurfaceView implements SurfaceHolder.Callback{
    //GLOBAL VARIABLES
    Paint paint;
    private CanvasThread canvasthread;
    int localscore;

CardDraw cardDraw;

    public Panel(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub

        getHolder().addCallback(this);
        canvasthread = new CanvasThread(getHolder(), this);
        setFocusable(true);
        paint = new Paint();
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
        for(int q = 0; q <= GetterSetter.hit; q++) {

            cardDraw.deal(canvas, q, (80 * q), 0);

            if(GetterSetter.buttonpressed == 1) {
                scoreIt(q);
            }

        }
        GetterSetter.buttonpressed = 0;
    }

    public void scoreIt(int q) {
        if(GetterSetter.card[q].rank >= 8 ) {
            localscore = 10;
        }
        else {
            localscore = GetterSetter.card[q].rank + 2;
        }

        GetterSetter.playerScore = GetterSetter.playerScore + localscore;
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
                // we will try it again and again...
            }
        }





    }


}
