package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SingUp extends AppCompatActivity {
    TextView SingUPTitle;
    EditText name,surname,email,pass,rePass;

    Button Singup,SingIn,OkMembership;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        SingUpDef();





    }

    public void SingUpDef(){
        Singup =findViewById(R.id.Singup);
        Singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
            }
        });

        SingIn =findViewById(R.id.SingIn);
        SingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        //MemberShip Button
        OkMembership =findViewById(R.id.OkMembership);
        OkMembership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Membership.class);
                startActivity(intent);
            }
        });

    }







}