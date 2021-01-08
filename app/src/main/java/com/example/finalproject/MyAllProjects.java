package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAllProjects extends AppCompatActivity {
    ImageView MyALlProjectİmg1,MyALlProjectİmg2,MyALlProjectİmg3,MyALlProjectİmg4;
    TextView project1Title,project2Title,project3Title,project4Title,
            project1Decs,project2Decs,project3Decs,project4Decs;
    Button MycreateProject,back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_all_projects);
        MyAllProjectImgDesc();
        MyAllProjectTitle();MyAllProjectBtnClick();
    }



    public void MyAllProjectImgDesc(){
        //Tüm Resimlerin Tanımları
        MyALlProjectİmg1 = findViewById(R.id.MyALlProjectİmg1);
        MyALlProjectİmg1.setImageResource(R.drawable.proje);
        MyALlProjectİmg2 = findViewById(R.id.MyALlProjectİmg2);
        MyALlProjectİmg2.setImageResource(R.drawable.proje);

        MyALlProjectİmg3 = findViewById(R.id.MyALlProjectİmg3);
        MyALlProjectİmg3.setImageResource(R.drawable.proje);

        MyALlProjectİmg4 = findViewById(R.id.MyALlProjectİmg4);
        MyALlProjectİmg4.setImageResource(R.drawable.proje);
    }
    public void MyAllProjectTitle(){

        //Başlıkların TAnımları ve tıklama olayı
        project1Title = findViewById(R.id.project1Title);
        project1Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BroweseProject.class);
                startActivity(intent);
            }
        });

        project2Title = findViewById(R.id.project2Title);
        project2Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BroweseProject.class);
                startActivity(intent);
            }
        });

        project3Title = findViewById(R.id.project3Title);
        project3Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BroweseProject.class);
                startActivity(intent);
            }
        });

        project4Title = findViewById(R.id.project4Title);
        project4Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BroweseProject.class);
                startActivity(intent);
            }
        });
    }
        public void MyAllProjectBtnClick(){

            MycreateProject = findViewById(R.id.MycreateProject);
            MycreateProject.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //add to Favorite
                    Intent intent = new Intent(getApplicationContext(),CreateNewProject.class);
                    startActivity(intent);
                }
            });

            back = findViewById(R.id.back);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //add to Favorite
                    Intent intent = new Intent(getApplicationContext(),ProfilePage.class);
                    startActivity(intent);
                }
            });
        }


}