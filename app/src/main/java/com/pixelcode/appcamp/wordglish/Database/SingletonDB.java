package com.pixelcode.appcamp.wordglish.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

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

        //Playa
        ContentValues values = new ContentValues(); values.put(Database.Palid,1);values.put(Database.Palpalabra,"Umbrella");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 2);values.put(Database.Palpalabra,"Fish");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 3);values.put(Database.Palpalabra,"Vessel");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 4);values.put(Database.Palpalabra,"Grit");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 5);values.put(Database.Palpalabra,"SalesClerk");db.insert(Database.Tabla_Palabra,null,values);

        //Desierto
        values = new ContentValues(); values.put(Database.Palid, 6);values.put(Database.Palpalabra,"Serpent");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 7);values.put(Database.Palpalabra,"Mirage");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 8);values.put(Database.Palpalabra,"Palm");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 9);values.put(Database.Palpalabra,"Camel");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 10);values.put(Database.Palpalabra,"Overcast");db.insert(Database.Tabla_Palabra,null,values);

        //Montaña
        values = new ContentValues(); values.put(Database.Palid, 11);values.put(Database.Palpalabra,"Overcoat");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 12);values.put(Database.Palpalabra,"Peak");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 13);values.put(Database.Palpalabra,"Cable Railway");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 14);values.put(Database.Palpalabra,"Landslide");db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 15);values.put(Database.Palpalabra,"Skier");db.insert(Database.Tabla_Palabra,null,values);

        //Bosques
        values = new ContentValues(); values.put(Database.Palid, 16); values.put(Database.Palpalabra,"Leafs"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 17); values.put(Database.Palpalabra,"Tent"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 18); values.put(Database.Palpalabra,"Igniter"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 19); values.put(Database.Palpalabra,"Bruin"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 20); values.put(Database.Palpalabra,"Firewood"); db.insert(Database.Tabla_Palabra,null,values);
        //Ciudad
        values = new ContentValues(); values.put(Database.Palid, 21); values.put(Database.Palpalabra,"Skyscraper"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 22); values.put(Database.Palpalabra,"Eatery"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 23); values.put(Database.Palpalabra,"Highway"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 24); values.put(Database.Palpalabra,"Sewer"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 25); values.put(Database.Palpalabra,"Fuss"); db.insert(Database.Tabla_Palabra,null,values);
        //Parque de Diversiones
        values = new ContentValues(); values.put(Database.Palid, 26); values.put(Database.Palpalabra,"Scenic Railway"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 27); values.put(Database.Palpalabra,"Beverages"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 28); values.put(Database.Palpalabra,"Candyfloss"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 29); values.put(Database.Palpalabra,"Target Shooting"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 30); values.put(Database.Palpalabra,"Toffee"); db.insert(Database.Tabla_Palabra,null,values);

        //Zoologico
        values = new ContentValues(); values.put(Database.Palid, 31); values.put(Database.Palpalabra,"Breeder"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 32); values.put(Database.Palpalabra,"Cages"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 33); values.put(Database.Palpalabra,"Placard"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 34); values.put(Database.Palpalabra,"Grade"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 35); values.put(Database.Palpalabra,"Dweller"); db.insert(Database.Tabla_Palabra,null,values);

        //Nocturno

        values = new ContentValues(); values.put(Database.Palid, 36); values.put(Database.Palpalabra,"Bulb"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 37); values.put(Database.Palpalabra,"Tune"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 38); values.put(Database.Palpalabra,"Crossbar"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 39); values.put(Database.Palpalabra,"Refreshment"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 40); values.put(Database.Palpalabra,"Feast"); db.insert(Database.Tabla_Palabra,null,values);


        //Adjetivos


        AdjetivePut(41,42,43,44,45,3,4,"Scary","Chilling","Eerie","Soothing","Calming");
        AdjetivePut(46,47,48,49,50,5,6,"Keep","Carry","Retain","Displace","Let go");
        AdjetivePut(51,52,53,54,55,7,8,"Cold","Icy","Snowy","Temperate","Warm");
        AdjetivePut(56,57,58,59,60,9,10,"Fun","Entertaining","Amusing","Woeful","Tiring");
        AdjetivePut(61,62,63,64,65,11,12,"Calm","Smooth","Serene","Anxious","Harsh");
        AdjetivePut(66,67,68,69,70,13,14,"Hangover","Drunkenness","Headache","Sobriety","Awesome");
        AdjetivePut(71,72,73,74,75,1,2,"Good","Worthy","Nice","Poor","Worthless");


        //values.put();

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
            return true;
        }
        return false;
    }
}
