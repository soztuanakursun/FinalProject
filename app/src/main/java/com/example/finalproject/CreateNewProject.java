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

public class CreateNewProject extends AppCompatActivity {
    // Tuana wrote codes here!
    TextView createprojectText;
    EditText projectName,projectCat,projectDesc;
    Button createProject;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseAuth auth;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_project);
        CreateProjectDes();
        CreateProjectClick();
    }


    public void CreateProjectDes(){
        createprojectText= findViewById(R.id.createprojectText);
        projectName = findViewById(R.id.projectName);
        projectCat = findViewById(R.id.projectCat);
        projectDesc = findViewById(R.id.projectDesc);
    }
    public void CreateProjectClick(){
        createProject = findViewById(R.id.createProject);
        createProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth =FirebaseAuth.getInstance();
                user = auth.getCurrentUser();
        rootNode = FirebaseDatabase.getInstance();
                String ProjectName = projectName.getText().toString();
                String PojectCat = projectCat.getText().toString();
                String ProjectDesc = projectDesc.getText().toString();
        reference= rootNode.getReference().child("Kullanicilar").child(user.getUid()).child("Projeler");



       // Projects projects = new Projects(ProjectName,PojectCat,ProjectDesc);
                Map map =new HashMap();
                map.put("Projekategori",PojectCat);
                map.put("Projeisim",ProjectName);

                map.put("projeaciklama",ProjectDesc);



                reference.child(PojectCat).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            //Proje Ekleme İşlemi Başarılı ise
                            Toast.makeText(getApplicationContext(),"Project creation is successful",Toast.LENGTH_LONG).show();
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