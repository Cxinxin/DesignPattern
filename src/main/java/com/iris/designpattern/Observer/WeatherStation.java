package com.iris.designpattern.Observer;

public class WeatherStation {

    public static void main(String args[]){
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);

        weatherData.setMesasureMents(80,90,29.2f);

    }
}
