package com.gfg.www.a4ubatch4;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DSIS extends AppCompatActivity {
    EditText editTextFileName,editTextData;
    Button saveButton,readButton;
    TextView txtfilename,txtdata;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dsis);

        editTextFileName = (EditText) findViewById(R.id.edtfilename);
        editTextData = (EditText) findViewById(R.id.edtdata);

        txtdata = (TextView) findViewById(R.id.txtdata);
        txtfilename= (TextView) findViewById(R.id.txtfilename);

        saveButton = (Button) findViewById(R.id.btnsavetofile);
        readButton = (Button)findViewById(R.id.btnreadfile);



        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filename = editTextFileName.getText().toString();
                String data = editTextData.getText().toString();

                FileOutputStream fos;

                try{
                    fos = openFileOutput(filename, Context.MODE_PRIVATE);
                    fos.write(data.getBytes());
                    fos.close();
                    Toast.makeText(getApplicationContext(), filename + "saved", Toast.LENGTH_SHORT).show();
                }catch (FileNotFoundException e ){
                    e.printStackTrace();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        });


        readButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String filename= editTextFileName.getText().toString();
                    FileInputStream fin = openFileInput(filename);
                    InputStreamReader inputStreamReader = new InputStreamReader(fin);

                    BufferedReader br = new BufferedReader(inputStreamReader);

                    StringBuilder stringBuffer = new StringBuilder();
                    String line = null;

                    while((line = br.readLine()) != null){
                        stringBuffer.append(line);

                    }
                    fin.close();
                    inputStreamReader.close();
                    txtfilename.setText("File Name = "+filename);
                    txtdata.setText("Data "+stringBuffer.toString());

                }catch(IOException e){
                    e.printStackTrace();
                }

            }
        });

    }
}
