package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    List<Arenas> arenasList;

    public RecyclerViewAdapter(List<Arenas> arenasList) {
        this.arenasList = arenasList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.id.setText(arenasList.get(position).getId());
        holder.name.setText(arenasList.get(position).getName());
        holder.login.setText(arenasList.get(position).getLogin());
        holder.company.setText(arenasList.get(position).getCompany());
        holder.location.setText(arenasList.get(position).getLocation());
        holder.size.setText(String.valueOf(arenasList.get(position).getSize()));
    }

    @Override
    public int getItemCount() {
        return arenasList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView id;
        private final TextView name;
        private final TextView login;
        private final TextView company;
        private final TextView location;
        private final TextView size;


        public MyViewHolder(@NonNull View view) {
            super(view);
            id = view.findViewById(R.id.id);
            name = view.findViewById(R.id.name);
            login = view.findViewById(R.id.login);
            company = view.findViewById(R.id.company);
            location = view.findViewById(R.id.location);
            size = view.findViewById(R.id.size);
        }
    }
}
