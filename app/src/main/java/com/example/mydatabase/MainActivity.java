package com.example.mydatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    mydb mydb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mydb= new mydb(this);
    }

    public void signup(View view) {
        Intent a = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(a);
    }

    public void signin(View view) {
        Intent b  = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(b);
    }


    // mydb.saveddata(s1,s2);







    }