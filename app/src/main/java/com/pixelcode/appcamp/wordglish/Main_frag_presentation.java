package com.pixelcode.appcamp.wordglish;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import java.util.Random;

/**
 * Created by hsaldarriaga on 14/03/2015.
 */
public class Main_frag_presentation extends Fragment {

    ImageButton background;
    int width;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_presentation, container, false);
        background = (ImageButton) v.findViewById(R.id.pre_back_anima);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((Activity)v.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        width = displaymetrics.widthPixels;
        return  v;
    }

    @Override
    public void onResume() {
        super.onResume();
        Initialize();
    }

    private void Initialize() {
        final ImageButton globo1,globo2;
        globo1 = (ImageButton)getView().findViewById(R.id.pre_globe1);
        globo2 = (ImageButton)getView().findViewById(R.id.pre_globe2);
        final RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) background.getLayoutParams();
        ValueAnimator animator = ValueAnimator.ofInt(400, 0);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                background.requestLayout();
            }
        });
        animator.setDuration(2000);
        ValueAnimator animator1 = ValueAnimator.ofInt(-400, 0);
        animator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                params.bottomMargin = (Integer) valueAnimator.getAnimatedValue();
                background.requestLayout();
            }
        });
        animator1.setDuration(2000);
        final RelativeLayout.LayoutParams paramsglobe1 = (RelativeLayout.LayoutParams) globo1.getLayoutParams();
        ValueAnimator animaglobe1 = ValueAnimator.ofInt(paramsglobe1.leftMargin, width-paramsglobe1.width);
        animaglobe1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                paramsglobe1.leftMargin = (Integer) valueAnimator.getAnimatedValue();
                globo1.requestLayout();
            }
        });
        animaglobe1.setDuration(6000);
        animaglobe1.setRepeatMode(ValueAnimator.REVERSE);
        animaglobe1.setRepeatCount(ValueAnimator.INFINITE);

        final RelativeLayout.LayoutParams paramsglobe2 = (RelativeLayout.LayoutParams) globo2.getLayoutParams();
        ValueAnimator animaglobe2 = ValueAnimator.ofInt(paramsglobe2.rightMargin, (width-paramsglobe2.width));
        animaglobe2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                paramsglobe2.rightMargin = (Integer) valueAnimator.getAnimatedValue();
                globo2.requestLayout();
            }
        });
        animaglobe2.setDuration(8000);
        animaglobe2.setRepeatMode(ValueAnimator.REVERSE);
        animaglobe2.setRepeatCount(ValueAnimator.INFINITE);

        animator.start();
        animator1.start();
        animaglobe1.start();
        animaglobe2.start();
        nubes();
    }

    public void nubes()
    {
        final ImageButton cloud1,cloud2,cloud3;
        cloud1 = (ImageButton)getView().findViewById(R.id.cloud1);
        cloud2 = (ImageButton)getView().findViewById(R.id.cloud2);
        cloud3 = (ImageButton)getView().findViewById(R.id.cloud3);
        final RelativeLayout.LayoutParams paramscloud1 = (RelativeLayout.LayoutParams) cloud1.getLayoutParams();
        final RelativeLayout.LayoutParams paramscloud2 = (RelativeLayout.LayoutParams) cloud2.getLayoutParams();
        final RelativeLayout.LayoutParams paramscloud3 = (RelativeLayout.LayoutParams) cloud3.getLayoutParams();
        ValueAnimator anima1 = ValueAnimator.ofInt(paramscloud1.leftMargin, width);
        anima1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                paramscloud1.leftMargin = (Integer) valueAnimator.getAnimatedValue();
                cloud1.requestLayout();
            }
        });

        ValueAnimator anima2 = ValueAnimator.ofInt(paramscloud2.leftMargin, width);
        anima2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                paramscloud2.leftMargin = (Integer) valueAnimator.getAnimatedValue();
                cloud2.requestLayout();
            }
        });

        ValueAnimator anima3 = ValueAnimator.ofInt(paramscloud3.leftMargin, width);
        anima3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                paramscloud3.leftMargin = (Integer) valueAnimator.getAnimatedValue();
                cloud3.requestLayout();
            }
        });
        anima1.setDuration(8000);
        anima1.setRepeatMode(ValueAnimator.RESTART);
        anima1.setRepeatCount(ValueAnimator.INFINITE);
        anima2.setDuration(9000);
        anima2.setRepeatMode(ValueAnimator.RESTART);
        anima2.setRepeatCount(ValueAnimator.INFINITE);
        anima3.setDuration(7000);
        anima3.setRepeatMode(ValueAnimator.RESTART);
        anima3.setRepeatCount(ValueAnimator.INFINITE);

        anima1.start(); anima2.start();
        anima3.start();
    }
}
