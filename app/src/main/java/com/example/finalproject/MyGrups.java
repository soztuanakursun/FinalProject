package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyGrups extends AppCompatActivity {

    TextView MyGrupsTitle,MyGroupsDesc;
    Button Profile,GroupA,GroupB,GroupC,GroupD,GroupE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_grups);
        GroupsButtonClick();
    }
    public void GroupsButtonClick(){
        Profile= findViewById(R.id.Profile);
        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfilePage.class);
                startActivity(intent);
            }
        });


        //GrupA Butonu
        GroupA= findViewById(R.id.GroupA);
        GroupA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GrouopInformation.class);
                startActivity(intent);
            }
        });

        //GrupB Butonu
        GroupB= findViewById(R.id.GroupB);
        GroupB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GrouopInformation.class);
                startActivity(intent);
            }
        });
        //GrupC Butonu
        GroupC= findViewById(R.id.GroupC);
        GroupC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GrouopInformation.class);
                startActivity(intent);
            }
        });

        //GrupD Butonu
        GroupD= findViewById(R.id.GroupD);
        GroupD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GrouopInformation.class);
                startActivity(intent);
            }
        });

        //GrupE Butonu
        GroupE= findViewById(R.id.GroupE);
        GroupE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GrouopInformation.class);
                startActivity(intent);
            }
        });




    }



}