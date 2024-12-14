package com.desafiolatam.weatherlatamtest1.view.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ!\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/desafiolatam/weatherlatamtest1/view/viewmodel/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/desafiolatam/weatherlatamtest1/data/WeatherRepository;", "(Lcom/desafiolatam/weatherlatamtest1/data/WeatherRepository;)V", "getRemoteWeatherData", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/desafiolatam/weatherlatamtest1/view/viewmodel/UIState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeather", "", "Lcom/desafiolatam/weatherlatamtest1/model/WeatherDto;", "getWeatherDataById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final com.desafiolatam.weatherlatamtest1.data.WeatherRepository repository = null;
    
    public WeatherViewModel(@org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatamtest1.data.WeatherRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRemoteWeatherData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlow<? extends com.desafiolatam.weatherlatamtest1.view.viewmodel.UIState<?>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getWeather(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.desafiolatam.weatherlatamtest1.model.WeatherDto>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getWeatherDataById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlow<com.desafiolatam.weatherlatamtest1.model.WeatherDto>> continuation) {
        return null;
    }
}