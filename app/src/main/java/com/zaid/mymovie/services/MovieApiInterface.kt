package com.zaid.mymovie.services

import com.zaid.mymovie.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=05a05781a5e05b43ebf3cbc417ab8bb9")
    fun getMovieList(): Call<MovieResponse>
}