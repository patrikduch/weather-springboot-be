package com.patrikduch.weatherspringbootbe.controllers;

import com.patrikduch.weatherspringbootbe.infrastructure.services.WeatherApiDataServiceImpl;
import com.patrikduch.weatherspringbootbe.models.responses.WeatherApiResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/weather")
@RestController
public class WeatherController {
    @Autowired
    private WeatherApiDataServiceImpl weatherApiDataService;

    @GetMapping()
    public ResponseEntity<WeatherApiResponseModel> getWeatherInfo() {
        var weatherApiResponse = weatherApiDataService.getData();
        return new ResponseEntity<WeatherApiResponseModel>(weatherApiResponse, HttpStatus.OK);
    }
}
