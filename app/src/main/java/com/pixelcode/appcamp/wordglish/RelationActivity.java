package com.pixelcode.appcamp.wordglish;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.pixelcode.appcamp.wordglish.Database.SingletonDB;

import java.util.Random;

public class RelationActivity extends Activity{

    public enum CATEGORIAS {PLAYA, DESIERTO, MONTAÑA, BOSQUE, CIUDAD, PARQUE_DE_DIVERSIONES, ZOOLOGICO, NOCTURNO};
    private ListView lista;
    private CATEGORIAS cat;
    private int bt_normal, background;
    private String chosen[];
    private String badanswer;
    public ProgressBar progress;
    public Thread hiloProgreso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        progress = (ProgressBar) findViewById(R.id.timebar);
        setContentView(R.layout.activity_relation);
        Bundle b = getIntent().getExtras();
        cat =  CATEGORIAS.values()[b.getInt("categoria")]; //Obtengo las categoria a trabaja
        getResources(cat); //Establezco los estilos
        SingletonDB db = SingletonDB.getInstance();
        Random r = new Random();
        String data[]  = db.getWordsFromCategory(cat.ordinal(), 4); // Obtengo 4 palabras de la categoria escogida
        chosen = data;
        int bad_cat = r.nextInt(7);
        while (bad_cat == cat.ordinal())
             bad_cat = r.nextInt(7);   //Obtengo la categoria equivocaa
        String bad[] = db.getWordsFromCategory(bad_cat, 1); // Obtengo 1 palabra de la categoria mala
        badanswer = bad[0];
        ViewGroup group = (ViewGroup)findViewById(R.id.rel_word_cotainer);
        View v = (View)findViewById(R.id.rel_all_container);
        v.setBackgroundResource(background); //Asigno fondo
        int value = r.nextInt(4);
        int j = 0;
        TextSwipe swipe = new TextSwipe(this, 20000);
        for (int i = 0; i < group.getChildCount(); i++) { //Asigno valores a los textos
            TextView tv = (TextView)group.getChildAt(i);
            tv.setBackgroundResource(bt_normal);
            if (value == i) {
                tv.setText(badanswer);
            } else {
                tv.setText(data[j]);
                j++;
            }
            tv.setOnTouchListener(swipe);
        }
        hiloProgreso = new Thread(swipe);
        hiloProgreso.start();
    }
    private void getResources(CATEGORIAS cat)
    {
        switch (cat) {
            case PLAYA: /*bt_normal=R.drawable.bt_playa;*/ background = R.drawable.playa_background; break;
            //case DESIERTO: bt_normal=R.drawable.bt_desierto;  background = R.drawable.desierto_background; break;
            //case MONTAÑA: bt_normal=R.drawable.bt_montaña; background = R.drawable.montaña_background; break;
            //case BOSQUE: bt_normal=R.drawable.bt_bosque; background = R.drawable.bosque_background; break;
            //case CIUDAD: bt_normal=R.drawable.bt_ciudad; background = R.drawable.ciudad_background; break;
            //case PARQUE_DE_DIVERSIONES: bt_normal=R.drawable.bt_parque_de_diversiones; background = R.drawable.parque_de_diversiones_background; break;
            //case ZOOLOGICO: bt_normal=R.drawable.bt_zoologico; background = R.drawable.zoologico_background; break;
            //case NOCTURNO: bt_normal=R.drawable.bt_nocturno; background = R.drawable.nocturno_background; break;
        }
    }

    public void ItemSelected(View v)
    {

    }
}
