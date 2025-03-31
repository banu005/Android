package com.example.myapplication.ui

data class CoursUiState(
    val id: Int,
    val nom: String,
    val description: String
)

data class CoursListResponse(
    val results: List<CoursResult>
)
data class CoursResult(
    val id: Int,
    val nom: String,
    val description: String
//    val url: String
)



