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
    public static final String SinCategoria = "idpalabra";

    //Tabla Antonimo
    public static final String Tabla_Antonimo = "Antonimo";
    public static final String Antid = "Antid";
    public static final String Antidpalabra = "idpralabra";
    public static final String AntCategoria = "idpalabra";

    //Tabla Relacion
    public static final String Tabla_Relacion = "Relacion";
    public static final String Reltid = "idRelacion";
    public static final String Relcategoria = "Cateogira";
    public static final String Relnivel = "Nivel";
    public static final String Relpalabras= "Palabras";
    public static final String RelRespuesta = "PalabraRespuesta";

    public Database(Context context) {
        super(context, BDname, null, Verison);
        Log.d(TAG, "DatabaseHandler Constructor");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TABLE = "CREATE TABLE " + Tabla_Palabra + "("
                              + Palid + " integer primary key," + Palpalabra + " integer"+
                                ");" +
                                "CREATE TABLE " + Tabla_Sinonimo + "("
                                + Sindid + " integer primary key," + Sindidpalabra + " integer,"
                                + SinCategoria + " integer"+
                                 ");"+
                                "CREATE TABLE " + Tabla_Antonimo + "("
                                + Antid + " integer primary key," + Antidpalabra + " integer,"
                                + AntCategoria + " integer"+
                                   ");" +
                                "CREATE TABLE " + Tabla_Relacion + "("
                                 + Reltid + " integer primary key increment," + Relcategoria + " integer,"+
                                  Relnivel + "integer," + Relpalabras + " text,"+
                                  RelRespuesta + "text" +
                                    ");";
        Log.d(TAG,"onCreate" + CREATE_TABLE);

        try {
            if (db.isOpen()) {
                db.execSQL(CREATE_TABLE);
            }
        } catch (Exception e) {
            Log.d("onCreateDB", e.getMessage());
            return;
        } finally {
        }



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
