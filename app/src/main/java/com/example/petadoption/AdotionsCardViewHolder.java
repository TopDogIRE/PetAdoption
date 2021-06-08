package com.example.petadoption;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdotionsCardViewHolder extends RecyclerView.ViewHolder {
    public TextView petName;
    public ImageView petImg;

    public AdotionsCardViewHolder(@NonNull View itemView) {
        super(itemView);
        petName=itemView.findViewById(R.id.petNameTextView);
        petImg=itemView.findViewById(R.id.petImgView);

    }
}
