package com.example.allweather.domain.entities

import com.google.gson.annotations.SerializedName

data class Fact(
    @SerializedName("temp")
    val temp: Int,
    @SerializedName("feels_like")
    val feelsLike: Int,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("condition")
    val condition: String,
    @SerializedName("wind_speed")
    val windSpeed: Float,
    @SerializedName("wind_dir")
    val windDir: String,
    @SerializedName("pressure_mm")
    val pressureMm: Int,
    @SerializedName("pressure_pa")
    val pressurePa: Int,
    @SerializedName("humidity")
    val humidity: Int,
    @SerializedName("daytime")
    val daytime: String,
    @SerializedName("season")
    val season: String
)