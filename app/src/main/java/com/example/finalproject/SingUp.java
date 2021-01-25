package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class SingUp extends AppCompatActivity {
    TextView SingUPTitle,OkMembership;
    EditText email,pass,rePass;
  //Mert wrote these codes
    Button Singup,SingIn;
    //Database Instence
    FirebaseDatabase database;
    DatabaseReference reference, ref2;
    FirebaseAuth auth;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        SingUpDef();
        getInstanceFirebase();


    }
    public void getInstanceFirebase(){
        //get instance to firebase database. Login to Firebase Mert wrote these codes
        database = FirebaseDatabase.getInstance();
    }
    public void SingUpDef(){
        auth = FirebaseAuth.getInstance();
        email= findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        Singup =findViewById(R.id.Singup);
        Singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input_email = email.getText().toString();
                String input_pass = pass.getText().toString();
                if(!input_email.equals("")&& !input_pass.equals("")){
                    email.setText("");
                    pass.setText("");
                    kayitol(input_email,input_pass);
                }else{
                    //Mert wrote these codes
                    Toast.makeText(getApplicationContext(),"BilgileriBoşGiremezsiniz",Toast.LENGTH_LONG).show();
                }

            }
        });

        SingIn =findViewById(R.id.SingIn);
        SingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        //MemberShip Button Mert wrote these codes
        OkMembership =findViewById(R.id.OkMembership);
        OkMembership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Membership.class);
                startActivity(intent);
            }
        });



    }
    public void kayitol(String email,String pass){
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                  database = FirebaseDatabase.getInstance();
                                                                                //id değerini otomatik aldık
                  reference = database.getReference().child("Kullanicilar").child(auth.getUid());

                    //Mert and  Tuana wrote these codes
                  Map map =new HashMap();
                  map.put("resim","null");
                  map.put("isim","null");
                  map.put("soyisim","null");
                  map.put("sehir","null");
                  map.put("hakkımda","null");
                  map.put("gruplar","null");
                  map.put("projeler","null");
                  map.put("meslek","null");
                    //kişilerin Bilgileri GDatabase e klendi
                  reference.setValue(map);




                    //Eğer Kayıt işlemiBaşarılı ise buraya Yönlendir.
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    //Burası Önemli
                    finish();

                }else{
                    Toast.makeText(getApplicationContext(),"Kayıt Olma esnasındaBir Problem Yaşandı",Toast.LENGTH_LONG).show();
                }
            }
        });
    }







}