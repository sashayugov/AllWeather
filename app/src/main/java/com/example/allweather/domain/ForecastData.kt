package com.example.allweather.domain

sealed class ForecastData {

    data class Success(val forecastData: ForecastData) : ForecastData()

    data class Error(val error: Throwable) : ForecastData()

    data class Loading(val progress: Int?) : ForecastData()
}
