package com.pixelcode.appcamp.wordglish;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;

import com.pixelcode.appcamp.wordglish.Database.SingletonDB;

public class RelationActivity extends Activity{

    public enum CATEGORIAS {PLAYA, DESIERTO, MONTAÑA, BOSQUE, CUIDAD, PARQUE_DE_DIVERSIONES, ZOOLOGICO, NOCTURNO};
    private ListView lista;
    private CATEGORIAS cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relation);
        Bundle b = getIntent().getExtras();
        cat =  CATEGORIAS.values()[b.getInt("categoria")];
        SingletonDB db = SingletonDB.getInstance();
        //Cursor cc = db.getWordsFromCategory(cat.ordinal(), 4);

    }
}
