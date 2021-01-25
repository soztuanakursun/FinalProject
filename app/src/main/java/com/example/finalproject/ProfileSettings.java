package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.HashMap;
import java.util.Map;

public class ProfileSettings extends AppCompatActivity {
    //Mert  wrote these codes
    ImageView ProfileImg;
    EditText UpdateName,UpdateSurname,UpdateCity,Job,
            UpdateAboutMe;
    Button Update;
    FirebaseDatabase database;
    FirebaseAuth auth;
    FirebaseUser user;
    DatabaseReference reference;
    //Storage Referancedan birreferans oluşturduk
    StorageReference storageReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_settings);
        ProfileSettingImg();
        ProfileSeetiingEdit();
        ProfileClik();
        ProfileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGalery();
            }
        });

    }
    public void ProfileSettingImg(){
        //Profil Resmi Tanımlandı
        ProfileImg = findViewById(R.id.ProfileImg);
        ProfileImg.setImageResource(R.drawable.profile1);
        //tanımlama storage
        storageReference = FirebaseStorage.getInstance().getReference();
    }
    public void openGalery(){
        //resmetıklanınca galeriyi açacağız.
        //AşagıdakiKodlar Genel kodlardır.
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent,5);//request code öylesine bir değer atandı
    }
    public void onActivityResult(int requestCode,int resultCode,Intent data) {

        super.onActivityResult(requestCode, resultCode, data); //super özelliği sonraki sürümlerde geldi eskilerinde yok
        if(requestCode==5&& resultCode== Activity.RESULT_OK){
            Uri filePath = data.getData();
            StorageReference ref =  storageReference.child("User Image").child("ProfileImg.jpg");
            ref.putFile(filePath).addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
                    //Resim Yükleme Kısmı
                    if(task.isSuccessful()){
                        Toast.makeText(getApplicationContext(),"Resim Yüklendi",Toast.LENGTH_LONG).show();
                        String update_name = UpdateName.getText().toString();
                        String update_surname= UpdateSurname.getText().toString();
                        String update_city =  UpdateCity.getText().toString();
                        String update_job= Job.getText().toString();
                        String update_aboutme= UpdateAboutMe.getText().toString();

                        reference = database.getReference().child("Kullanicilar").child(auth.getUid());
                        Map map =new HashMap();

                        map.put("isim",update_name);
                        map.put("soyisim",update_surname);

                        map.put("hakkımda",update_aboutme);

                        map.put("gruplar","null");
                        map.put("projeler","null");
                        map.put("sehir",update_city);
                        map.put("meslek",update_job);
                  //!!!!!!!! yükleyecegimiz resmin linki lazım bizler onuda tasktdan alacagız Hata Var !!!
                        //map.put("resim",task.getResult().getDownload().toString());
                        //kişilerin Bilgileri GDatabase e klendi
                        reference.setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()){
                                    //Güncelleme İşlemi Başarılı ise
                                    Toast.makeText(getApplicationContext(),"Güncelleme BaşarılıBir şekilde Gerçekleşti",Toast.LENGTH_LONG).show();
                                    Intent i = new Intent(getApplicationContext(),ProfilePage.class);
                                    startActivity(i);
                                }else{
                                    //Güncelleme İşlemi Başarısız ise
                                    Toast.makeText(getApplicationContext(),"Opps! Bir Problem Yaşandı",Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                    }else{
                        Toast.makeText(getApplicationContext(),"Opps! Bir Problem Yaşandı",Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }
    public void ProfileSeetiingEdit(){
        // Edittext tanımlandı
        UpdateName= findViewById(R.id.UpdateName);
        UpdateSurname= findViewById(R.id.UpdateSurname);
        UpdateCity= findViewById(R.id.UpdateCity);
        Job= findViewById(R.id.Job);
        UpdateAboutMe= findViewById(R.id.UpdateAboutMe);



    }
    public void ProfileClik(){
        Update = findViewById(R.id.Update);
        Update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileSettingsEdit();
            }
        });
    }
    public void profileSettingsEdit(){

        auth =FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        database = FirebaseDatabase.getInstance();



        String update_name = UpdateName.getText().toString();
       String update_surname= UpdateSurname.getText().toString();
       String update_city =  UpdateCity.getText().toString();
       String update_job= Job.getText().toString();
       String update_aboutme= UpdateAboutMe.getText().toString();

        reference = database.getReference().child("Kullanicilar").child(auth.getUid());
        Map map =new HashMap();

        map.put("isim",update_name);
        map.put("soyisim",update_surname);

        map.put("hakkımda",update_aboutme);

        map.put("gruplar","null");
        map.put("projeler","null");
        map.put("sehir",update_city);
        map.put("meslek",update_job);
        //kişilerin Bilgileri GDatabase e klendi
        reference.setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    //Güncelleme İşlemi Başarılı ise
                    Toast.makeText(getApplicationContext(),"Güncelleme BaşarılıBir şekilde Gerçekleşti",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(),ProfilePage.class);
                    startActivity(i);
                }else{
                    //Güncelleme İşlemi Başarısız ise
                    Toast.makeText(getApplicationContext(),"Opps! Bir Problem Yaşandı",Toast.LENGTH_LONG).show();
                }
            }
        });

    }






}