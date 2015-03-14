package com.pixelcode.appcamp.wordglish;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.pixelcode.appcamp.wordglish.Tools.RelationAdapter;

    public class RelationActivity extends Activity implements Handler.Callback{

    private RelationAdapter adapter;
    public enum CATEGORIAS {PLAYA, DESIERTO, MONTAÑA, BOSQUE, CUIDAD, PARQUE_DE_DIVERSIONES};
    private ListView lista;
    private CATEGORIAS cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relation);
        Bundle b = getIntent().getExtras();
        cat =  CATEGORIAS.values()[b.getInt("categoria")];
        lista = (ListView)findViewById(R.id.List_Relation);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        adapter = new RelationAdapter(this,this,displaymetrics.widthPixels);
        lista.setAdapter(adapter);
        SetRelation();
    }

    private void SetRelation()
    {
        //Solicitar valores bas de datos
        adapter.SetValues("Hola","Como", "estas", "carita", ":)))))");

    }

    @Override
    public boolean handleMessage(Message msg) {
            return false;
    }

}
