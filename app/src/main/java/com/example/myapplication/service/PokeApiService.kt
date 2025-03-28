package com.example.myapplication.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

//private const val BASE_URL =
//    "https://pokeapi.co/api/v2/"
//private val retrofit = Retrofit.Builder()
//    .addConverterFactory(GsonConverterFactory.create())
//    .baseUrl(BASE_URL)
//    .build()
//interface PokeApiService {
//    @GET("pokemon/?limit=10")
//    suspend fun getPokemonList(): PokemonListResponse
//}
//
//object PokeApi {
//    val retrofitService : PokeApiService by lazy {
//        retrofit.create(PokeApiService::class.java)
//    }
//}