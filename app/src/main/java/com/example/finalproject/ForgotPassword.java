package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPassword extends AppCompatActivity {
    Button ForgotPasswordBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        ForgotPasswordTanım();
        ForgotPasswordItems();

    }
    public void ForgotPasswordTanım(){
        ForgotPasswordBtn = findViewById(R.id.changePasswordBtn);
    }
    public void ForgotPasswordItems(){
    ForgotPasswordBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),ConfirmPassword.class);
            startActivity(intent);
        }
    });
    }
}