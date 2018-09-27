package com.example.iaralopes.empresaskotlin.Service

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    private val url = "http://54.94.179.135:8090/api/v1/"

    private fun getRetrofitInstance() : Retrofit {
        return Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(OkHttpClient.Builder().addInterceptor(RequestInterceptor()).build())
                .build()
    }

    public fun getAPIService() : APIServices {
        return getRetrofitInstance().create(APIServices::class.java)
    }
}