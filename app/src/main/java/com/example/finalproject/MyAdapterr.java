package com.example.finalproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MyAdapterr extends FirebaseRecyclerAdapter<modell,MyAdapterr.Myviewholder> {
    // Created adapter for connect to datas in Project database

    // Mert  wrote these codes

    public MyAdapterr(@NonNull FirebaseRecyclerOptions<modell> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull Myviewholder holder, int position, @NonNull modell model) {
            holder.projeaciklama.setText(model.getProjeaciklama());
            holder.Projeisim.setText(model.getProjeisim());
            holder.Projekategori.setText(model.getProjekategori());
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_singleprojectroww,parent,false);

        return new Myviewholder(view);
    }

    class Myviewholder extends RecyclerView.ViewHolder{
        //Mert wrote these codes
        TextView Projekategori,Projeisim,projeaciklama;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            Projekategori = (TextView) itemView.findViewById(R.id.Projekategori);
            Projeisim = (TextView) itemView.findViewById(R.id.Projeisim);
            projeaciklama = (TextView) itemView.findViewById(R.id.projeaciklama);

        }
    }


}
