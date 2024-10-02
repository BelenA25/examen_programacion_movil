-if class com.example.network.MovieDto
-keepnames class com.example.network.MovieDto
-if class com.example.network.MovieDto
-keep class com.example.network.MovieDtoJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
