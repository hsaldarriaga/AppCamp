package com.pixelcode.appcamp.wordglish.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.pixelcode.appcamp.wordglish.RelationActivity;

import java.util.ArrayList;

/**
 * Created by Ricardo on 14/03/2015.
 */
public class SingletonDB {

    private SQLiteDatabase db;
    private static SingletonDB instance;
    private Database database;
    private SingletonDB(Context c) {
        database = new Database(c);
    }

    public static SingletonDB getInstance(Context c) {
        if (instance == null) {
            instance = new SingletonDB(c);
        }
        return instance;
    }

    public static  SingletonDB getInstance() {
        return instance;
    }

    public void Rellenar()
    {
        db = database.getWritableDatabase();
        db.beginTransaction();
        //Playa
        ContentValues values = new ContentValues();values.put(Database.Palid,1);values.put(Database.Palpalabra,"Umbrella");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 2);values.put(Database.Palpalabra,"Fish");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 3);values.put(Database.Palpalabra,"Vessel");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 4);values.put(Database.Palpalabra,"Grit");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 5);values.put(Database.Palpalabra,"SalesClerk");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 100);values.put(Database.Palpalabra,"Heel");db.insert(Database.Tabla_Palabra,null,values);



        //Desierto
        values = new ContentValues(); values.put(Database.Palid, 6);values.put(Database.Palpalabra,"Serpent");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 7);values.put(Database.Palpalabra,"Mirage");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 8);values.put(Database.Palpalabra,"Palm");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 9);values.put(Database.Palpalabra,"Camel");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 10);values.put(Database.Palpalabra,"Overcast");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 101);values.put(Database.Palpalabra,"Aqua");db.insert(Database.Tabla_Palabra,null,values);

        //Montaña
        values = new ContentValues(); values.put(Database.Palid, 11);values.put(Database.Palpalabra,"Overcoat");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 12);values.put(Database.Palpalabra,"Peak");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 13);values.put(Database.Palpalabra,"Cable Railway");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 14);values.put(Database.Palpalabra,"Landslide");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 15);values.put(Database.Palpalabra,"Skier");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 102);values.put(Database.Palpalabra,"Couch");db.insert(Database.Tabla_Palabra,null,values);

        //Bosques
        values = new ContentValues(); values.put(Database.Palid, 16); values.put(Database.Palpalabra,"Leafs"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 17); values.put(Database.Palpalabra,"Tent"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 18); values.put(Database.Palpalabra,"Igniter"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 19); values.put(Database.Palpalabra,"Bruin"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 20); values.put(Database.Palpalabra,"Firewood"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 103);values.put(Database.Palpalabra,"Mainframe");db.insert(Database.Tabla_Palabra,null,values);

        //Ciudad
        values = new ContentValues(); values.put(Database.Palid, 21); values.put(Database.Palpalabra,"Skyscraper"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 22); values.put(Database.Palpalabra,"Eatery"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 23); values.put(Database.Palpalabra,"Highway"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 24); values.put(Database.Palpalabra,"Sewer"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 25); values.put(Database.Palpalabra,"Fuss"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 104);values.put(Database.Palpalabra,"Grange");db.insert(Database.Tabla_Palabra,null,values);

        //Parque de Diversiones
        values = new ContentValues(); values.put(Database.Palid, 26); values.put(Database.Palpalabra,"Scenic Railway"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 27); values.put(Database.Palpalabra,"Beverages"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 28); values.put(Database.Palpalabra,"Candyfloss"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 29); values.put(Database.Palpalabra,"Target Shooting"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 30); values.put(Database.Palpalabra,"Toffee"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 105);values.put(Database.Palpalabra,"Burial Ground");db.insert(Database.Tabla_Palabra,null,values);

        //Zoologico
        values = new ContentValues(); values.put(Database.Palid, 31); values.put(Database.Palpalabra,"Breeder"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 32); values.put(Database.Palpalabra,"Cages"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 33); values.put(Database.Palpalabra,"Placard"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 34); values.put(Database.Palpalabra,"Grade"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 35); values.put(Database.Palpalabra,"Dweller"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 106);values.put(Database.Palpalabra,"Shooter");db.insert(Database.Tabla_Palabra,null,values);

        //Nocturno

        values = new ContentValues(); values.put(Database.Palid, 36); values.put(Database.Palpalabra,"Bulb"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 37); values.put(Database.Palpalabra,"Tune"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 38); values.put(Database.Palpalabra,"Crossbar"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 39); values.put(Database.Palpalabra,"Refreshment"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 40); values.put(Database.Palpalabra,"Feast"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 107);values.put(Database.Palpalabra,"Church");db.insert(Database.Tabla_Palabra,null,values);


        //Adjetivos


        AdjetivePut(41,42,43,44,45,3,4,"Scary","Chilling","Eerie","Soothing","Calming");
        AdjetivePut(46,47,48,49,50,5,6,"Keep","Carry","Retain","Displace","Let go");
        AdjetivePut(51,52,53,54,55,7,8,"Cold","Icy","Snowy","Temperate","Warm");
        AdjetivePut(56,57,58,59,60,9,10,"Fun","Entertaining","Amusing","Woeful","Tiring");
        AdjetivePut(61,62,63,64,65,11,12,"Calm","Smooth","Serene","Anxious","Harsh");
        AdjetivePut(66,67,68,69,70,13,14,"Hangover","Drunkenness","Headache","Sobriety","Awesome");
        AdjetivePut(71,72,73,74,75,1,2,"Good","Worthy","Nice","Poor","Worthless");

        //Categorias

        values = new ContentValues(); values.put(Database.Catid, 1);values.put(Database.Catcategoria,0);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 2);values.put(Database.Catcategoria,0);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 3);values.put(Database.Catcategoria,0);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 4);values.put(Database.Catcategoria,0);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 5);values.put(Database.Catcategoria,0);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 100);values.put(Database.Catcategoria,0);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 6);values.put(Database.Catcategoria,1);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 7);values.put(Database.Catcategoria,1);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 8);values.put(Database.Catcategoria,1);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 9);values.put(Database.Catcategoria,1);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 10);values.put(Database.Catcategoria,1);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 101);values.put(Database.Catcategoria,1);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 11);values.put(Database.Catcategoria,2);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 12);values.put(Database.Catcategoria,2);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 13);values.put(Database.Catcategoria,2);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 14);values.put(Database.Catcategoria,2);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 15);values.put(Database.Catcategoria,2);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 102);values.put(Database.Catcategoria,2);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 16);values.put(Database.Catcategoria,3);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 17);values.put(Database.Catcategoria,3);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 18);values.put(Database.Catcategoria,3);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 19);values.put(Database.Catcategoria,3);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 20);values.put(Database.Catcategoria,3);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 103);values.put(Database.Catcategoria,3);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 21);values.put(Database.Catcategoria,4);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 22);values.put(Database.Catcategoria,4);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 23);values.put(Database.Catcategoria,4);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 24);values.put(Database.Catcategoria,4);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 25);values.put(Database.Catcategoria,4);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 104);values.put(Database.Catcategoria,4);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 26);values.put(Database.Catcategoria,5);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 27);values.put(Database.Catcategoria,5);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 28);values.put(Database.Catcategoria,5);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 29);values.put(Database.Catcategoria,5);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 30);values.put(Database.Catcategoria,5);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 105);values.put(Database.Catcategoria,5);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 31);values.put(Database.Catcategoria,6);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 32);values.put(Database.Catcategoria,6);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 33);values.put(Database.Catcategoria,6);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 34);values.put(Database.Catcategoria,6);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 35);values.put(Database.Catcategoria,6);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 106);values.put(Database.Catcategoria,6);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 36);values.put(Database.Catcategoria,7);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 37);values.put(Database.Catcategoria,7);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 38);values.put(Database.Catcategoria,7);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 39);values.put(Database.Catcategoria,7);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 40);values.put(Database.Catcategoria,7);db.insert(Database.Tabla_Categoria,null,values);
        values = new ContentValues(); values.put(Database.Catid, 107);values.put(Database.Catcategoria,7);db.insert(Database.Tabla_Categoria,null,values);
        //values.put();
        db.endTransaction();
        db.close();

    }

    public void AdjetivePut (int id,int idS1,int idS2,int idA1,int idA2,int idSim,int idAnt, String pal, String Sim1,String Sim2, String Ant1, String Ant2){

        ContentValues values = new ContentValues(); values.put(Database.Palid, id); values.put(Database.Palpalabra,pal); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, idS1); values.put(Database.Palpalabra,Sim1); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, idS2); values.put(Database.Palpalabra,Sim2); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, idA1); values.put(Database.Palpalabra,Ant1); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, idA2); values.put(Database.Palpalabra,Ant2); db.insert(Database.Tabla_Palabra,null,values);

        values = new ContentValues(); values.put(Database.Sindid,idSim ); values.put(Database.Sindidpalabra,id); values.put(Database.SinIDS,idS1+","+idS2);db.insert(Database.Tabla_Sinonimo,null,values);
        values = new ContentValues(); values.put(Database.Antid,idAnt ); values.put(Database.Antidpalabra,id);values.put(Database.AntIDs,idS1+","+idS2); db.insert(Database.Tabla_Antonimo,null,values);

    }

    public boolean IsElementInside() {
        SQLiteDatabase db = database.getReadableDatabase();
        Cursor cc = db.rawQuery("SELECT " + Database.Palid + " FROM " + Database.Tabla_Palabra, null);
        if(cc.getCount() > 1){
            db.close();
            return true;
        }

        db.close();
        return false;
    }

    public Integer getCategoria (int id){
        SQLiteDatabase db = database.getWritableDatabase();
        Cursor cc = db.rawQuery("SELECT " + Database.Catcategoria + " FROM " + Database.Tabla_Categoria + " WHERE " + Database.Catid +"="+id,null );
        Integer IdCa=0;// = cc.getInt(cc.getColumnIndex(Database.Catcategoria));

        if (cc.moveToFirst()){


        }

        return IdCa;
    }

    public String [] getSym (int id){
        SQLiteDatabase db = database.getReadableDatabase();
        Cursor cc = db.rawQuery("SELECT " + Database.SinIDS + " FROM " + Database.Tabla_Sinonimo + " WHERE " + Database.Sindidpalabra +"="+id,null);
        String Sym []= cc.getString(cc.getColumnIndex(Database.SinIDS)).split(",");
        return Sym;
    }

    public String [] getAnt (int id){
        SQLiteDatabase db = database.getReadableDatabase();
        Cursor cc = db.rawQuery("SELECT " + Database.AntIDs + " FROM " + Database.Tabla_Antonimo + " WHERE " + Database.Antidpalabra +"="+id,null);
        String Sym []= cc.getString(cc.getColumnIndex(Database.AntIDs)).split(",");
        return Sym;
    }


    public ArrayList<String> getWordsFromCategory(int categoria, int count)
    {
        return null;
    }
}
