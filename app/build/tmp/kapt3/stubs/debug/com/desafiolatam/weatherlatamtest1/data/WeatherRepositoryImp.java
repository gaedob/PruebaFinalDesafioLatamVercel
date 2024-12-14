package com.desafiolatam.weatherlatamtest1.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/desafiolatam/weatherlatamtest1/data/WeatherRepositoryImp;", "Lcom/desafiolatam/weatherlatamtest1/data/WeatherRepository;", "weatherDao", "Lcom/desafiolatam/weatherlatamtest1/data/local/WeatherDao;", "(Lcom/desafiolatam/weatherlatamtest1/data/local/WeatherDao;)V", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoteWeatherData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/desafiolatam/weatherlatamtest1/data/remote/ServiceResponse;", "Lcom/desafiolatam/weatherlatamtest1/model/WeatherDto;", "getWeatherData", "", "getWeatherDataById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertData", "weatherDto", "(Lcom/desafiolatam/weatherlatamtest1/model/WeatherDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherRepositoryImp implements com.desafiolatam.weatherlatamtest1.data.WeatherRepository {
    private final com.desafiolatam.weatherlatamtest1.data.local.WeatherDao weatherDao = null;
    
    public WeatherRepositoryImp(@org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatamtest1.data.local.WeatherDao weatherDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getRemoteWeatherData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.desafiolatam.weatherlatamtest1.data.remote.ServiceResponse<com.desafiolatam.weatherlatamtest1.model.WeatherDto>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getWeatherData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.desafiolatam.weatherlatamtest1.model.WeatherDto>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getWeatherDataById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.desafiolatam.weatherlatamtest1.model.WeatherDto>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertData(@org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatamtest1.model.WeatherDto weatherDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object clearAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}