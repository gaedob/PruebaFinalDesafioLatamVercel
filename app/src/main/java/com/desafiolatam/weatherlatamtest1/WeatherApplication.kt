package com.desafiolatam.weatherlatamtest1

import android.app.Application
import com.desafiolatam.weatherlatamtest1.data.WeatherRepositoryImp
import com.desafiolatam.weatherlatamtest1.data.local.WeatherDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WeatherApplication : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { WeatherDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { WeatherRepositoryImp(database.weatherDao()) }
}