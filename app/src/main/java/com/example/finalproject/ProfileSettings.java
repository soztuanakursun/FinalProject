package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileSettings extends AppCompatActivity {
    ImageView ProfileImg;
    EditText UpdateName,UpdateSurname,UpdateCity,UpdateCompany,
            UpdateAboutMe;
    Button Update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_settings);
        ProfileSettingImg();
        ProfileSeetiingEdit();
        ProfileClik();

    }
    public void ProfileSettingImg(){
        //Profil Resmi Tanımlandı
        ProfileImg = findViewById(R.id.ProfileImg);
        ProfileImg.setImageResource(R.drawable.profile1);
    }

    public void ProfileSeetiingEdit(){
        // Edittext tanımlandı
        UpdateName= findViewById(R.id.UpdateName);
        UpdateSurname= findViewById(R.id.UpdateSurname);
        UpdateCity= findViewById(R.id.UpdateCity);
        UpdateCompany= findViewById(R.id.UpdateCompany);
        UpdateAboutMe= findViewById(R.id.UpdateAboutMe);



    }
    public void ProfileClik(){
        Update = findViewById(R.id.Update);
        Update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProfilePage.class);
                startActivity(intent);
            }
        });
    }






}