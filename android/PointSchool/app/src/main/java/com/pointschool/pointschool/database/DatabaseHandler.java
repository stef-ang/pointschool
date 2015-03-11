package com.pointschool.pointschool.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Karsten on 09/03/2015.
 */
public class DatabaseHandler extends SQLiteOpenHelper {
    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "pointerschool";

    // Tables Names
    private static final String TABLE_BAB = "bab";
    private static final String TABLE_KELAS = "kelas";
    private static final String TABLE_MAPEL = "mapel";
    private static final String TABLE_MATERI = "materi";
    private static final String TABLE_PAKET_SOAL = "paket_soal";
    private static final String TABLE_SOAL = "soal";
    private static final String TABLE_SUBBAB = "subbab";

    // Bab Table Columns names
    private static final String KEY_ID_BAB = "id_bab";
    //private static final String KEY_ID_KELAS = "id_kelas";
    //private static final String KEY_ID_MAPEL = "id_mapel";
    private static final String KEY_NOMOR_BAB = "nomor_bab";
    private static final String KEY_NAMA_BAB = "nama_bab";

    // Kelas Table Columns names
    private static final String KEY_ID_KELAS = "id_kelas";
    private static final String KEY_NOMOR_KELAS = "nomor_kelas";
    private static final String KEY_NAMA_KELAS = "nama_kelas";

    // Mapel Table Columns names
    private static final String KEY_ID_MAPEL = "id_mapel";
    private static final String KEY_NAMA_MAPEL = "nama_mapel";

    // Materi Table Columns names
    private static final String KEY_ID_MATERI = "id_materi";
    //private static final String KEY_ID_SUBBAB = "id_subbab";
    private static final String KEY_NOMOR_MATERI = "nomor_materi";
    private static final String KEY_ID_FILE_MATERI = "id_file_materi";
    private static final String KEY_CATATAN_MATERI = "catatan_materi";

    // Paket_Soal Table Columns names
    private static final String KEY_ID_PAKET_SOAL = "id_materi";
    //private static final String KEY_ID_SUBBAB = "id_subbab";
    private static final String KEY_NOMOR_PAKET_SOAL = "nomor_paket_soal";
    private static final String KEY_NAMA_PAKET_SOAL = "nama_paket_soal";
    private static final String KEY_LEVEL_SOAL = "level_soal";

    // Soal Table Columns names
    private static final String KEY_ID_SOAL = "id_materi";
    //private static final String KEY_ID_PAKET_SOAL = "id_paket_soal";
    private static final String KEY_NOMOR_SOAL = "nomor_soal";
    private static final String KEY_ID_FILE_SOAL = "id_file_soal";
    private static final String KEY_PILIHAN1 = "pilihan1";
    private static final String KEY_PILIHAN2 = "pilihan2";
    private static final String KEY_PILIHAN3 = "pilihan3";
    private static final String KEY_PILIHAN4 = "pilihan4";
    private static final String KEY_PILIHAN5 = "pilihan5";
    private static final String KEY_KUNCI_SOAL = "kunci_soal";
    private static final String KEY_PEMBAHASAN_SOAL = "pembahasan_soal";
    private static final String KEY_CATATAN_SOAL = "catatan_soal";

    //Subbab Table Columns names
    private static final String KEY_ID_SUBBAB = "id_subbab";
    //private static final String KEY_ID_BAB = "id_bab";
    private static final String KEY_NOMOR_SUBBAB = "nomor_subbab";
    private static final String KEY_NAMA_SUBBAB = "nama_subbab";

    // ----||  Table Create Statements  ||----
    // KELAS table create statement
    private static final String CREATE_TABLE_KELAS = "CREATE TABLE "
            + TABLE_KELAS + "(" + KEY_ID_KELAS + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + KEY_NOMOR_KELAS + " INTEGER," +  KEY_NAMA_KELAS  + " TEXT" + ")";

    // MAPEL table create statement
    private static final String CREATE_TABLE_MAPEL = "CREATE TABLE "
            + TABLE_MAPEL + "(" + KEY_ID_MAPEL + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            +  KEY_NAMA_MAPEL  + " TEXT" + ")";

