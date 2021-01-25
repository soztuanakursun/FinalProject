package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AiProjects extends AppCompatActivity {
    Button join1,join2,join3,join4,back,gotoprofile;
    @Override
    //We created static data because there are projects prepared by the system and other people.
    // Tuana wrote these codes
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_projects);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
            }
        });
        gotoprofile = findViewById(R.id.gotoprofile);
        gotoprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfilePage.class);
                startActivity(intent);
            }
        });



        join1 = findViewById(R.id.join1);
        join1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),JoinProject.class);
                startActivity(intent);
            }
        });

       join2 = findViewById(R.id.join2);
       join2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(),JoinProject.class);
               startActivity(intent);
           }
       });

        join3 = findViewById(R.id.join3);
        join3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),JoinProject.class);
                startActivity(intent);
            }
        });

        join4 = findViewById(R.id.join4);
        join4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),JoinProject.class);
                startActivity(intent);
            }
        });



    }
}