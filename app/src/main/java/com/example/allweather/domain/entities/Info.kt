package com.example.allweather.domain.entities

import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("lat")
    val lat: Float,
    @SerializedName("lon")
    val lon: Float,
    @SerializedName("tzinfo")
    val tzinfo: Tzinfo,
    @SerializedName("url")
    val url: String
)

data class Tzinfo(
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("abbr")
    val abbr: String
)


