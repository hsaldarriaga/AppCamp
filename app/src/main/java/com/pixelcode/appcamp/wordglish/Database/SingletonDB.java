package com.pixelcode.appcamp.wordglish.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Ricardo on 14/03/2015.
 */
public class SingletonDB {

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
        SQLiteDatabase db = database.getWritableDatabase();

        //Playa
        ContentValues values = new ContentValues(); values.put(Database.Palid,"1");values.put(Database.Palpalabra,"Umbrella");db.insert(Database.Tabla_Palabra,null,values);
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
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Leafs"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Tent"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Igniter"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Bruin"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Firewood"); db.insert(Database.Tabla_Palabra,null,values);
        //Ciudad
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Skyscraper"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Eatery"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Highway"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Sewer"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Fuss"); db.insert(Database.Tabla_Palabra,null,values);
        //Parque de Diversiones
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Scenic Railway"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Beverages"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Candyfloss"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Target Shooting"); db.insert(Database.Tabla_Palabra,null,values);
        values = new ContentValues(); values.put(Database.Palid, 0); values.put(Database.Palpalabra,"Toffee"); db.insert(Database.Tabla_Palabra,null,values);
        
        //values.put();

        db.close();
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
