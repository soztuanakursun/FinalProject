package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GrouopInformation extends AppCompatActivity {
    TextView GroupTİtle,GroupDes,GroupMembers,GroupMemberName,
            GroupMemberName1,GroupMemberName2,GroupMemberName3;
    Button GroupInfoBack,GroupAddMember;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grouop_information);
        GroupInfoBlock();
    }

    public void GroupInfoBlock(){
        GroupInfoBack = findViewById(R.id.GroupInfoBack);
        GroupInfoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MyGrups.class);
                startActivity(intent);
            }
        });

        //Add new Group Member

        GroupAddMember = findViewById(R.id.GroupAddMember);
        GroupAddMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AddNewMember.class);
                startActivity(intent);
            }
        });
    }

    //Tüm Text Tanımlamaları
    public void GroupInfoText(){

    }


}