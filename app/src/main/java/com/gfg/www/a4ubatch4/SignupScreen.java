package com.gfg.www.a4ubatch4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignupScreen extends AppCompatActivity {

    TextView t1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_screen);
        t1 = (TextView) findViewById(R.id.textView14);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(SignupScreen.this,LoginScreen.class);
                startActivity(a);
            }
        });
    }


}
