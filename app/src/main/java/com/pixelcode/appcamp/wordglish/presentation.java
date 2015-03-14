package com.pixelcode.appcamp.wordglish;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.pixelcode.appcamp.wordglish.Database.Database;


public class presentation extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);
        Thread thread = new Thread(new ThreadCreator(this));
        thread.start();

    }
}