    // BAB table create statement
    private static final String CREATE_TABLE_BAB = "CREATE TABLE " + TABLE_BAB
            + "(" + KEY_ID_BAB + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + KEY_ID_KELAS + " INTEGER,"
            + KEY_ID_MAPEL + " INTEGER,"
            + KEY_NOMOR_BAB + " INTEGER,"
            + KEY_NAMA_BAB + " TEXT"
            + "FOREIGN KEY(" + KEY_ID_KELAS + ") REFERENCES " + TABLE_KELAS + "(" + KEY_ID_KELAS + ")"
            + "FOREIGN KEY(" + KEY_ID_MAPEL + ") REFERENCES " + TABLE_MAPEL + "(" + KEY_ID_MAPEL + "))";

    // SUBBAB table create statement
    private static final String CREATE_TABLE_SUBBAB = "CREATE TABLE " + TABLE_SUBBAB
            + "(" + KEY_ID_SUBBAB + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + KEY_ID_BAB + " INTEGER,"
            + KEY_NOMOR_SUBBAB + " INTEGER,"
            + KEY_NAMA_SUBBAB + " TEXT"
            + "FOREIGN KEY(" + KEY_ID_BAB + ") REFERENCES " + TABLE_BAB + "(" + KEY_ID_BAB + "))";

    // MATERI table create statement
    private static final String CREATE_TABLE_MATERI = "CREATE TABLE " + TABLE_MATERI
            + "(" + KEY_ID_MATERI + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + KEY_ID_SUBBAB + " INTEGER,"
            + KEY_NOMOR_MATERI + " INTEGER,"
            + KEY_ID_FILE_MATERI + " TEXT,"
            + KEY_CATATAN_MATERI + " TEXT"
            + "FOREIGN KEY(" + KEY_ID_SUBBAB + ") REFERENCES " + TABLE_SUBBAB + "(" + KEY_ID_SUBBAB + "))";

    // PAKET_SOAL table create statement
    private static final String CREATE_TABLE_PAKET_SOAL = "CREATE TABLE " + TABLE_PAKET_SOAL
            + "(" + KEY_ID_PAKET_SOAL + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + KEY_ID_BAB + " INTEGER,"
            + KEY_NOMOR_PAKET_SOAL + " INTEGER,"
            + KEY_NAMA_PAKET_SOAL + " TEXT,"
            + KEY_LEVEL_SOAL + " TEXT"
            + "FOREIGN KEY(" + KEY_ID_BAB + ") REFERENCES " + TABLE_BAB + "(" + KEY_ID_BAB + "))";

    // SOAL table create statement
    private static final String CREATE_TABLE_SOAL = "CREATE TABLE " + TABLE_SOAL
            + "(" + KEY_ID_SOAL + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + KEY_ID_PAKET_SOAL + " INTEGER,"
            + KEY_NOMOR_SOAL + " INTEGER,"
            + KEY_ID_FILE_SOAL + " TEXT,"
            + KEY_PILIHAN1 + " TEXT,"
            + KEY_PILIHAN2 + " TEXT,"
            + KEY_PILIHAN3 + " TEXT,"
            + KEY_PILIHAN4 + " TEXT,"
            + KEY_PILIHAN5 + " TEXT,"
            + KEY_KUNCI_SOAL + " TEXT,"
            + KEY_PEMBAHASAN_SOAL + " TEXT,"
            + KEY_CATATAN_SOAL + " TEXT"
            + "FOREIGN KEY(" + KEY_ID_PAKET_SOAL + ") REFERENCES " + TABLE_PAKET_SOAL + "(" + KEY_ID_PAKET_SOAL + "))";

    private static DatabaseHandler instance;

    public static synchronized DatabaseHandler getHelper(Context context)
    {
        if(instance == null)
        {
            instance = new DatabaseHandler(context);
        }
        return instance;
    }

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onOpen(SQLiteDatabase db)
    {
        super.onOpen(db);
        if(!db.isReadOnly())
        {
            db.execSQL("PRAGMA foreign_keys=ON");
        }
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        // creating required tables
        db.execSQL(CREATE_TABLE_MAPEL);
        db.execSQL(CREATE_TABLE_KELAS);
        db.execSQL(CREATE_TABLE_BAB);
        db.execSQL(CREATE_TABLE_SUBBAB);
        db.execSQL(CREATE_TABLE_MATERI);
        db.execSQL(CREATE_TABLE_PAKET_SOAL);
        db.execSQL(CREATE_TABLE_SOAL);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SOAL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MATERI);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PAKET_SOAL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SUBBAB);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BAB);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_KELAS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MAPEL);
        // Create tables again
        onCreate(db);
    }
}
