package com.desafiolatam.weatherlatamtest1.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.desafiolatam.weatherlatamtest1.data.repository.FakeWeatherRepository
import com.desafiolatam.weatherlatamtest1.view.viewmodel.WeatherViewModel
import kotlinx.coroutines.flow.collectLatest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class WeatherViewModelTest {

    @get: Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: WeatherViewModel

    @Before
    fun setup() {
        viewModel = WeatherViewModel(FakeWeatherRepository())
    }

    @Test
    suspend fun insertWeatherDto() {
        viewModel.getWeather().collectLatest {

        }
    }
}