package com.example.myapplication.ui

//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.myapplication.service.PokeApi
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.StateFlow
//import kotlinx.coroutines.launch
//
//class PokeViewModel : ViewModel() {
//    private val _pokeUi = MutableStateFlow<List<PokeUiState>>(emptyList())
//    val pokeUi: StateFlow<List<PokeUiState>> = _pokeUi
//    init {
//        getPokeNames()
//    }
//    fun getPokeNames() {
//        viewModelScope.launch {
//            val response = PokeApi.retrofitService.getPokemonList()
//            _pokeUi.value = response.results.map { pokemon ->
//                PokeUiState( name = pokemon.name)
//            }
//        }
//    }

//}