package cimdata.android.dez2017.sqlitemitcontractundopenhelper.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

/**
 * Created by Student on 14.12.2017.
 */

public class DatabaseSQLiteOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "database.db";
    // Die Versionsnummer. Wenn wir eine Veränderung am DB-Schema vornehmen, müssen wir diese inkrementieren.
    private static final int VERSION_NUMBER = 1;

    public DatabaseSQLiteOpenHelper(Context context) {

        // Hier wird die Datenbank geöffnet
        super(context, DATABASE_NAME, null, VERSION_NUMBER);


    }

    // Hier erstellen wir die Tabelle
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NamesContract.CREATE_NAMES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}
}
