package com.ms.newproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ms.newproject.Models.NewsHeadLine;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private Context context;
    private List<NewsHeadLine> headLines;
    private SelectListener listener;

    public CustomAdapter(Context context, List<NewsHeadLine> headLines,SelectListener listener) {
        this.context = context;
        this.headLines = headLines;
        this.listener=listener;
    }




    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.headline_list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, @SuppressLint("RecyclerView") int position) {
     holder.text_title.setText(headLines.get(position).getTitle());
     holder.text_source.setText(headLines.get(position).getSource().getName());
     if (headLines.get(position).getUrlToImage()!=null){
         Picasso.get().load(headLines.get(position).getUrlToImage()).into(holder.img_headLines);
     }
     holder.cardView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             listener.onNewsClicked(headLines.get(position));
         }
     });
    }

    @Override
    public int getItemCount() {
        return headLines.size();
    }
}
