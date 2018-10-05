package com.iris.designpattern.observer.jdkObserver;


import java.util.Observable;

public class WeatherData extends Observable {
    /**
     * subject 如何发出通知
     * 1. 先调用setChanged方法，标志状态已经改变的事实
     * 2. 调用两种notifyObserver()中的一种
     */
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void setMesasureMents(float temp,float humidity,float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        this.setChanged();
        measurementChanged();
    }

    public void measurementChanged(){
        notifyObservers();
    }


    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemp() {
        return temp;
    }
}
