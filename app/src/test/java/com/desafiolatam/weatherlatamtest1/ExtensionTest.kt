package com.desafiolatam.weatherlatamtest1

import com.desafiolatam.weatherlatamtest1.extension.toCelsius
import com.desafiolatam.weatherlatamtest1.extension.toFahrenheit
import junit.framework.TestCase.assertEquals
import org.junit.Test

class ExtensionTest {

    //(°C × 9/5) + 32 = °F

    @Test
    fun toFahrenheit() {
        val fahrenheit = 10.0.toFahrenheit()
        assertEquals(fahrenheit, 50.0)
    }

    @Test
    fun toCelsius() {
        val celsius = 32.0.toCelsius()
        assertEquals(celsius, 0.0)
    }

    @Test
    fun negativeCelsiusToFahrenheit() {
        val celsius = (-10.0).toFahrenheit()
        assertEquals(celsius, 14.0)
    }

    @Test
    fun negativeCelsiusToNegativeFahrenheit() {
        val celsius = (-50.0).toFahrenheit()
        assertEquals(celsius, -58.0)
    }
}