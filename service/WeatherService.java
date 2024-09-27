package com.jsp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jsp.ResponseModel.OpenWeatherMapResponse;
import com.jsp.ResponseModel.WeatherResponse;

@Service
public class WeatherService 
{
	 private final String API_KEY ="9a2624477e2f4c531dfa5b6ac01220e3"; // Replace with your API key
	    private final String BASE_URL = "https://api.openweathermap.org/data/3.0/onecall?lat={lat}&lon={lon}&exclude={part}&appid={API key}";

	    public WeatherResponse fetchWeather(String city) 
	    {
	        String url = String.format(BASE_URL, city, API_KEY);
	        RestTemplate restTemplate = new RestTemplate();
	        OpenWeatherMapResponse response = restTemplate.getForObject(url, OpenWeatherMapResponse.class);

	        WeatherResponse weatherResponse = new WeatherResponse();
	        weatherResponse.setCity(response.getName());
	        weatherResponse.setDescription(response.getWeather()[0].getDescription());
	        weatherResponse.setTemperature(response.getMain().getTemp());

	        return weatherResponse;
	    }

}
