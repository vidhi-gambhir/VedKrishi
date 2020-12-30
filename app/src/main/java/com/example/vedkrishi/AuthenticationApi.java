package com.example.vedkrishi;

import com.example.vedkrishi.ModelClass.WeatherDesc;
import com.example.vedkrishi.ModelClass.WeatherResult;

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
