package com.example.pikizo;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("get.php?auth=661fa6980cda81e53b8f2633d535e4ac&method=category_list")
    Call<Category> getCategory();

    @GET("get.php?auth=661fa6980cda81e53b8f2633d535e4ac&method=category")
    Call<Item> getItem(@Query("id") String userid);

}