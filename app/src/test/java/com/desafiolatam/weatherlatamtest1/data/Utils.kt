package com.desafiolatam.weatherlatamtest1.data

import com.desafiolatam.weatherlatamtest1.data.local.WeatherEntity
import com.desafiolatam.weatherlatamtest1.model.WeatherDto

fun weatherDtoDummyData(): WeatherDto = WeatherDto(
    id = 100,
    currentTemp = 21.0,
    maxTemp = 10.0,
    minTemp = -10.0,
    pressure = 100.0,
    humidity = 10.0,
    windSpeed = 23.7,
    sunrise = 1688039234,
    sunset = 1688039234,
    cityName = "Santiago",
)

fun listWeatherDtoDummyData(): List<WeatherDto> = listOf(
    WeatherDto(
        id = 100,
        currentTemp = 21.0,
        maxTemp = 10.0,
        minTemp = -10.0,
        pressure = 100.0,
        humidity = 10.0,
        windSpeed = 23.7,
        sunrise = 1688039234,
        sunset = 1688039234,
        cityName = "Santiago",
    ), WeatherDto(
        id = 101,
        currentTemp = 21.0,
        maxTemp = 10.0,
        minTemp = -10.0,
        pressure = 100.0,
        humidity = 10.0,
        windSpeed = 23.7,
        sunrise = 1688039234,
        sunset = 1688039234,
        cityName = "Valdivia",
    ), WeatherDto(
        id = 102,
        currentTemp = 21.0,
        maxTemp = 10.0,
        minTemp = -10.0,
        pressure = 100.0,
        humidity = 10.0,
        windSpeed = 23.7,
        sunrise = 1688039234,
        sunset = 1688039234,
        cityName = "Arica",
    )
)

fun weatherEntityDummyData(): WeatherEntity = WeatherEntity(
    id = 0,
    currentTemp = 0.0,
    maxTemp = 0.0,
    minTemp = 0.0,
    pressure = 0.0,
    humidity = 0.0,
    windSpeed = 0.0,
    sunrise = 1688039234,
    sunset = 1688039234,
    cityName = "",
)