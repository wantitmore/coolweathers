package com.example.administrator.coolweathers.activity.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2015/12/8.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    public static final String CREATE_PROVINCE = "create table Province(" +
            "id integer primary key autoincrement," +
            "province_name text," +
            "province_code text)";

    public static final String CREATE_CITY = "create table city(" +
            "id integer pramary key autoincrement," +
            "city_name text," +
            "city_code text," +
            "province_id integer)";

        public static final String CREATE_COUNTRY = "create table country(" +
            "id integer pramary key autoincrement," +
            "country_name text," +
            "country_code text," +
            "city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTRY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
