package com.example.network;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/example/network/MovieDto;", "", "title", "", "overview", "posterPath", "releaseDate", "voteAverage", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getOverview", "()Ljava/lang/String;", "getPosterPath", "getReleaseDate", "getTitle", "getVoteAverage", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "network_debug"})
public final class MovieDto {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String posterPath = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String releaseDate = null;
    private final double voteAverage = 0.0;
    
    public MovieDto(@com.squareup.moshi.Json(name = "original_title")
    @org.jetbrains.annotations.NotNull
    java.lang.String title, @com.squareup.moshi.Json(name = "overview")
    @org.jetbrains.annotations.NotNull
    java.lang.String overview, @com.squareup.moshi.Json(name = "poster_path")
    @org.jetbrains.annotations.NotNull
    java.lang.String posterPath, @com.squareup.moshi.Json(name = "release_date")
    @org.jetbrains.annotations.NotNull
    java.lang.String releaseDate, @com.squareup.moshi.Json(name = "vote_average")
    double voteAverage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    public final double getVoteAverage() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.network.MovieDto copy(@com.squareup.moshi.Json(name = "original_title")
    @org.jetbrains.annotations.NotNull
    java.lang.String title, @com.squareup.moshi.Json(name = "overview")
    @org.jetbrains.annotations.NotNull
    java.lang.String overview, @com.squareup.moshi.Json(name = "poster_path")
    @org.jetbrains.annotations.NotNull
    java.lang.String posterPath, @com.squareup.moshi.Json(name = "release_date")
    @org.jetbrains.annotations.NotNull
    java.lang.String releaseDate, @com.squareup.moshi.Json(name = "vote_average")
    double voteAverage) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}