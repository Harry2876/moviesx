package com.example.moviesx.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.example.moviesx.R;
import com.example.moviesx.apiservice.MovieApiService;
import com.example.moviesx.apiservice.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class MovieRepository {

    /* Used to abstract the data source details and provides a clean API
       for the view model to fetch and manage data */

    private ArrayList<Movie> movies = new ArrayList<>();
    private MutableLiveData<List<Movie>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public MovieRepository(Application application) {
        this.application = application;
    }

    //Creating getters for livedata

    public MutableLiveData<List<Movie>> getMutableLiveData() {
        MovieApiService movieApiService = RetrofitInstance.getService();

        Call<Result> call = movieApiService.getPopularMovies(application.getApplicationContext().getString(R.string.api_key));
    }
}
