package cimdata.android.dez2017.sqlitemitcontractundopenhelper.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by Jonas on 14.12.2017.
 */

public class NamesDataSource {

    private static final String TAG = "*** NamesDataSource";

    private SQLiteDatabase database;
    private DatabaseSQLiteOpenHelper dbHelper;

    public NamesDataSource (Context context) {

        this.dbHelper = new DatabaseSQLiteOpenHelper(context);
    }

    public void open() {

        // Hier holen wir uns die Datenbank aus unserem Helper.
        this.database = dbHelper.getWritableDatabase();

        Log.d(TAG, "DB open!");
    }

    public void close() {
        database.close();

        Log.d(TAG, "DB close!");
    }

    public Cursor fetchAllNames () {

        Cursor cursor = database.rawQuery(
                "SELECT " +
                        NamesContract.NamesEntry._ID + " || '.' AS " + NamesContract.NamesEntry._ID + ", " +
                        NamesContract.NamesEntry.COLUMN_NAME +
                        " FROM " +
                        NamesContract.NamesEntry.TABLE_NAME,
                null);
        return cursor;

    }

}
