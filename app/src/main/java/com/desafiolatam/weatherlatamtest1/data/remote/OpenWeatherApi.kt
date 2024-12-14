package com.desafiolatam.weatherlatamtest1.data.remote

import com.desafiolatam.weatherlatamtest1.data.local.WeatherWrapper
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface OpenWeatherService {
    @GET("figuras")
    suspend fun getWeatherData(
    ): Response<WeatherWrapper?>
//    @GET("weather")
//    suspend fun getWeatherData(
//        @Query("lat") lat: Double,
//        @Query("lon") lon: Double,
//        @Query("appid") appid: String,
//        @Query("units") unit: String = "metric"
//    ): Response<WeatherWrapper?>
}