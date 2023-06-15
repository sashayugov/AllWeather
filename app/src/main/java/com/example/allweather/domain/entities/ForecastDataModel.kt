package com.example.allweather.domain.entities

import com.google.gson.annotations.SerializedName

data class ForecastDataModel(
    @SerializedName("now")
    val now: Int,
    @SerializedName("now_dt")
    val nowDt: String,
    @SerializedName("info")
    val info: Info,
    @SerializedName("fact")
    val fact: Fact,
    @SerializedName("forecasts")
    val forecasts: List<Forecast>
)


