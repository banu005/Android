package com.example.myapplication.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CoursViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(CoursUiState())
    val uiState: StateFlow<CoursUiState> = _uiState.asStateFlow()


    @Composable
    fun PageAccueil(
        modifier: Modifier = Modifier,
        coursViewModel: CoursViewModel = viewModel()
    ) {
        val coursUiState by coursViewModel.uiState.collectAsState()
        Text(coursUiState.nom)

//        Button(onClick = {}) {
//            Text("Consulter les cours")
//        }
    }


}