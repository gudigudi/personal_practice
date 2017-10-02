package com.gudigudigudi.mdtemplate;

/**
 * Created by gu on 10/2/17.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Book sqlite db.
 */
public class BookDBHelper extends SQLiteOpenHelper {

    public static final String CREATE_SQL = "CREATE TABLE Book (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "author TEXT, " +
            "price REAL, " +
            "pages INTEGER, " +
            "name TEXT )";
    public static final String CREATE_CATEGORY = "CREATE TABLE Category (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "category_name TEXT, " +
            "category_code INTEGER )";


    private Context context;


    public BookDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase database) {

        database.execSQL(CREATE_SQL);
        database.execSQL(CREATE_CATEGORY);

        Toast.makeText(context, "Create database succeeded", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int i, int i1) {

        database.execSQL("DROP TABLE IF EXISTS Book");
        database.execSQL("DROP TABLE IF EXISTS Category");

        onCreate(database);

    }
}
