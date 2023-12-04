package com.example.planet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlanetAdapter extends RecyclerView.Adapter implements PlanetAdapter1 {
    Context context;
    ArrayList<Planet> restList;
    private FirebaseServices fbs;
    public PlanetAdapter(Context context, ArrayList<Planet> restList) {
        this.context = context;
        this.restList = restList;
        this.fbs = FirebaseServices.getInstance();
    }

    @NonNull
    @Override
    public PlanetAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View v= LayoutInflater.from(context).inflate(R.layout.planet_item,parent,false);
        return  new PlanetAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public void onBindViewHolder(@NonNull PlanetAdapter.MyViewHolder holder, int position) {
        Planet rest = restList.get(position);
        holder.tvName.setText(rest.getName());
        holder.tvSize.setText(rest.getSize());
        holder.tvOrbit.setText(rest.getOrbit());
    }

    @Override
    public int getItemCount(){
        return restList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvName, tvSize,tvOrbit;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvNameItem);
            tvSize=itemView.findViewById(R.id.tvSizeItem);
            tvOrbit=itemView.findViewById(R.id.tvOrbitItem);


        }
    }
}


