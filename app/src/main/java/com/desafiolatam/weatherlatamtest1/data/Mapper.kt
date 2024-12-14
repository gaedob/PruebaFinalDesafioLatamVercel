package com.desafiolatam.weatherlatamtest1.data

import com.desafiolatam.weatherlatamtest1.data.local.WeatherEntity
import com.desafiolatam.weatherlatamtest1.data.local.WeatherWrapper
import com.desafiolatam.weatherlatamtest1.model.WeatherDto

fun WeatherWrapper.toWeatherDto() = WeatherDto(


    id=  0,
 nombre = nombre,
 logo = logo
)

fun WeatherDto.toWeatherEntity() = WeatherEntity(
    id = 0,
 nombre = nombre,
 logo = logo


//    currentTemp = main.temp,
//    maxTemp = main.temp_max,
//    minTemp = main.temp_min,
//    pressure = main.pressure.toDouble(),
//    humidity = main.humidity.toDouble(),
//    windSpeed = wind.speed,
//    sunrise = sys.sunrise,
//    sunset = sys.sunset,
//    cityName = "${name}, ${sys.country}",
)

fun WeatherDto.toEntity(): WeatherEntity = WeatherEntity(
    id = id,
    nombre = nombre,
    logo = logo

)

fun entityToDto(entity: WeatherEntity): WeatherDto = WeatherDto(
    id = entity.id,
    nombre = entity.nombre,
    logo = entity.logo

)

fun entityListToDtoList(list: List<WeatherEntity>): List<WeatherDto> = list.map(::entityToDto)