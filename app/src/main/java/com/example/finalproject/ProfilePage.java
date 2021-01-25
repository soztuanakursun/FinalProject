package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.finalproject.Modals.Users;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class ProfilePage extends AppCompatActivity {
    ImageView ProfileImg;
    TextView ProfileTitle,ProfileJob,ProfileText,Soyad;
    Button ProfileProjectBtn,ProfileGrup,ProfileFav,ProfileMainPAge,ProfileSetings,logout,cık;
    FirebaseDatabase database;
    FirebaseAuth auth;
    FirebaseUser user;
    DatabaseReference reference;
    String Groups,Projects;
    //Storage Referancedan birreferans oluşturduk
    //MErt  wrote these codes
    StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        ProfileImgDesc();
        ProfileButtonDesc();
        getInstanceFirebase();
        bilgigetir();



    }
    public void getInstanceFirebase(){
        //get instance to firebase database. Login to Firebase
        database = FirebaseDatabase.getInstance();
    }
    public void ProfileImgDesc(){
        //Profil Resmi Tanımı
        ProfileImg = findViewById(R.id.ProfileImg);
        ProfileImg.setImageResource(R.drawable.profile1);
        //TExt tanımları
        ProfileTitle =findViewById(R.id.ProfileTitle);
        ProfileJob =findViewById(R.id.ProfileJob);
        ProfileText =findViewById(R.id.ProfileText);
        //tanımlama storage
        storageReference = FirebaseStorage.getInstance().getReference();

    }

    public void ProfileButtonDesc(){
        //Butonlar Tanımı ve Clik olayı

        ProfileProjectBtn = findViewById(R.id.ProfileProjectBtn);
        ProfileProjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProjectsGetPage.class);
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


        cık = findViewById(R.id.logout);
        cık.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.signOut();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });




    }



    public void bilgigetir(){

            auth =FirebaseAuth.getInstance();
            user = auth.getCurrentUser();
            database = FirebaseDatabase.getInstance();
            reference = database.getReference().child("Kullanicilar").child(user.getUid());

            reference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //öncelikle Model türünden nesne oluşturuyoruz
                    Users all_users = dataSnapshot.getValue(Users.class);
                    //Ardından oluşturdupumuz nesneler yardımıyla Xml deki değerlerigüncelliyoruz
                    ProfileTitle.setText(all_users.getIsim());
                    ProfileJob.setText(all_users.getMeslek());
                    ProfileText.setText(all_users.getHakkımda());



                  /*  if(!all_users.getResim().equals("null")){
                        //eğer resimdeğeri nulldeğilise kullanucudan resimeklemesiniisteriz

                    }*/





                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });



    }


   // public void logout(View view) {
     //   auth.signOut();

    //}
}