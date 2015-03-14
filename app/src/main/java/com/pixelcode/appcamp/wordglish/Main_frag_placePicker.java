package com.pixelcode.appcamp.wordglish;

import android.app.Fragment;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hsaldarriaga on 14/03/2015.
 */
public class Main_frag_placePicker extends Fragment {

    private int ScreenWidth, ScreenHeight;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        ScreenWidth = displaymetrics.widthPixels;
        ScreenHeight = displaymetrics.heightPixels;
        View v = inflater.inflate(R.layout.fragment_placepicker, container, false);
        Initialize(v);
        return v;
    }

    private void Initialize(View v) {

    }
}
