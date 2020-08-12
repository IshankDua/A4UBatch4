package com.gfg.www.a4ubatch4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_main);

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {

              Intent a = new Intent(SplashScreen.this,MainScreen.class);
              startActivity(a);
              finish();

          }
      },5000);



    }



}