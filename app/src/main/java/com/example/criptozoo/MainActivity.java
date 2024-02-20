package com.example.criptozoo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        FeedReaderDbHelper bbdd = new FeedReaderDbHelper( this );

        SQLiteDatabase bd = bbdd.getReadableDatabase();
        bd.close();
    }
}