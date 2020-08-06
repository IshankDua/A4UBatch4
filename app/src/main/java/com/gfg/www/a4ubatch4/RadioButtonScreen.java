package com.gfg.www.a4ubatch4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RadioButtonScreen extends AppCompatActivity {

    RadioButton radioyes,radiomaybe,radiono;
    Button exit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton_screen);

        radiono = (RadioButton) findViewById(R.id.radiono);
        radioyes = (RadioButton) findViewById(R.id.radioyes);
        radiomaybe = (RadioButton) findViewById(R.id.radiomaybe);
        RadioGroup radioattend  = (RadioGroup) findViewById(R.id.radioattendgroup);

        exit = (Button) findViewById(R.id.button12);

        radioattend.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch(i){

                    case R.id.radioyes :
                        Toast.makeText(getApplicationContext(), "Selected:- "+radioyes.getText().toString(), Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radiomaybe :
                        Toast.makeText(getApplicationContext(), "Selected:- "+radiomaybe.getText().toString(), Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radiono :
                        Toast.makeText(getApplicationContext(), "Selected:-  "+radiono.getText().toString(), Toast.LENGTH_SHORT).show();
                        break;

                    default:

                        break;
                }

            }
        });


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(RadioButtonScreen.this,MainScreen.class);
                startActivity(a);


            }
        });
    }
}
