package com.example.penisriwahyu.pointerb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLException;

/**
 * Created by Krilido on 3/15/2015.
 */
public class PointerSchoolDAO {
    protected SQLiteDatabase database;
    private DatabaseHandler dbHelper;
    private Context mContext;

    public PointerSchoolDAO (Context context) throws SQLException {
        this.mContext = context;
        dbHelper = DatabaseHandler.getHelper(mContext);
        try {
            open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void open() throws SQLException {
        if (dbHelper == null)
            dbHelper = DatabaseHandler.getHelper(mContext);
        database = dbHelper.getWritableDatabase();
    }
}
