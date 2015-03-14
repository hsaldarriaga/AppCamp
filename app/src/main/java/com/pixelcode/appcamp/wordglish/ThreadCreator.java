package com.pixelcode.appcamp.wordglish;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Created by hsaldarriaga on 14/03/2015.
 */
public class ThreadCreator implements Runnable{

    private Activity activity;

    public ThreadCreator(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void run() {
        //Invocar Base de Datos
        long t1 =System.currentTimeMillis();

        //final
        t1 = Math.abs(t1 - System.currentTimeMillis());
        if (t1 < 3000) {
            try {
                Thread.sleep(3000 - t1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ExecuteNextActivity();
            }
        });
    }


    public void ExecuteNextActivity()
    {
        Intent intent = new Intent(activity, MainActivity.class);
    }
}
