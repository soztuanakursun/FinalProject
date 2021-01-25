package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class deneme extends AppCompatActivity {

    RecyclerView recview;
    FirebaseAuth auth;
    FirebaseUser user;
    MyAdapter  adapter;
    //   // MErt   wrote these codes, in here  here we pulled the information about the group
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deneme);

        recview = (RecyclerView) findViewById(R.id.rec);
        recview.setLayoutManager(new LinearLayoutManager(this));
        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();

        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Kullanicilar").child(user.getUid()).child("MyGroups"), model.class)
                        .build();

        adapter = new MyAdapter(options);
        recview.setAdapter(adapter);

    }


    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }


    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }


}