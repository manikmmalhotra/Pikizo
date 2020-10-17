package com.example.pikizo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ClickedCategory extends AppCompatActivity {

    ApiClient apiClient;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicked_category);

        Intent intent = getIntent();
        String message = intent.getStringExtra("Id");

        Log.d("manikk",message);

        apiClient=new ApiClient();
        recyclerView=findViewById(R.id.particularItemList);


        Call<Item> call = apiClient.getApiinterface().getItem(message);
        call.enqueue(new Callback<Item>() {
            @Override
            public void onResponse(Call<Item> call, Response<Item> response) {
                ItemCategory countryAdapter=new ItemCategory(getApplicationContext(),response.body());
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(countryAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
            }

            @Override
            public void onFailure(Call<Item> call, Throwable t) {

            }
        });
    }
}