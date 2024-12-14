package com.desafiolatam.weatherlatamtest1.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\'B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u001c\u0010 \u001a\u00020\u00162\n\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020\u0015H\u0016J\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0015H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006("}, d2 = {"Lcom/desafiolatam/weatherlatamtest1/view/adapter/WeatherAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/desafiolatam/weatherlatamtest1/view/adapter/WeatherAdapter$WeatherViewHolder;", "weatherList", "", "Lcom/desafiolatam/weatherlatamtest1/model/WeatherDto;", "inCelsius", "", "(Ljava/util/List;Z)V", "binding", "Lcom/desafiolatam/weatherlatamtest1/databinding/ItemWeatherBinding;", "getBinding", "()Lcom/desafiolatam/weatherlatamtest1/databinding/ItemWeatherBinding;", "setBinding", "(Lcom/desafiolatam/weatherlatamtest1/databinding/ItemWeatherBinding;)V", "getInCelsius", "()Z", "setInCelsius", "(Z)V", "onClick", "Lkotlin/Function1;", "", "", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "setOnClick", "(Lkotlin/jvm/functions/Function1;)V", "getWeatherList", "()Ljava/util/List;", "setWeatherList", "(Ljava/util/List;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "WeatherViewHolder", "app_debug"})
public final class WeatherAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.desafiolatam.weatherlatamtest1.view.adapter.WeatherAdapter.WeatherViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.desafiolatam.weatherlatamtest1.model.WeatherDto> weatherList;
    private boolean inCelsius;
    public com.desafiolatam.weatherlatamtest1.databinding.ItemWeatherBinding binding;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClick;
    
    public WeatherAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.desafiolatam.weatherlatamtest1.model.WeatherDto> weatherList, boolean inCelsius) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.desafiolatam.weatherlatamtest1.model.WeatherDto> getWeatherList() {
        return null;
    }
    
    public final void setWeatherList(@org.jetbrains.annotations.NotNull
    java.util.List<com.desafiolatam.weatherlatamtest1.model.WeatherDto> p0) {
    }
    
    public final boolean getInCelsius() {
        return false;
    }
    
    public final void setInCelsius(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.weatherlatamtest1.databinding.ItemWeatherBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatamtest1.databinding.ItemWeatherBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnClick() {
        return null;
    }
    
    public final void setOnClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.desafiolatam.weatherlatamtest1.view.adapter.WeatherAdapter.WeatherViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatamtest1.view.adapter.WeatherAdapter.WeatherViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/desafiolatam/weatherlatamtest1/view/adapter/WeatherAdapter$WeatherViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/desafiolatam/weatherlatamtest1/databinding/ItemWeatherBinding;", "(Lcom/desafiolatam/weatherlatamtest1/view/adapter/WeatherAdapter;Lcom/desafiolatam/weatherlatamtest1/databinding/ItemWeatherBinding;)V", "onBind", "", "weatherDto", "Lcom/desafiolatam/weatherlatamtest1/model/WeatherDto;", "app_debug"})
    public final class WeatherViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.desafiolatam.weatherlatamtest1.databinding.ItemWeatherBinding itemBinding = null;
        
        public WeatherViewHolder(@org.jetbrains.annotations.NotNull
        com.desafiolatam.weatherlatamtest1.databinding.ItemWeatherBinding itemBinding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.desafiolatam.weatherlatamtest1.model.WeatherDto weatherDto) {
        }
    }
}