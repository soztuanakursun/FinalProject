package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Projects extends AppCompatActivity {
    ImageView project1img,project2img,project3img,project4img;
    TextView project1Title,project2Title,project3Title,project4Title,
    project1Des,project2Des,project3Des,project4Des;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        ProjectsImgDef();
        ProjectTextDef();
        projectClick();
    }

    public void ProjectsImgDef(){
        //Tüm resimlere ulaştık
        project1img = findViewById(R.id.project1img);
        project1img.setImageResource(R.drawable.proje);

        project2img = findViewById(R.id.project2img);
        project2img.setImageResource(R.drawable.proje);

        project3img = findViewById(R.id.project3img);
        project3img.setImageResource(R.drawable.proje);

        project4img = findViewById(R.id.project4img);
        project4img.setImageResource(R.drawable.proje);

    }
    public void ProjectTextDef(){
        //Proje Text Tanımları
        project1Title = findViewById(R.id.project1Title);
        project2Title =findViewById(R.id.project2Title);
        project3Title =findViewById(R.id.project3Title);
        project4Title =findViewById(R.id.project4Title);

        project1Des = findViewById(R.id.project1Decs);
        project2Des = findViewById(R.id.project2Decs);
        project3Des = findViewById(R.id.project3Decs);
        project4Des = findViewById(R.id.project4Decs);


    }
    public void projectClick(){
        //projelere tıklama olayı
        project1Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BroweseProject.class);
                startActivity(intent);
            }
        });

        project2Title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BroweseProject.class);
                startActivity(intent);
            }
        });

    }
}