package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class HomePage extends AppCompatActivity {
    Button ProfileBtn,
            AiProjectBtn,
            WebProjectBtn,
            IosProjectBtn,
            MobileProjectBtn,
            DatabaseProjectBtn,
            CreateProjetBtn;
    TextView welcome_user;
    FirebaseDatabase firebaseDatabase;
    FirebaseAuth fauth;
     FirebaseAuth.AuthStateListener authstate;

     // MErt wrote codes here!


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ButtonsClick();
        fauth = FirebaseAuth.getInstance();
        authstate = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                FirebaseUser user = firebaseAuth.getCurrentUser();

                if(user==null){

                    startActivity(new Intent(HomePage.this,MainActivity.class));
                    finish();


                }
            }

        };
        //welcome_message(); Kullanıcı kodunu gösteren yerde hatalar var!!!!!!!



    }
    public void welcome_message(){
        Intent intent = getIntent();
        String username = "Welcome    " + intent.getStringExtra("name");
        welcome_user.setText(username);
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
                Intent intent = new Intent(getApplicationContext(),AiProjects.class);
                startActivity(intent);
            }
        });

        //WebProjectBtn
        WebProjectBtn= findViewById(R.id.WebProjectBtn);
        WebProjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),WebProjects.class);
                startActivity(intent);
            }
        });
        //OIS Projects
        IosProjectBtn= findViewById(R.id.IosProjectBtn);
        IosProjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IOSProjects.class);
                startActivity(intent);
            }
        });
        //Mobile Projects
        MobileProjectBtn= findViewById(R.id.MobileProjectBtn);
        MobileProjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MobileProjects.class);
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