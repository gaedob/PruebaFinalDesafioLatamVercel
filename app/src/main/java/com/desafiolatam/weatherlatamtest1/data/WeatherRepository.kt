package com.desafiolatam.weatherlatamtest1.data

import com.desafiolatam.weatherlatamtest1.data.remote.ServiceResponse
import com.desafiolatam.weatherlatamtest1.model.WeatherDto
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {

    suspend fun getRemoteWeatherData(): Flow<ServiceResponse<WeatherDto?>>
    suspend fun getWeatherData(): Flow<List<WeatherDto>?>
    suspend fun getWeatherDataById(id: Int): Flow<WeatherDto?>
    suspend fun insertData(weatherDto: WeatherDto)
    suspend fun clearAll()
}