package com.gfg.www.a4ubatch4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginScreen extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        b1= (Button) findViewById(R.id.button8);
        b2= (Button) findViewById(R.id.button9);
        e1= (EditText) findViewById(R.id.e1);
        e2= (EditText) findViewById(R.id.e2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = "Ishank";
                String password = "12345";



                String inputusername = e1.getText().toString();
                String inputPassword = e2.getText().toString();


                if(inputusername.equals(username)){
                    if(inputPassword.equals(password)){

                        Toast.makeText(LoginScreen.this, "Login Successfull", Toast.LENGTH_SHORT).show();

                        Intent a = new Intent(LoginScreen.this,MainScreen.class);
                        startActivity(a);
                    }
                    else{
                        Toast.makeText(LoginScreen.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText(LoginScreen.this, "Incorrect Username", Toast.LENGTH_SHORT).show();
                }






            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(LoginScreen.this,SignupScreen.class);
                startActivity(a);
            }
        });
    }
}
