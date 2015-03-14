package com.pixelcode.appcamp.wordglish;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Main_frag_presentation pres = new Main_frag_presentation();
        fragmentTransaction.add(R.id.main_container, pres);
        fragmentTransaction.commit();
    }

    public void howto_click(View v)
    {
        Main_frag_how how = new Main_frag_how();
        fragmentManager.beginTransaction()
                .replace(R.id.main_container, how)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit();
    }

    public void letsplay_click(View v)
    {
        Main_frag_placePicker place = new Main_frag_placePicker();
        fragmentManager.beginTransaction()
                .replace(R.id.main_container, place)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit();
    }
}
