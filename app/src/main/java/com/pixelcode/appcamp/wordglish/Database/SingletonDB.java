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
        ContentValues values = new ContentValues();
        values.put(Database.Palpalabra,"Tan");
        db.insert(Database.Tabla_Palabra,null,values);

        values = new ContentValues();
        values.put(Database.Tabla_Sinonimo,"Tan");
        db.insert(Database.Tabla_Palabra,null,values);

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
