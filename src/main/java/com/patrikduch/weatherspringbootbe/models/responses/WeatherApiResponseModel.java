package com.patrikduch.weatherspringbootbe.models.responses;

public class WeatherApiResponseModel {

    private CurrentWeatherApiResponseModel current;
    private HourlyWeatherResponseModel hourly;

    // Getters and setters
    public CurrentWeatherApiResponseModel getCurrent() {
        return current;
    }

    public void setCurrent(CurrentWeatherApiResponseModel current) {
        this.current = current;
    }

    public HourlyWeatherResponseModel getHourly() {
        return hourly;
    }

    public void setHourly(HourlyWeatherResponseModel hourly) {
        this.hourly = hourly;
    }
}
