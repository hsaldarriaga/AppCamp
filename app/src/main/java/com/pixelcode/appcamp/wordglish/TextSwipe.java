package com.pixelcode.appcamp.wordglish;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by hsaldarriaga on 15/03/2015.
 */
public class TextSwipe implements View.OnTouchListener, Runnable {

    private float X_inicial;
    RelationActivity act;
    private long time;
    private Handler handler;
    public TextSwipe(RelationActivity act, long time) {
        this.act = act;
        this.time = time;
        handler = new Handler(Looper.getMainLooper());
    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getActionMasked())
        {
            case MotionEvent.ACTION_DOWN:
                X_inicial = event.getX();
                return true;
            case MotionEvent.ACTION_MOVE:
                float pad = event.getX() - X_inicial;
                RelativeLayout.LayoutParams param = (RelativeLayout.LayoutParams)v.getLayoutParams();
                param.leftMargin = (int)pad;
                v.setLayoutParams(param);
                v.requestLayout();
                return  true;
            case MotionEvent.ACTION_UP:
                X_inicial = 0;
                if (Math.abs(event.getX() - X_inicial) > 50) {
                    act.ItemSelected(v);
                } else {
                    RelativeLayout.LayoutParams param1 = (RelativeLayout.LayoutParams)v.getLayoutParams();
                    param1.leftMargin = 0;
                    v.setLayoutParams(param1);
                    v.requestLayout();
                }
                return  true;
            default: return false;
        }
    }

    @Override
    public void run() {
        final long temp = time;
        while (time > 0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time = time -200;
            handler.post(new Runnable() {
                @Override
                public void run() {
                    act.progress.setProgress((int)(temp/(temp-time)));
                }
            });
        }
    }
}
