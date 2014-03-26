package com.lunchamigos.timedate;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class myDatabase extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "timedb";
	private static final String TABLE_TIME = "time";

	private static final String KEY_TIME = "time";

	public myDatabase(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	//create tables
	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_TIME_TABLE = "CREATE TABLE " + TABLE_TIME + "("
			+ KEY_TIME + "Time" + ")";
		db.execSQL(CREATE_TIME_TABLE);
	}

	//upgrade database
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_TIME);
		onCreate(db);
	}
}
