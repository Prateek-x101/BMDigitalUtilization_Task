package com.example.bmdigitaltask


import retrofit2.http.GET

interface apiService{
    @GET("/products")
    suspend fun getProducts() : List<itemProducts>
}


