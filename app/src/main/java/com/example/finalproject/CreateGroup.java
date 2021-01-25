package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class CreateGroup extends AppCompatActivity {
    TextView creategroupText;
    EditText grupismi,GroupDesription;
    Button createGroup;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseAuth auth;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //   // Tuana   wrote these codes, Create Group
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_group);
        CreateGroupDes();
        CreateProjectClick();
    }

    public void CreateGroupDes(){
        creategroupText = findViewById(R.id.creategroupText);
        grupismi = findViewById(R.id.grupismi);
        GroupDesription = findViewById(R.id.GroupDesription);

    }
    public void CreateProjectClick(){
        createGroup = findViewById(R.id.createGroup);
        createGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth = FirebaseAuth.getInstance();
                user = auth.getCurrentUser();
                rootNode = FirebaseDatabase.getInstance();
                String grup = grupismi.getText().toString();
                String GroupDescription = GroupDesription.getText().toString();

                reference= rootNode.getReference().child("Kullanicilar").child(user.getUid()).child("MyGroups");



                // Projects projects = new Projects(ProjectName,PojectCat,ProjectDesc);
                Map map =new HashMap();
                map.put("GroupBaslik",grup);
                map.put("GroupAcik",GroupDescription);




                reference.child(grup).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            //Proje Ekleme İşlemi Başarılı ise
                            Toast.makeText(getApplicationContext(),"Group creation is successful",Toast.LENGTH_LONG).show();
                            Intent i = new Intent(getApplicationContext(),ProfilePage.class);
                            startActivity(i);
                        }else{
                            //Proje Ekleme İşlemi Başarısız ise
                            Toast.makeText(getApplicationContext(),"Opps! Bir Problem Yaşandı",Toast.LENGTH_LONG).show();
                        }
                    }
                });





            }
        });
    }




}