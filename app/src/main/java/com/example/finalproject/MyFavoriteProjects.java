package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyFavoriteProjects extends AppCompatActivity {
    ImageView Favproject1img,Favproject2img,Favproject3img,Favproject4img;
    TextView Favproject1Title,Favproject2Title,Favproject3Title,Favproject4Title,
            Favproject1Des,Favproject2Des,Favproject3Des,Favproject4Des;
    Button Favback,FavMycreateProject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_favorite_projects);
        FavProjectsImgDef();
                FavProjectTextDef();

        FavprojectClick();
    }


    public void FavProjectsImgDef(){
        //Tüm resimlere ulaştık
        Favproject1img = findViewById(R.id.FavMyALlProjectİmg1);
        Favproject1img.setImageResource(R.drawable.proje);

        Favproject2img = findViewById(R.id.FavMyALlProjectİmg2);
        Favproject2img.setImageResource(R.drawable.proje);

        Favproject3img = findViewById(R.id.FavMyALlProjectİmg3);
        Favproject3img.setImageResource(R.drawable.proje);

        Favproject4img = findViewById(R.id.FavMyALlProjectİmg4);
        Favproject4img.setImageResource(R.drawable.proje);

    }
    public void FavProjectTextDef(){
        //Proje Text Tanımları
        Favproject1Title = findViewById(R.id.Favproject1Title);
        Favproject2Title =findViewById(R.id.Favproject2Title);
        Favproject3Title =findViewById(R.id.Favproject3Title);
        Favproject4Title =findViewById(R.id.Favproject4Title);

        Favproject1Des = findViewById(R.id.Favproject1Decs);
        Favproject2Des = findViewById(R.id.Favproject2Decs);
        Favproject3Des = findViewById(R.id.Favproject3Decs);
        Favproject4Des = findViewById(R.id.Favproject4Decs);


    }
    public void FavprojectClick(){
        //projelere tıklama olayı
        Favproject1Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BroweseProject.class);
                startActivity(intent);
            }
        });

        Favproject2Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BroweseProject.class);
                startActivity(intent);
            }
        });
        Favproject3Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BroweseProject.class);
                startActivity(intent);
            }
        });
        Favproject4Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BroweseProject.class);
                startActivity(intent);
            }
        });

        //Create Button
        FavMycreateProject = findViewById(R.id.FavMycreateProject);
        FavMycreateProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CreateNewProject.class);
                startActivity(intent);
            }
        });
        //Back Button
        Favback = findViewById(R.id.Favback);
        Favback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfilePage.class);
                startActivity(intent);
            }
        });
    }
}