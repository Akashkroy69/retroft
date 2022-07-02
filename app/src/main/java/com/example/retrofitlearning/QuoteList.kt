package com.example.retrofitlearning

/*In JSON response we have 2 JSON objects, So we will create 2 data class

QuoteList
Results*/
data class QuoteList(

    val count: Int,
    val totalCount: Int,
    val page: Int,
    val totalPages: Int,
    val lastItemIndex: Int,
    val results: List<Result>
)
