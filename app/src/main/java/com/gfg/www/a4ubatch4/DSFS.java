package com.gfg.www.a4ubatch4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DSFS extends AppCompatActivity {

    String FileName = "myFile";
    Button BtnSave, BtnRead;
    EditText editName;
    TextView readName;

    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dsfs);
        BtnSave =  findViewById(R.id.idBtnSave);
        BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveFile();
            }
        });

        BtnRead =  findViewById(R.id.idBtnRead);
        BtnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readFile();
            }
        });

        editName =  findViewById(R.id.idName);
        readName =  findViewById(R.id.idReadtxt);

    }
    private void readFile() {

        SharedPreferences sharedPref = getSharedPreferences(FileName,Context.MODE_PRIVATE);

        String defaultValue = "DefaultName";

        String name = sharedPref.getString("name", defaultValue);

        readName.setText(name);

        Toast.makeText(this,"Data :"+name,Toast.LENGTH_SHORT).show();

    }
    private void saveFile() {

        String strName = editName.getText().toString();
        SharedPreferences sharedPref = getSharedPreferences(FileName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("name", strName);
        editor.commit();
        Toast.makeText(this,"Data Saved Successfully",Toast.LENGTH_SHORT).show();

    }

}