package com.example.nybooks.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookDetailsResponse (
    //Anotações desnecessárias, pois o nome dos atributos são iguais aos da resposta

    @Json(name = "title")
    val title: String,
    @Json(name = "author")
    val author: String,
    @Json(name = "description")
    val description: String
)