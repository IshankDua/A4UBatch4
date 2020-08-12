package com.gfg.www.a4ubatch4;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SwitcherClass extends AppCompatActivity {
    TextSwitcher txtswitcherDemo;
    Button btntxtswtnxt,btntxtswtpre;
    String strTextSwitcher[] = {"All is well","All goes Well","Let byognes be byognes","We will be fine","Corona will go ","TAke care o your health"};
    int currentIndex = -1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switcherclass);
        btntxtswtnxt = (Button) findViewById(R.id.button19);
        btntxtswtpre = (Button) findViewById(R.id.button18);
        txtswitcherDemo = (TextSwitcher) findViewById(R.id.TextSwitcherDemo);
        txtswitcherDemo.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView t = new TextView(SwitcherClass.this);
                t.setGravity(Gravity.TOP | Gravity.CENTER);
                t.setTextSize(36);
                return t;
            }
        });

        txtswitcherDemo.setCurrentText("Click on next button to switch text");

        btntxtswtpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (currentIndex > 0){
                    currentIndex = currentIndex-1;
                    txtswitcherDemo.setText(strTextSwitcher[currentIndex]);
                }

            }
        });

        btntxtswtnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentIndex<strTextSwitcher.length-1){
                    currentIndex = currentIndex+1;
                    txtswitcherDemo.setText(strTextSwitcher[currentIndex]);
                }
            }
        });

    }
}
