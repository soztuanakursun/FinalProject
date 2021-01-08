package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    Button ProfileBtn,
            AiProjectBtn,
            WebProjectBtn,
            IosProjectBtn,
            MobileProjectBtn,
            DatabaseProjectBtn,
            CreateProjetBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ButtonsClick();
    }

    //AiProjectBtn Click
    public void ButtonsClick(){
        ProfileBtn = findViewById(R.id.ProfileBtn);
        ProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfilePage.class);
                startActivity(intent);
            }
        });


        //Aİ Projects
        AiProjectBtn= findViewById(R.id.AiProjectBtn);
        AiProjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Projects.class);
                startActivity(intent);
            }
        });

        //WebProjectBtn
        WebProjectBtn= findViewById(R.id.WebProjectBtn);
        WebProjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Projects.class);
                startActivity(intent);
            }
        });
        //OIS Projects
        IosProjectBtn= findViewById(R.id.IosProjectBtn);
        IosProjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Projects.class);
                startActivity(intent);
            }
        });
        //Mobile Projects
        MobileProjectBtn= findViewById(R.id.MobileProjectBtn);
        MobileProjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Projects.class);
                startActivity(intent);
            }
        });
        //Database Projects
        DatabaseProjectBtn= findViewById(R.id.DatabaseProjectBtn);
        DatabaseProjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Projects.class);
                startActivity(intent);
            }
        });

        //Create Projects
        CreateProjetBtn= findViewById(R.id.CreateProjetBtn);
        CreateProjetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CreateNewProject.class);
                startActivity(intent);
            }
        });
    }


}