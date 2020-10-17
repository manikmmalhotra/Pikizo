package com.example.pikizo;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;


public class AdapterCategory extends RecyclerView.Adapter<AdapterCategory.CountryHolder> {

    Context context;
    Category response;

    public AdapterCategory(Context context, Category response) {
        this.context = context;
        this.response = response;
    }

    @NonNull
    @Override
    public CountryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.particular_category, parent, false);
        return new CountryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryHolder holder, int position) {
        holder.CategoryName.setText(response.getCategories().get(position).getName().toString());
        holder.Id.setText(response.getCategories().get(position).getId().toString());
        holder.bindView(position);
    }

    @Override
    public int getItemCount() {
        return response.getCategories().size();
    }

    class CountryHolder extends RecyclerView.ViewHolder {

        TextView CategoryName,Id;

        public CountryHolder(View itemView) {
            super(itemView);

            CategoryName = itemView.findViewById(R.id.categoryname);
            Id = itemView.findViewById(R.id.id);

        }

        private void bindView(int position){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("manik",CategoryName.getText().toString());
                    Intent intent =new Intent(context,ClickedCategory.class)
                            .putExtra("Id",Id.getText().toString());
                    intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }
            });
        }

    }
}