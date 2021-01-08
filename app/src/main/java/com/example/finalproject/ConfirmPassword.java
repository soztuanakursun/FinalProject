package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmPassword extends AppCompatActivity {
    Button ConfirmPasswordBtn;
    TextView ConfirmPasswordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_password);
        ConfirmPasswordDef();
        ConfirmPasswordClick();
    }

    public void ConfirmPasswordDef(){
        ConfirmPasswordText= findViewById(R.id.ConfirmPasswordBtn);
        ConfirmPasswordBtn = findViewById(R.id.ConfirmPasswordBtn);
    }
    public void ConfirmPasswordClick(){
        ConfirmPasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }


}