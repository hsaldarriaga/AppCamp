package com.pixelcode.appcamp.wordglish.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Ricardo on 14/03/2015.
 */
public class Database extends SQLiteOpenHelper {
     private static final String BDname = "WordDataBase";
     private static final int Verison = 1;
     private SQLiteDatabase db;
    public static final String TAG = Database.class.getSimpleName();

    //Table Palabra
    public static final String Tabla_Palabra = "Palabra";
    public static final String Palid= "idPalabra";
    public static final String Palpalabra = "palabra";

    //Tabla Sinonimo
    public static final String Tabla_Sinonimo = "Sinonimo";
    public static final String Sindid = "Sinid";
    public static final String Sindidpalabra = "idpalabra";
    public static final String SinIDS = "idAnts";

    //Tabla Antonimo
    public static final String Tabla_Antonimo = "Antonimo";
    public static final String Antid = "Antid";
    public static final String Antidpalabra = "idpralabra";
    public static final String AntIDs = "idAnts";

    //Tabla Categoria
    public static final String Tabla_Categoria = "Categoria";
    public static final String Catid = "IdCategoria";
    public static final String Catcategoria = "Categorias";

    public Database(Context context) {
        super(context, BDname, null, Verison);
        Log.d(TAG, "DatabaseHandler Constructor");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_PAL = " CREATE TABLE " + Tabla_Palabra + "("
                              + Palid + " integer primary key," + Palpalabra + " text"+
                                ")";

        String CREATE_SYM =    " CREATE TABLE " + Tabla_Sinonimo + "("
                                + Sindid + " integer primary key," + Sindidpalabra + " integer,"
                                + SinIDS + " text"+
                                 ")";
        String CREATE_ANT =     " CREATE TABLE " + Tabla_Antonimo + "("
                                + Antid + " integer primary key," + Antidpalabra + " integer,"
                                + AntIDs + " text"+
                                   ")";
        String CREATE_CAT =     " CREATE TABLE " + Tabla_Categoria + "("
                                 + Catid + " integer primary key," + Catcategoria + " integer"+
                                    ")";
        //Log.d(TAG,"onCreate" + CREATE_TABLE);
        db.execSQL(CREATE_PAL);
        db.execSQL(CREATE_SYM);
        db.execSQL(CREATE_ANT);
        db.execSQL(CREATE_CAT);

/*
        try {
            if (db.isOpen()) {
                db.execSQL(CREATE_TABLE);
            }
        } catch (Exception e) {
            Log.d("onCreateDB", e.getMessage());
            return;
        } finally {
        }
*/


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
