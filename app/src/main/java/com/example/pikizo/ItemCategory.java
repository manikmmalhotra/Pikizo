package com.example.pikizo;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;


public class ItemCategory extends RecyclerView.Adapter<ItemCategory.CountryHolder> {

    Context context;
    Item response;

    public ItemCategory(Context context, Item response) {
        this.context = context;
        this.response = response;
    }

    @NonNull
    @Override
    public CountryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.particular_item, parent, false);
        return new CountryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryHolder holder, int position) {
        Picasso.get().load(response.getWallpapers().get(position).getUrlImage().toString()).resize(300,300).into(holder.image);
        holder.bindView(position);
    }

    @Override
    public int getItemCount() {
        return response.getWallpapers().size();
    }

    class CountryHolder extends RecyclerView.ViewHolder {

        ImageView image;


        public CountryHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imagee);

        }

        private void bindView(int position){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

    }
}