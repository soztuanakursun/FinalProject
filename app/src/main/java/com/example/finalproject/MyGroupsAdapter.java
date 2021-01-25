package com.example.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyGroupsAdapter extends RecyclerView.Adapter<MyGroupsAdapter.MyViewHolder>{
    Context contex;
    ArrayList<MyGroupsModal> MyGroupsModal; // profiles deeğri

    public  MyGroupsAdapter(Context c, ArrayList<MyGroupsModal> g){
        contex= c;
        MyGroupsModal = g;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(contex).inflate(R.layout.group_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.group_name_item.setText(MyGroupsModal.get(position).getGroupName());
            holder.group_des_item.setText(MyGroupsModal.get(position).getGroupDes());

    }

    @Override
    public int getItemCount() {
        return MyGroupsModal.size();
    }
//Myviewholder == gropsholder


     class  MyViewHolder extends RecyclerView.ViewHolder{
        TextView group_name_item,group_des_item;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            group_name_item= itemView.findViewById(R.id.group_name_item);
            group_des_item = itemView.findViewById(R.id.group_des_item);
        }


        //public static com.example.finalproject.MyGroupsModal get(int position) {
// burada bunlar olmamalı
           // return MyViewHolder.get(position);
       // }

    }

}
