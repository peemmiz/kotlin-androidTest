package com.example.myapplicationkotlingetapi

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface INetworkAPI {
    @GET("recipes.json")
    fun getAllData(): Observable<List<Food>>
}