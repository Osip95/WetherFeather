package com.example.weatherfetcher.feature.weather_screen.data.model

import com.google.gson.annotations.SerializedName

data class WeatherMain(
    @SerializedName("temp")
    val temperature:String
)
