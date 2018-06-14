package com.example.kenny.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        };
    public void jumpTologin(View v){
        Intent i =new Intent(this,login.class);
        startActivity(i);

    }
    public void jumpToregister(View v){
        Intent j=new Intent(this,register.class);
        startActivity(j);
    }


    }

