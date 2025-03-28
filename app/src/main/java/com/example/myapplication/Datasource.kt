package com.example.myapplication

import com.example.myapplication.ui.CoursUiState

object Datasource {
    fun retourneListeCours(): List<CoursUiState> {
        return listOf(
            CoursUiState(1,"sport","natation"),
            CoursUiState(2,"sport","escalade")
        )
    }
}