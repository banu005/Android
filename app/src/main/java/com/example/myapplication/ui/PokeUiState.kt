package com.example.myapplication.ui


data class PokeUiState(
    val name: String,
)
data class PokemonListResponse(
    val results: List<PokemonResult>
)
data class PokemonResult(
    val name: String,
    val url: String
)