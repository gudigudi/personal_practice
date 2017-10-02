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
    private Context context;


    public BookDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase database) {

        database.execSQL(CREATE_SQL);
        Toast.makeText(context, "Create succeeded", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int i, int i1) {


    }
}
