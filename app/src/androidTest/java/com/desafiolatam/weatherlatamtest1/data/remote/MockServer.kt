package com.desafiolatam.weatherlatamtest1.data.remote

import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.TestCase.assertEquals
import mockwebserver3.MockResponse
import mockwebserver3.MockWebServer
import okhttp3.OkHttpClient
import okhttp3.Request
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.net.HttpURLConnection
import java.util.concurrent.TimeUnit

@RunWith(AndroidJUnit4::class)
class MockServer {

    private lateinit var mockWebServer: MockWebServer
    private lateinit var httpClient: OkHttpClient

    @Before
    fun setUp() {
        mockWebServer = MockWebServer()
        mockWebServer.start()
        httpClient = OkHttpClient.Builder().connectTimeout(500, TimeUnit.MILLISECONDS)
            .readTimeout(500, TimeUnit.MILLISECONDS).build()
    }

    @Test
    fun testHttpCall() {
        mockWebServer = MockWebServer()
        mockWebServer.start()
        httpClient = OkHttpClient.Builder()
            .connectTimeout(500, TimeUnit.MILLISECONDS)
            .readTimeout(500, TimeUnit.MILLISECONDS)
            .build()

        val responseCode = 200
        val mockResponse = MockResponse().setResponseCode(HttpURLConnection.HTTP_OK)
        mockWebServer.enqueue(mockResponse)

        val request = Request.Builder()
            .get()
            .build()

        val response = httpClient.newCall(request).execute()

        assertEquals(responseCode, response.code)
    }

    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }
}