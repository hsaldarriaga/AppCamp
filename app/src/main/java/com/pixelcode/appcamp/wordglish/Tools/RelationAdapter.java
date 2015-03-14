package com.pixelcode.appcamp.wordglish.Tools;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pixelcode.appcamp.wordglish.R;

import java.util.ArrayList;

/**
 * Created by hsaldarriaga on 14/03/2015.
 */
public class RelationAdapter extends BaseAdapter implements View.OnTouchListener{

    public static final float DELTAXMAX=50;
    ArrayList<String> words;
    LayoutInflater inflater;
    Handler.Callback callback;
    DisplayMetrics displaymetrics;
    int Screen_Width;
    boolean changed = false;
    public RelationAdapter(Context c, Handler.Callback callback, int width){
        words = new ArrayList<>(5);
        this.callback = callback;
        inflater = LayoutInflater.from(c);
        displaymetrics = new DisplayMetrics();
        Screen_Width = width;
    }

    public void SetValues(String v1, String v2,String v3,String v4,String v5)
    {
        words.add(v1); words.add(v2); words.add(v3);
        words.add(v4); words.add(v5);
    }
    @Override
    public int getCount() {
        return words.size();
    }

    @Override
    public Object getItem(int position) {
        return words.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView==null || changed){
            if (changed && position==words.size()-1){
                changed = false;
            }
            convertView = inflater.inflate(R.layout.adapter_relation_layout, parent, false);
            holder = new ViewHolder();
            holder.word = (TextView)convertView.findViewById(R.id.adapter_textview);
            holder.word.setText(words.get(position));
            holder.word.setWidth(Screen_Width);
            convertView.setTag(R.string.adapter_id_holder, holder);
            convertView.setTag(R.string.adapter_id_index, position);
            convertView.setOnTouchListener(this);
        }
        holder = (ViewHolder)convertView.getTag(R.string.adapter_id_holder);
        return convertView;
    }

    @Override
    public void notifyDataSetChanged() {
        changed = true;
        super.notifyDataSetChanged();
    }

    static class ViewHolder {
        TextView word;
    }
    private float X_initial;
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        TextView tv = (TextView) v.findViewById(R.id.adapter_textview);
        LinearLayout.LayoutParams param = (LinearLayout.LayoutParams)tv.getLayoutParams();
        if (event.getActionMasked() == MotionEvent.ACTION_DOWN) {
            X_initial = event.getX();
        }
        if (event.getActionMasked() == MotionEvent.ACTION_MOVE || event.getActionMasked()== MotionEvent.ACTION_HOVER_MOVE) {
            float padding = event.getX() - X_initial;
            param.setMargins((int)padding,0,0,0);
            tv.setLayoutParams(param);
        }

        if (event.getActionMasked() == MotionEvent.ACTION_UP) {
            int index = (int)v.getTag(R.string.adapter_id_index);
            if (Math.abs(param.leftMargin)>v.getWidth()/2) {
                words.remove(index);
                notifyDataSetChanged();
            } else {
                param.setMargins(0, 0, 0, 0);
                tv.setLayoutParams(param);
            }
            X_initial = 0;
        }

        if (event.getActionMasked() == MotionEvent.ACTION_CANCEL) {
            param.setMargins(0, 0, 0, 0);
            tv.setLayoutParams(param);
            X_initial = 0;
        }

        return true;
    }
}
