package com.gfg.www.a4ubatch4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SeekbarScreen extends AppCompatActivity {
    SeekBar seekbar;
    Button exit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seekbar_screen);

        seekbar = (SeekBar) findViewById(R.id.seekBar);
        exit = (Button) findViewById(R.id.button10);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int seekbarProgressValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seekbarProgressValue= i;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Toast.makeText(SeekbarScreen.this, "Seekbar Progress is :- "+seekbarProgressValue, Toast.LENGTH_SHORT).show();

            }
        });



        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(SeekbarScreen.this,MainScreen.class);
                startActivity(a);


            }
        });
    }
}
