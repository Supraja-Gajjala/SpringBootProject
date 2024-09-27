package com.jsp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ResponseModel.WeatherResponse;
import com.jsp.service.WeatherService;

@RestController
public class WeatherController 
{
	    @Autowired
	    private WeatherService weatherService;

	    @GetMapping("/weather")
	    public WeatherResponse getWeather(@RequestParam String city)
	    {
	        return weatherService.fetchWeather(city);
	    }
}
