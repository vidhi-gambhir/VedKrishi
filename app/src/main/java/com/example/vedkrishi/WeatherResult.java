package com.example.vedkrishi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherResult {
    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    @SerializedName("main")
    Main main;

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    private List<Weather> weather;
}
