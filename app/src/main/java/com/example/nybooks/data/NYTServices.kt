package com.example.nybooks.data

import retrofit2.Call
import retrofit2.http.GET

interface NYTServices{
    //Get list
    @GET("lists.json")
    fun listRepos(): Call<List<>>
}