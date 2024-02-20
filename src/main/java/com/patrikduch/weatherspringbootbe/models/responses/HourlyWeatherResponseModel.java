package com.patrikduch.weatherspringbootbe.models.responses;

import java.util.List;

public class HourlyWeatherResponseModel {
    private List<String> time;
    private List<Double> wind_speed_10m;
    private List<Double> temperature_2m;
    private List<Integer> relative_humidity_2m;

    // Getters and setters
    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }

    public List<Double> getWind_speed_10m() {
        return wind_speed_10m;
    }

    public void setWind_speed_10m(List<Double> wind_speed_10m) {
        this.wind_speed_10m = wind_speed_10m;
    }

    public List<Double> getTemperature_2m() {
        return temperature_2m;
    }

    public void setTemperature_2m(List<Double> temperature_2m) {
        this.temperature_2m = temperature_2m;
    }

    public List<Integer> getRelative_humidity_2m() {
        return relative_humidity_2m;
    }

    public void setRelative_humidity_2m(List<Integer> relative_humidity_2m) {
        this.relative_humidity_2m = relative_humidity_2m;
    }
}