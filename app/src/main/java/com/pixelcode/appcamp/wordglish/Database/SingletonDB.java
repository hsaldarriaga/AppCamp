package com.pixelcode.appcamp.wordglish.Database;

import android.content.ContentValues;
import android.content.Context;
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

    public static SingletonDB getinstance(Context c) {
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
        values.put();
    }
}
