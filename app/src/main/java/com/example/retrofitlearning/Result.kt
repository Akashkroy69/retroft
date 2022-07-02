package com.example.retrofitlearning
/*In JSON response we have 2 JSON objects, So we will create 2 data class

QuoteList
Results*/
data class Result(

    val tags: List<String>,
    val _id: String,
    val author: String,
    val content: String,
    val authorSlug: String,
    val length: Int,
    val dateAdded: String,
    val dateModified: String
)
