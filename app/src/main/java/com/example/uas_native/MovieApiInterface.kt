package com.example.uas_native

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=65cfbffed707ec93d4eb9fd09cab5a29")
    fun getMovieList(): Call<MovieResponse>
}