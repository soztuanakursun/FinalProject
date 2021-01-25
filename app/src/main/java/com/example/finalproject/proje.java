package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class proje extends AppCompatActivity {

    RecyclerView proje;
    FirebaseAuth auth;
    FirebaseUser user;
    MyAdapterr  Adapter;

//Tuana wrote these codes


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proje);
        proje = (RecyclerView) findViewById(R.id.proje);
        proje.setLayoutManager(new LinearLayoutManager(this));
        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();





        FirebaseRecyclerOptions<modell> options =
                new FirebaseRecyclerOptions.Builder<modell>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Kullanicilar").child(user.getUid()).child("Projeler"), modell.class)
                        .build();


        Adapter = new MyAdapterr(options);
        proje.setAdapter(Adapter);


    }


    @Override
    protected void onStart() {
        super.onStart();
        Adapter.startListening();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Adapter.stopListening();
    }




}