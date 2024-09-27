package com.jsp.ResponseModel;

public class OpenWeatherMapResponse
{
	private String name;
    private Weather[] weather;
    private Main main;

   

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public Weather[] getWeather() {
        return weather;
    }
    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) 
    {
        this.main = main;
    }

    public static class Weather 
    {
        private String description;

        public String getDescription()
        {
            return description;
        }
        public void setDescription(String description) 
        {
            this.description = description;
        }
    }

    public static class Main 
    {
        private double temp;
        public double getTemp() 
        {
            return temp;
        }

        public void setTemp(double temp) 
        {
            this.temp = temp;
        }
    }
	

}
