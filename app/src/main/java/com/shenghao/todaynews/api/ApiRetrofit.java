package com.shenghao.todaynews.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class ApiRetrofit {

    private static ApiRetrofit mApiRetrofit;
    private final Retrofit mRetrofit;
    private OkHttpClient mClient;
    private ApiService mApiService;
}
