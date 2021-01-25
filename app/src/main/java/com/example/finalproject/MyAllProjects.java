package com.example.finalproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class MyAllProjects extends AppCompatActivity {


//Tuana wrote these codes
    RecyclerView rec;
    FirebaseAuth auth;
    FirebaseUser user;
    MyProjectAdapter adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_all_projects);



        rec = (RecyclerView) findViewById(R.id.rec);
        rec.setLayoutManager(new LinearLayoutManager(this));
        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();

        FirebaseRecyclerOptions<projectModels> options =
                new FirebaseRecyclerOptions.Builder<projectModels>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Kullanicilar").child(user.getUid()).child("MyProjects"), projectModels.class)
                        .build();

        adapter1 = new MyProjectAdapter(options);
        rec.setAdapter(adapter1);





    }



















    }