package com.example.myapplication.service

import com.example.myapplication.ui.CoursListResponse
import com.example.myapplication.ui.CoursResult
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private const val BASE_URL =
    "http://coursapi.co/api/v2/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface CoursApiService {
    @GET("cours/?limit=10")
    suspend fun getCoursList(): List<CoursResult>
}

object CoursApi {
    val retrofitService : CoursApiService by lazy {
        retrofit.create(CoursApiService::class.java)
    }
}