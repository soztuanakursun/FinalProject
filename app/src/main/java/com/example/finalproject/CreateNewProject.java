package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateNewProject extends AppCompatActivity {
    TextView createprojectText;
    EditText projectName,projectCat,projectDesc;
    Button createProject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_project);
        CreateProjectDes();
        CreateProjectClick();
    }


    public void CreateProjectDes(){
        createprojectText= findViewById(R.id.createprojectText);
        projectName = findViewById(R.id.projectName);
        projectCat = findViewById(R.id.projectCat);
        projectDesc = findViewById(R.id.projectDesc);
    }
    public void CreateProjectClick(){
        createProject = findViewById(R.id.createProject);
        createProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MyAllProjects.class);
                startActivity(intent);
            }
        });
    }



}