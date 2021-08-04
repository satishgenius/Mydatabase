package com.example.mydatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText Name,Mobilenumber,Password,bloodgroup,Location,Dob;
    String s1,s2,s3,s4,s5,s6;
    mydb mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Name  = findViewById(R.id.Name);
        Mobilenumber  = findViewById(R.id.Mobilenumber);
        Password  = findViewById(R.id.Password);
        bloodgroup  = findViewById(R.id.bloodgroup);
        Location  = findViewById(R.id.Location);
        Dob  = findViewById(R.id.Dob);
        mydb = new mydb(this);
    }

    public void subbmit(View view) {
        s1 = Name.getText().toString();
        s2 = Mobilenumber.getText().toString();
        s3 = Password.getText().toString();
        s4 = bloodgroup.getText().toString();
        s5 = Location.getText().toString();
        s6 = Dob.getText().toString();
        long bh =mydb.savedata(s1,s2,s3,s4,s5,s6);
        Log.d("123TAG", "subbmit: " + bh);
        Toast.makeText(this, "saved successfully!", Toast.LENGTH_SHORT).show();

    }
}