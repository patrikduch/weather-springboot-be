package com.patrikduch.weatherspringbootbe.infrastructure.services;

import com.patrikduch.weatherspringbootbe.models.responses.WeatherApiResponseModel;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class WeatherApiDataServiceImpl {

    private static final Logger logger = LoggerFactory.getLogger(WeatherApiDataServiceImpl.class);
    private RestTemplate restTemplate;

    public WeatherApiDataServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public WeatherApiResponseModel getData() {
        try {
            String url = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m";
            WeatherApiResponseModel response = restTemplate.getForObject(url, WeatherApiResponseModel.class);
            logger.info("Weather data retrieved: {}", response);
            return response;
        } catch (RestClientException e) {
            logger.error("Error fetching weather data: ", e);
            throw e;
        }
    }
}
