package com.gfg.www.a4ubatch4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProgressBarScreen extends AppCompatActivity {

    ProgressBar progressBardemo;
    Button btnProgress,exit;
    private int progressStatus = 0;

    private Handler handler = new Handler();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbarscreen);

        progressBardemo = (ProgressBar) findViewById(R.id.progressBarDemo);
        btnProgress = (Button) findViewById(R.id.btnprogressbar);
        exit = (Button) findViewById(R.id.exit);


        btnProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        while(progressStatus < 100){
                            progressStatus+= 10;

                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBardemo.setProgress(progressStatus);
                                    if (progressStatus == 100){

                                        progressBardemo.setProgress(progressStatus);
                                        Toast.makeText(ProgressBarScreen.this, "Download Complete", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });

                            try {
                                Thread.sleep(1000);
                            }catch (InterruptedException e ){
                                e.printStackTrace();
                            }
                        }

                    }
                }).start();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ProgressBarScreen.this,MainScreen.class);
                startActivity(a);
            }
        });
    }
}
