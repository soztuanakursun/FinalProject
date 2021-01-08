package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AddNewMember extends AppCompatActivity {
    TextView AddMember1,AddMember2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_member);
        AddMemberClick();
    }

    public void AddMemberClick(){
        //TExt TAnımlamaları ve Clik olayları

        AddMember1 = findViewById(R.id.AddMember1);
        AddMember1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GrouopInformation.class);
                startActivity(intent);
            }
        });

        //2.Buton
        AddMember2 = findViewById(R.id.AddMember2);
        AddMember2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GrouopInformation.class);
                startActivity(intent);
            }
        });


    }



}