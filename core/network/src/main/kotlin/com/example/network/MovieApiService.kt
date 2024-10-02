package com.example.network

import retrofit2.http.GET

interface MovieApiService {
    @GET("movie?sort_by=popularity.desc&api_key=fa3e844ce31744388e07fa47c7c5d8c3")
    suspend fun getPopularMovies(): MovieResponseDto
}