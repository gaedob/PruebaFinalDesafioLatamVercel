package com.desafiolatam.weatherlatamtest1.data.repository

import com.desafiolatam.weatherlatamtest1.data.WeatherRepository
import com.desafiolatam.weatherlatamtest1.data.remote.ServiceResponse
import com.desafiolatam.weatherlatamtest1.model.WeatherDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class FakeWeatherRepository : WeatherRepository {

    private val weatherList = mutableListOf<WeatherDto>()

    override suspend fun getRemoteWeatherData(): Flow<ServiceResponse<WeatherDto?>> {
        return flowOf()
    }

    override suspend fun getWeatherData(): Flow<List<WeatherDto>?> {
        return flowOf(weatherList)
    }

    override suspend fun getWeatherDataById(id: Int): Flow<WeatherDto?> {
        return flowOf()
    }

    override suspend fun insertData(weatherDto: WeatherDto) {
        weatherList.add(weatherDto)
    }

    override suspend fun clearAll() {
        weatherList.clear()
    }
}