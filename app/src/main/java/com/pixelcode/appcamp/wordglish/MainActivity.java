package com.pixelcode.appcamp.wordglish;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    private FragmentManager fragmentManager;
    private HowActivity how;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getFragmentManager();
    }

    @Override
    protected void onResume() {
        super.onResume();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Main_frag_presentation pres = new Main_frag_presentation();
        fragmentTransaction.add(R.id.main_container, pres);
        fragmentTransaction.commit();
    }

    public void howto_click(View v)
    {
        Intent intent = new Intent(this, HowActivity.class);
        startActivity(intent);
    }

    public void letsplay_click(View v)
    {
        Main_frag_placePicker place = new Main_frag_placePicker();
        fragmentManager.beginTransaction()
                .replace(R.id.main_container, place)
                .addToBackStack(null)
                .commit();
    }

    public void StartGame(View v) {
        Intent inten = new Intent(this, RelationActivity.class);
        inten.putExtra("categoria",Integer.parseInt(v.getTag().toString()));
        startActivity(inten);
    }
}
