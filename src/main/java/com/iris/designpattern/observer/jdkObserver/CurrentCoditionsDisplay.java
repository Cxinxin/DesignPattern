package com.iris.designpattern.observer.jdkObserver;

import com.iris.designpattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentCoditionsDisplay implements Observer,DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;
    private Observable observable;

    public CurrentCoditionsDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);

    }

    @Override
    public void display() {
        System.out.println("Current conditons: "+temp+"F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(Observable observable, Object o) {
        if(observable instanceof  WeatherData){
            WeatherData weatherData=(WeatherData) observable;
            this.humidity=weatherData.getHumidity();
            this.temp=weatherData.getTemp();
            display();
        }
    }
}
