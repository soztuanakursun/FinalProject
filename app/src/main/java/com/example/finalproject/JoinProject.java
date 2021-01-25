package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JoinProject extends AppCompatActivity {
    TextView JoinProjectText;
    Button joinNo,joinYes;
        // Join here
      // Tuana   wrote these codes,
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_project);
        joinProjectDesc();
        joinProjectClick();


    }

    public void joinProjectDesc(){
        JoinProjectText= findViewById(R.id.JoinProjectText);



    } // Tuana   wrote these codes,
    public void joinProjectClick(){
        //No butonu
        joinNo =  findViewById(R.id.joinNo);
        joinNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
            }
        });
        //yes Butonu
        joinYes =findViewById(R.id.joinYes);
        joinYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfilePage.class);
                startActivity(intent);
            }
        });


    }

}