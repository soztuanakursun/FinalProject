package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BroweseProject extends AppCompatActivity {

    ImageView broweseImg;
    TextView broweseTitle,broweseDesc;
    Button addToFavorite,join,cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browese_project);
        BroweseDes();
        BroweseClick();
    }

    public void BroweseDes(){
        //Tüm tanımlamalar Yapıldı
        broweseImg = findViewById(R.id.broweseImg);
        broweseImg.setImageResource(R.drawable.proje);
        //TExt View Tanımları
        broweseTitle = findViewById(R.id.broweseTitle);
        broweseDesc = findViewById(R.id.broweseDesc);

    }

    public void BroweseClick(){
        //Buton Tnaımları ve Clik olayı
        addToFavorite = findViewById(R.id.addToFavorite);
        addToFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add to Favorite
                Intent intent = new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
            }
        });
        //JOin butonu
        join = findViewById(R.id.join);
        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Join the Project Gruop
                Intent intent = new Intent(getApplicationContext(),JoinProject.class);
                startActivity(intent);
            }
        });
    //Cancel Butonu
        cancel = findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Join the Project Gruop
                Intent intent = new Intent(getApplicationContext(),Projects.class);
                startActivity(intent);
            }
        });
    }







}