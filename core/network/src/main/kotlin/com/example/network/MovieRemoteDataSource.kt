package com.example.network

class MovieRemoteDataSource(
    val retrofitService: RetrofitBuilder
) {
    suspend fun getPopularMovies(): MovieResponseDto {
        return retrofitService.apiService.getPopularMovies()
    }
}