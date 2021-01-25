package com.example.finalproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MyProjectAdapter extends FirebaseRecyclerAdapter<projectModels,MyProjectAdapter.myviewholder> {
    // Mert wrote these codes
    public MyProjectAdapter(@NonNull FirebaseRecyclerOptions<projectModels> options) {
        super(options);

    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull projectModels model) {
        holder.ProjectCat.setText(model.getPojectCat());
        holder.ProjectName.setText(model.getProjectName());
        holder.ProjectDesc.setText(model.getProjectDesc());
    }



    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singleprojectrow,parent,false);

        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder{

        TextView ProjectCat, ProjectName,ProjectDesc;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            ProjectCat = itemView.findViewById(R.id.ProjectCat);
            ProjectName = itemView.findViewById(R.id.ProjectName);
            ProjectDesc = itemView.findViewById(R.id.ProjectDesc);
        }
    }

}

