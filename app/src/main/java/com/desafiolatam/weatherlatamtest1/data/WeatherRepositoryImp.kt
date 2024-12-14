package com.desafiolatam.weatherlatamtest1.data

import com.desafiolatam.weatherlatamtest1.data.local.WeatherDao
import com.desafiolatam.weatherlatamtest1.data.remote.OpenWeatherService
import com.desafiolatam.weatherlatamtest1.data.remote.RetrofitClient
import com.desafiolatam.weatherlatamtest1.data.remote.ServiceResponse
import com.desafiolatam.weatherlatamtest1.model.WeatherDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map

class WeatherRepositoryImp(
    private val weatherDao: WeatherDao
) : WeatherRepository {

    override suspend fun getRemoteWeatherData(): Flow<ServiceResponse<WeatherDto?>> {

        val data: MutableStateFlow<ServiceResponse<WeatherDto?>> =
            MutableStateFlow(ServiceResponse.Loading(true))

        val service = RetrofitClient.getInstance(OPEN_WEATHER_ENDPOINT).create(OpenWeatherService::class.java)
        val response = service.getWeatherData(

        )
        when {
            response.isSuccessful -> {
                //clearAll()
                response.body()?.toWeatherDto()?.let {
                    data.value = ServiceResponse.Success(it)
                 //   insertData(it)
                }
            }

            else -> {
                if (response.code() == 401) data.value = ServiceResponse.Error(Unauthorized)
                if (response.code() == 404) data.value = ServiceResponse.Error(NotFound)
                if (response.code() == 500) data.value = ServiceResponse.Error(InternalServerError)
                if (response.code() == 503) data.value = ServiceResponse.Error(ServiceUnavailable)
            }
        }
        return flowOf(data.value)
    }

    override suspend fun getWeatherData(): Flow<List<WeatherDto>?> =
        weatherDao.getWeatherData().map { entity -> entity?.let { entityListToDtoList(it) } }

    override suspend fun getWeatherDataById(id: Int): Flow<WeatherDto?> =
        weatherDao.getWeatherDataById(id).map { entity ->
            entity?.let { entityToDto(it) }
        }

    override suspend fun insertData(weatherDto: WeatherDto) =
        weatherDao.insertData(weatherDto.toEntity())

    override suspend fun clearAll() = weatherDao.clearAll()
}