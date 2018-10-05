package com.iris.designpattern.observer.jdkObserver;


public class WeatherStation {

    public static void main(String args[]){
        WeatherData weatherData=new WeatherData();
        CurrentCoditionsDisplay currentConditionDisplay=new CurrentCoditionsDisplay(weatherData);
        weatherData.setMesasureMents(80,90,29.2f);

    }
}
