package com.pixelcode.appcamp.wordglish;

import android.app.Fragment;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by hsaldarriaga on 14/03/2015.
 */
public class Main_frag_how extends Fragment {

    public int index = -1;
    public int size = 4;
    private float X_before = 0;
    private int Screen_Width;
    ImageView vw;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_how, container, false);
        vw = (ImageView)v.findViewById(R.id.img_how);
        Initialize();
        return v;
    }

    private void Initialize() {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        Screen_Width = displaymetrics.widthPixels;
        vw.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getActionMasked() == MotionEvent.ACTION_DOWN) {
                    X_before = event.getX();
                }

                if (event.getActionMasked() == MotionEvent.ACTION_MOVE) {
                    float deltax = event.getX() - X_before;
                    if (deltax > Screen_Width*0.4)  {
                        if (deltax > 0) {
                            NextImage();
                        } else {
                            PreviewImage();
                        }
                        return true;
                    }
                }
                return false;
            }
        });
    }

    private void NextImage() {

    }

    private void PreviewImage() {

    }
}
