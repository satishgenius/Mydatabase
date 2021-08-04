package com.example.mydatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText number,password;
    String s1,s2,lo;
    mydb mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        number = findViewById(R.id.Mobilenumber);
        password = findViewById(R.id.Password);
        mydb = new mydb(this);
    }

    public void signin(View view) {
        s1 = number.getText().toString();
        s2 = password.getText().toString();

         lo = mydb.getpass(s1);

        if (lo.equals(s2)){


          ///  Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
            Intent c = new Intent(MainActivity3.this,MainActivity4.class);
           startActivity(c);
        } else {
            Toast.makeText(this, "invaild data", Toast.LENGTH_SHORT).show();

        }



    }
}