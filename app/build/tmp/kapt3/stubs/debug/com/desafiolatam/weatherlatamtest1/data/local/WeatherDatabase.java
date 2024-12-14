package com.desafiolatam.weatherlatamtest1.data.local;

import java.lang.System;

@androidx.room.Database(version = 1, entities = {com.desafiolatam.weatherlatamtest1.data.local.WeatherEntity.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/desafiolatam/weatherlatamtest1/data/local/WeatherDatabase;", "Landroidx/room/RoomDatabase;", "()V", "weatherDao", "Lcom/desafiolatam/weatherlatamtest1/data/local/WeatherDao;", "Companion", "app_debug"})
public abstract class WeatherDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.desafiolatam.weatherlatamtest1.data.local.WeatherDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.desafiolatam.weatherlatamtest1.data.local.WeatherDatabase INSTANCE;
    
    public WeatherDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.desafiolatam.weatherlatamtest1.data.local.WeatherDao weatherDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/desafiolatam/weatherlatamtest1/data/local/WeatherDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/desafiolatam/weatherlatamtest1/data/local/WeatherDatabase;", "getDatabase", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.desafiolatam.weatherlatamtest1.data.local.WeatherDatabase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        kotlinx.coroutines.CoroutineScope scope) {
            return null;
        }
    }
}