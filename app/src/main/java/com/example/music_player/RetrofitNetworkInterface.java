package com.example.music_player;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitNetworkInterface {
    @GET("/dagger")
    Call<List<Songs>> allSongs();
}
