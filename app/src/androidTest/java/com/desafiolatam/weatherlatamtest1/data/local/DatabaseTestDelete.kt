package com.desafiolatam.weatherlatamtest1.data.local

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.desafiolatam.weatherlatamtest1.data.listWeatherDtoDummyData
import com.desafiolatam.weatherlatamtest1.data.toEntity
import com.desafiolatam.weatherlatamtest1.data.weatherDtoDummyData
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.withContext
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class DatabaseTestDelete {

    private lateinit var db: WeatherDatabase
    private lateinit var weatherDao: WeatherDao

    // dummy data
    private val weather = weatherDtoDummyData()

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, WeatherDatabase::class.java
        ).build()

        weatherDao = db.weatherDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        Dispatchers.resetMain()
        db.close()
    }

    @Test
    fun addAndDeleteAll() = runTest {
        withContext(Dispatchers.IO) {
            weatherDao.insertData(weather.toEntity())
            // Esta parte no es necesaria, es solamente para validar que el datos que se inserto, esta ahi
            val countBefore = weatherDao.getWeatherData().first()?.count()
            assertEquals(countBefore, 1)
            //
            weatherDao.clearAll()
            val countAfter = weatherDao.getWeatherData().first()?.count()
            assertEquals(countAfter, 0)
        }
    }

    @Test
    fun addAndDeleteById() = runTest {

        listWeatherDtoDummyData().forEach {
            weatherDao.insertData(it.toEntity())
        }

        val countBefore = weatherDao.getWeatherData().first()?.count()
        assertEquals(countBefore, 3)

        weatherDao.deleteById(100)
        val countAfter = weatherDao.getWeatherData().first()?.count()
        assertEquals(countAfter, 2)
    }
}
