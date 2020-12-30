package com.example.vedkrishi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AuthenticationApi {
    @GET("weather")
    Call<WeatherResult>getWeather(@Query("q")String cityname,
                                  @Query("appid")String apikey);
    @GET("weather")
    Call<WeatherDesc>getDesc(@Query("q")String cityname,
                             @Query("appid")String apikey);
}
