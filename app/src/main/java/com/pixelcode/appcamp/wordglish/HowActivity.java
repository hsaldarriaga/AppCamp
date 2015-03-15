package com.pixelcode.appcamp.wordglish;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

/**
 * Created by hsaldarriaga on 14/03/2015.
 */
public class HowActivity extends Activity {


    private ImageSwitcher imageSwitcher;
    private int index = 0;
    private View vistas[];
    private GridLayout grid;
    private float x_inicial = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how);
        imageSwitcher = (ImageSwitcher)findViewById(R.id.how_ImageSwitcher);
        grid = (GridLayout)findViewById(R.id.how_grid);
        Initialize();
    }

    private void Initialize() {
        final Context c = this;
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView myView = new ImageView(c);
                myView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                myView.setLayoutParams(new ImageSwitcher.LayoutParams(ImageSwitcher.LayoutParams.
                        MATCH_PARENT, ImageSwitcher.LayoutParams.MATCH_PARENT));
                return myView;
            }

        });
        imageSwitcher.setImageResource(R.drawable.how_01);
        vistas = new View[4];
        for (int i = 0; i < 4; i++) {
            vistas[i] = grid.getChildAt(i);
        }
        final Activity esto = this;
        imageSwitcher.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getActionMasked() == MotionEvent.ACTION_DOWN) {
                    x_inicial = event.getX();
                }
                if (event.getActionMasked() == MotionEvent.ACTION_UP) {
                    if (Math.abs(x_inicial - event.getX()) > 60) {
                        if (x_inicial - event.getX() < 0) { //Izquierda
                            if (index == 0) {
                                esto.finish();
                            } else {
                                previous(null);
                            }
                        } else {
                            if (index == 3) {
                                esto.finish();
                                //Seleccionar juego
                            } else {
                                next(null);
                            }
                        }
                    }
                    x_inicial = 0;
                    return true;
                }
            return true;
        }
        });
    }

    public void next(View view){
        index+=1;
        SetImage(index);
        SetPositionCircle();
    }
    public void previous(View view){
        index-=1;
        SetImage(index);
        SetPositionCircle();
    }

    private void SetImage(int index)
    {

        switch (index) {
            case '0': imageSwitcher.setImageResource(R.drawable.how_01); break;
            case '1': imageSwitcher.setImageResource(R.drawable.how_02); break;
            case '2': imageSwitcher.setImageResource(R.drawable.how_03); break;
            case '3': imageSwitcher.setImageResource(R.drawable.how_04); break;
        }
    }

    private void SetPositionCircle()
    {
        for (int i = 0; i < 4; i++) {
            if (index == i) {
                vistas[i].setBackgroundResource(R.drawable.circle_full);
            } else {
                vistas[i].setBackgroundResource(R.drawable.circle_empty);
            }
        }
    }
}