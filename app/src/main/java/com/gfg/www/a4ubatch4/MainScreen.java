package com.gfg.www.a4ubatch4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;


import androidx.appcompat.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {
    Button b1,b6,b11,b7,b12,b13,switcherclass,imageswitchers;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        b1= (Button) findViewById(R.id.button2);
        b6= (Button) findViewById(R.id.button6);
        b11 = (Button)findViewById(R.id.button11);
        b7 = (Button)findViewById(R.id.button7);
        b12 = (Button)findViewById(R.id.button12);
        b13 = (Button)findViewById(R.id.button13);
        switcherclass = (Button)findViewById(R.id.switcherclass);
        imageswitchers = (Button)findViewById(R.id.imageswitcherclass);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(MainScreen.this,LoginScreen.class);
                startActivity(a);
            }
        });



        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(MainScreen.this,SeekbarScreen.class);
                startActivity(a);

            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(MainScreen.this,RadioButtonScreen.class);
                startActivity(a);

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent (MainScreen.this,DSMenu.class);
                startActivity(a);
            }
        });


        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent (MainScreen.this,CheckboxesScreen.class);
                startActivity(a);
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent (MainScreen.this, ProgressBarScreen.class);
                startActivity(a);
            }
        });

        switcherclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent (MainScreen.this, SwitcherClass.class);
                startActivity(a);
            }
        });

        imageswitchers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent (MainScreen.this, ImageSwitcherClass.class);
                startActivity(a);
            }
        });
    }}