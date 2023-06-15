package com.example.allweather.domain.entities

import com.google.gson.annotations.SerializedName

data class Forecast(
    @SerializedName("date")
    val date: String,
    @SerializedName("date_ts")
    val dateTs: Int,
    @SerializedName("sunrise")
    val sunrise: String,
    @SerializedName("sunset")
    val sunset: String,
    @SerializedName("hours")
    val hours: List<Hour>,
    @SerializedName("parts")
    val parts: Parts
)

data class Hour(
    @SerializedName("hour")
    val hour: String,
    @SerializedName("hour_ts")
    val hourTs: Int,
    @SerializedName("temp")
    val temp: Int,
    @SerializedName("icon")
    val icon: String
)

data class Parts(
    @SerializedName("day_short")
    val dayShort: DayShort,
    @SerializedName("night_short")
    val nightShort: NightShort
)

data class DayShort(
    @SerializedName("temp")
    val temp: Int,
    @SerializedName("icon")
    val icon: String
)

data class NightShort(
    @SerializedName("temp_min")
    val tempMin: Int
)
