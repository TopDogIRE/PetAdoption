package com.example.petadoption;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petadoption.models.AdoptionsModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdotionsRecyclerViewAdapter extends RecyclerView.Adapter <AdotionsCardViewHolder> {
    //private List<petsData> petsList;
    private List<AdoptionsModel> petsList;
    Context context;

    AdotionsRecyclerViewAdapter(List<AdoptionsModel> peteslsit) {
        // this.petsList=matchesList;
        //this.context=context;
        this.petsList = peteslsit;
    }

    @NonNull
    @Override
    public AdotionsCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adotion_card, parent, false);
       // return new AdotionsCardViewHolder(layoutView);
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.adotion_card, parent, false);
        AdotionsCardViewHolder viewHolder = new AdotionsCardViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdotionsCardViewHolder holder, int position) {
        // petsData matcheData = petsList.get(position);
        if (petsList != null) {
            AdoptionsModel pet = this.petsList.get(position);
            holder.petName.setText(pet.name);
            Picasso.get().load(pet.imageURL).into(holder.petImg);
            //holder.petImg.setImageResource(matcheData.getMatcheImg());
        }
    }
        @Override
        public int getItemCount () {
            return petsList.size();
        }
        public void setpets (List < AdoptionsModel > pet) {
            this.petsList = pet;
        }

}
