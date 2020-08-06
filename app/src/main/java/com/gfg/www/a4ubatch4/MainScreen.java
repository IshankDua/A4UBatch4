package com.gfg.www.a4ubatch4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {
    Button b1,b6,b11;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        b1= (Button) findViewById(R.id.button2);
        b6= (Button) findViewById(R.id.button6);
        b11 = (Button)findViewById(R.id.button11);

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

    }}