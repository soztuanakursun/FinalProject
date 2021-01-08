package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    TextView  forgotPass;
     Button singup, deneme,singIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainPageDef();
        MainPageClick();

    }
    public void MainPageDef(){
        forgotPass = findViewById(R.id.forgotPass);
        logo = findViewById(R.id.logo);
        logo.setImageResource(R.drawable.logo);
        singup = findViewById(R.id.singup);

        singIn = findViewById(R.id.singIn);


    }
    public  void  MainPageClick(){
        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SingUp.class);
                startActivity(intent);
            }
        });
        //SingIn Link
        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
            }
        });
        //Forgot Password Link
        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ForgotPassword.class);
                startActivity(intent);
            }
        });


    }





}