package com.example.myapplication

data class MovieModel(
    val id: Int,
    val original_title: String,
    val overview: String,
    val poster_path: String?,
    val popularity: Double,
    val releaseDate: String
)
