package com.example.retrofitlearning

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
* creating a new file to get the Retrofit object

In this file, we will have a function that will return the Retrofit object.
*
* */

object RetrofitHelper {
    val baseUrl = "https://quotable.io/"

    fun getInstance(): Retrofit {
        // we need to add converter factory to
        // convert JSON object to Java object
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}