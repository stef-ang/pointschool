package com.pointschool.pointschool;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.pointschool.pointschool.database.DatabaseHandler;

/**
 * Created by Krilido on 3/15/2015.
 */
public class PointerSchoolDAO {
    protected SQLiteDatabase database;
    private DatabaseHandler dbHelper;
    private Context mContext;

    public PointerSchoolDAO (Context context){
        this.mContext = context;
        dbHelper = DatabaseHandler.getHelper(mContext);
        open();
    }

    public void open() throws SecurityException{
        if (dbHelper == null)
            dbHelper = DatabaseHandler.getHelper(mContext);
        database = dbHelper.getWritableDatabase();
    }
}
