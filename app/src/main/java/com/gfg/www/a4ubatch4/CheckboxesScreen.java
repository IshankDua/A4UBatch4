package com.gfg.www.a4ubatch4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CheckboxesScreen extends AppCompatActivity {

    CheckBox mbacheckbox,mcacheckbox;
    Button btncheck,exit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);
        mbacheckbox = (CheckBox) findViewById(R.id.MbaCheckBox);
        mcacheckbox = (CheckBox) findViewById(R.id.McaCheckBox);

        btncheck = (Button) findViewById(R.id.button16);
        exit = (Button) findViewById(R.id.button17);



        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mcacheckbox.isChecked() && mbacheckbox.isChecked()){
                    Toast.makeText(CheckboxesScreen.this, "Checked:-" +mcacheckbox.getText().toString()+"\n" + "Checked:- "+mbacheckbox.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else if (mcacheckbox.isChecked()){
                    Toast.makeText(CheckboxesScreen.this, "Checked:- "+mcacheckbox.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else if (mbacheckbox.isChecked()){
                    Toast.makeText(CheckboxesScreen.this, "Checked:- "+mbacheckbox.getText().toString(), Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(CheckboxesScreen.this, "Please select any one option ", Toast.LENGTH_SHORT).show();
                }


            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(CheckboxesScreen.this,MainScreen.class);
                startActivity(a);
            }
        });

    }
}
