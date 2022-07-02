package com.example.retrofitlearning

import retrofit2.Response
import retrofit2.http.GET
//Retrofit interface to add the endpoints of the URL (quotes in our case is the endpoint)
interface QuoteApi {
    @GET("/quotes")
    suspend fun getQuotes(): Response<QuoteList>
}