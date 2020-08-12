package com.gfg.www.a4ubatch4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ImageSwitcherClass extends AppCompatActivity {

    ImageSwitcher imageswitcherdemo;
    Button imgbtnnxt,imgbtnpre,exit;

    int imagesswitchId [ ] = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.clock};
    int count = imagesswitchId.length;
    int currentIndex= -1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageswitcher);

        imageswitcherdemo = (ImageSwitcher) findViewById(R.id.ImageSwitcherDemo);
        imgbtnpre = (Button) findViewById(R.id.imgbtnpre);
        imgbtnnxt= (Button) findViewById(R.id.imgbtnnxt);
        exit = (Button) findViewById(R.id.button23);

        imageswitcherdemo.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
              return imageView;
            }
        });

        imgbtnnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentIndex<imagesswitchId.length-1)
                    currentIndex = currentIndex+1;
                imageswitcherdemo.setImageResource(imagesswitchId[currentIndex]);
            }
        });

        imgbtnpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentIndex > 0){

                    currentIndex = currentIndex-1;
                    imageswitcherdemo.setImageResource(imagesswitchId[currentIndex]);
                }
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ImageSwitcherClass.this,MainScreen.class);
                startActivity(a);
            }
        });
    }
}
