package com.pixelcode.appcamp.wordglish;

/**
 * Created by Ricardo on 14/03/2015.
 */
public class Table {

    //Tabla Palabra
    public static final String Tabla_Palabra = "Palabra";
    public static final String Palid_= "idPalabra";
    public static final String Palpalabra = "palabra";
    //Tabla Sinonimo
    public static final String Tabla_Sinonimo = "Sinonimo";
    public static final String Sindid = "Sinid";
    public static final String Sindidpalabra = "idpalabra";
    //Tabla Antonimo
    public static final String Tabla_Antonimo = "Antonimo";
    public static final String Antid = "Antid";
    public static final String Antidpalabra = "idpralabra";
    //Tabla Realacion
    public static final String Tabla_Relacion = "Relacion";
    public static final String Reltid = "idRelacion";
    public static final String Relcategoria = "Cateogira";
    public static final String Relnivel = "Nivel";
    public static final String Relpalabras= "Palabras";
    public static final String RelRespuesta = "PalabraRespuesta";



    public static final String CreateDb = "create table" + Tabla_Palabra + "(" +
                                          Palid_ + "integer primary key autoincrement," +
                                          Palpalabra + "text"
                                           + ");" +
                                          "create table" + Tabla_Sinonimo + "(" +
                                            Sindid + "integer primary key autoincrement," +
                                            Sindidpalabra + "text"
                                            + ");" +
                                          "create table" + Tabla_Antonimo + "(" +
                                            Antid + "integer primary key autoincrement," +
                                            Antidpalabra + "text"
                                             + ");" +
                                           "create table" + Tabla_Relacion + "(" +
                                           Reltid + "integer primary key autoincrement," +
                                           Relcategoria + "text," +
                                           Relnivel + "text," +
                                           Relpalabras + "text," +
                                           RelRespuesta + "text"
                                                    + ");";



}
