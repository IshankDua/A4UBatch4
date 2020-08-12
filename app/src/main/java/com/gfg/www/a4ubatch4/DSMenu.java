package com.gfg.www.a4ubatch4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DSMenu extends AppCompatActivity {

    Button  sp,is,es;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dsmenu);


        sp = (Button) findViewById(R.id.button15);
        is = (Button ) findViewById(R.id.button);


        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(DSMenu.this,DSFS.class);
                startActivity(a);


            }
        });

        is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(DSMenu.this,DSIS.class);
                startActivity(a);


            }
        });
    }
}
