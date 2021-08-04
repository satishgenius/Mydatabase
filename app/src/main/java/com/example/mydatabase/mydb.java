package com.example.mydatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class mydb extends SQLiteOpenHelper {
    SQLiteDatabase sqLiteDatabase;
    public mydb( Context context) {
        super(context, "dvfb", null, 1);
        sqLiteDatabase=getWritableDatabase();
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table user(Name text,Mobilenumber text,Password text,bloodgroup text, Loaction text,Dob text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long savedata(String s1, String s2, String s3, String s4, String s5, String s6) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Name",s1);
        contentValues.put("Mobilenumber",s2);
        contentValues.put("Password",s3);
        contentValues.put("bloodgroup",s4);
        contentValues.put("Loaction",s5);
        contentValues.put("Dob",s6);
        return sqLiteDatabase.insert("user",null,contentValues);


    }

    public String getpass(String s1) {
        Cursor cursor;
        String f="";
       cursor = sqLiteDatabase.query("user",null,"Mobilenumber=?",new String[]{s1},null,null,null);
        cursor.moveToFirst();
        if (cursor.getCount()<1){
            return "Name is not exist";
        }
        f=cursor.getString(cursor.getColumnIndex("Password"));
        //s2=cursor.getString(cursor.getColumnIndex("Emailid"));
        //s3=cursor.getString(cursor.getColumnIndex("dob"));
        //s4=cursor.getString(cursor.getColumnIndex("cpassword"));
        //Log.i(TAG,s1+"\n"+f);
        return f;

    }
}

