package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfilePage extends AppCompatActivity {
    ImageView ProfileImg;
    TextView ProfileTitle,ProfileJob,ProfileText;
    Button ProfileProjectBtn,ProfileGrup,ProfileFav,ProfileMainPAge,ProfileSetings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        ProfileImgDesc();
        ProfileButtonDesc();

    }

    public void ProfileImgDesc(){
        //Profil Resmi Tanımı
        ProfileImg = findViewById(R.id.ProfileImg);
        ProfileImg.setImageResource(R.drawable.profile1);
        //TExt tanımları
        ProfileTitle =findViewById(R.id.ProfileTitle);
        ProfileJob =findViewById(R.id.ProfileJob);
        ProfileText =findViewById(R.id.ProfileText);

    }

    public void ProfileButtonDesc(){
        //Butonlar Tanımı ve Clik olayı

        ProfileProjectBtn = findViewById(R.id.ProfileProjectBtn);
        ProfileProjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MyAllProjects.class);
                startActivity(intent);
            }
        });

        ProfileGrup = findViewById(R.id.ProfileGrup);
        ProfileGrup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MyGrups.class);
                startActivity(intent);
            }
        });

        ProfileFav = findViewById(R.id.ProfileFav);
        ProfileFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //favori Projeleri
                Intent intent = new Intent(getApplicationContext(),MyFavoriteProjects.class);
                startActivity(intent);
            }
        });

        ProfileMainPAge = findViewById(R.id.ProfileMainPAge);
        ProfileMainPAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
            }
        });


        ProfileSetings = findViewById(R.id.ProfileSetings);
        ProfileSetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfileSettings.class);
                startActivity(intent);
            }
        });



    }





}