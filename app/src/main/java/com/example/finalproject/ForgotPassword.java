package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.storage.FirebaseStorage;

public class ForgotPassword extends AppCompatActivity {
    EditText email_adress;
    Button ForgotPasswordBtn;
    FirebaseAuth fAuth;
    FirebaseStorage fStorage;
    FirebaseUser user;
    String UserId;
        //Forgot Password here, Tuana wrote these codes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        ForgotPasswordTanım();
        ForgotPasswordItems();

    }
    public void ForgotPasswordTanım(){
        ForgotPasswordBtn = findViewById(R.id.changePasswordBtn);
        email_adress = findViewById(R.id.email_adress);

    }
    public void ForgotPasswordItems(){
    ForgotPasswordBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String email = email_adress.getText().toString();
            //Firebase create getInstance Tuana wrote these codes
            fAuth = FirebaseAuth.getInstance();
            fStorage=FirebaseStorage.getInstance();
           UserId = fAuth.getCurrentUser().getUid();
           user = fAuth.getCurrentUser();

           if(TextUtils.isEmpty(email)){
               Toast.makeText(ForgotPassword.this, "Please Check Your Email Address", Toast.LENGTH_SHORT).show();
           }

           else{
                //Tuana wrote these codes
            fAuth.sendPasswordResetEmail(email).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void aVoid) {
                    Intent intent = new Intent(getApplicationContext(),ConfirmPassword.class);
                    startActivity(intent);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(ForgotPassword.this, "Please Check Your Email Address", Toast.LENGTH_SHORT).show();
                }
            });




           }

        }
    });
    }
}