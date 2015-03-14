package com.pixelcode.appcamp.wordglish;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    private FragmentManager fragmentManager;
    private Main_frag_how how;
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
        how = new Main_frag_how();
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

    public void lestplay_how_click(View v)
    {
        if (how.index == how.size - 1) {
            Main_frag_placePicker place = new Main_frag_placePicker();
            fragmentManager.beginTransaction()
                    .replace(R.id.main_container, place)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit();
        }
    }
}
