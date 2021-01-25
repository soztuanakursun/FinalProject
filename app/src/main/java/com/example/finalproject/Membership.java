package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Membership extends AppCompatActivity {
    TextView MembershipTitle,MembershipText;
    // Tuana   wrote these codes,
    Button acceptMembership;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership);
        AllDefines();
        ClickAcceptMembership();
    }

    public  void AllDefines(){
        acceptMembership = findViewById(R.id.acceptMembership);
    }
    public void ClickAcceptMembership(){
        acceptMembership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SingUp.class);
                startActivity(intent);
            }
        });

    }


}