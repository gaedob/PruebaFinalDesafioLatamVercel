package com.desafiolatam.weatherlatamtest1.view.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/desafiolatam/weatherlatamtest1/view/viewmodel/UIState;", "T", "", "()V", "Error", "Loading", "Success", "Lcom/desafiolatam/weatherlatamtest1/view/viewmodel/UIState$Error;", "Lcom/desafiolatam/weatherlatamtest1/view/viewmodel/UIState$Loading;", "Lcom/desafiolatam/weatherlatamtest1/view/viewmodel/UIState$Success;", "app_debug"})
public abstract class UIState<T extends java.lang.Object> {
    
    private UIState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/desafiolatam/weatherlatamtest1/view/viewmodel/UIState$Loading;", "T", "Lcom/desafiolatam/weatherlatamtest1/view/viewmodel/UIState;", "isLoading", "", "(Z)V", "()Z", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.desafiolatam.weatherlatamtest1.view.viewmodel.UIState<T> {
        private final boolean isLoading = false;
        
        public Loading(boolean isLoading) {
            super();
        }
        
        public final boolean isLoading() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/desafiolatam/weatherlatamtest1/view/viewmodel/UIState$Success;", "T", "Lcom/desafiolatam/weatherlatamtest1/view/viewmodel/UIState;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.desafiolatam.weatherlatamtest1.view.viewmodel.UIState<T> {
        private final T data = null;
        
        public Success(T data) {
            super();
        }
        
        public final T getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/desafiolatam/weatherlatamtest1/view/viewmodel/UIState$Error;", "T", "Lcom/desafiolatam/weatherlatamtest1/view/viewmodel/UIState;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "app_debug"})
    public static final class Error<T extends java.lang.Object> extends com.desafiolatam.weatherlatamtest1.view.viewmodel.UIState<T> {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String error = null;
        
        public Error(@org.jetbrains.annotations.NotNull
        java.lang.String error) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getError() {
            return null;
        }
    }
}