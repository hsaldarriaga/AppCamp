package com.pixelcode.appcamp.wordglish;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hsaldarriaga on 14/03/2015.
 */
public class Main_frag_how extends Fragment {

    public int index = -1;
    public int size = 4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_how, container, false);
    }
}
