package cimdata.android.dez2017.sqlitemitcontractundopenhelper.db;



// Diese Klasse stellt die Tabellen-Informationen unserer Datenbank als
// Konstanten in statischen Unterklassen zur Verfügung.

import android.provider.BaseColumns;

public class NamesContract {

    static final String CREATE_NAMES_TABLE =
            "CREATE TABLE IF NOT EXISTS " + NamesEntry.TABLE_NAME +
            "(" +
            NamesEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            NamesEntry.COLUMN_NAME + " TEXT " +
            ")";

    // Die Klasse für unsere Names-Tabelle
    static final class NamesEntry implements BaseColumns {

        public static final String TABLE_NAME = "names";
        public static final String COLUMN_NAME = "name";

    }

}
