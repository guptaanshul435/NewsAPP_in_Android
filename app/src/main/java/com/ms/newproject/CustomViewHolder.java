package com.ms.newproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder{
    TextView text_title,text_source;
    ImageView img_headLines;
    CardView cardView;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        text_title=itemView.findViewById(R.id.text_title);
        text_source=itemView.findViewById(R.id.text_source);
        img_headLines=itemView.findViewById(R.id.image_headlines);
        cardView=itemView.findViewById(R.id.main_container);
    }
}

