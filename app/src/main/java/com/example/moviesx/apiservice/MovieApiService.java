package com.example.moviesx.apiservice;

import com.example.moviesx.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    @GET("movies/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);

}
