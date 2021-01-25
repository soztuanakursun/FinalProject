package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    TextView  forgotPass,deneme;
    EditText email,pass;
     Button singup,singIn;
     //Database Instence
    FirebaseDatabase database;
    FirebaseAuth auth;

    //    // Tuana   wrote these codes, MAin Section
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getInstanceFirebase();
        MainPageDef();
        MainPageClick();

    }
    
    public void getInstanceFirebase(){
        //get instance to firebase database. Login to Firebase
        database = FirebaseDatabase.getInstance();
    }
    public void MainPageDef(){
        forgotPass = findViewById(R.id.forgotPass);
        logo = findViewById(R.id.logo);
        logo.setImageResource(R.drawable.logo);
        singup = findViewById(R.id.singup);

        singIn = findViewById(R.id.singIn);
        auth = FirebaseAuth.getInstance();
        email =findViewById(R.id.email);
        pass = findViewById(R.id.pass);


    }



    // Tuana   wrote these codes, MAin Section
    public  void  MainPageClick(){
        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SingUp.class);
                startActivity(intent);
            }
        });
        //SingIn Link
        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String sing_emial = email.getText().toString();
                 String sing_pass = pass.getText().toString();
                 if(!sing_emial.equals("")&& !sing_pass.equals("")){
                    //Sisteme Girş Yapabilmeli
                    girisyap(sing_emial,sing_pass);
                 }else{
                        //başarısız ise
                     Toast.makeText(getApplicationContext(),"Please enter your email and password information!",Toast.LENGTH_LONG).show();
                 }
            }
        });
        //Forgot Password Link
        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ForgotPassword.class);
                startActivity(intent);
            }
        });


    }
    public void girisyap(final String email, String pass){
        //giris yap kısmı
            auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        gotoHomePAge();
                    }else{
                        Toast.makeText(getApplicationContext(),"Emila or password incorrect!",Toast.LENGTH_LONG).show();
                    }

                }
            });



    }
    public void gotoHomePAge(){
        Intent intent = new Intent(MainActivity.this,HomePage.class);
        intent.putExtra("name",email.getText().toString());
        startActivity(intent);
        finish();
    }




}
