package com.iris.designpattern.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    ArrayList<Observer> list=new ArrayList <>();
    private float temp;
    private float humidity;
    private float pressure;


    @Override
    public void registerObserver(Observer o) {
        if(!list.contains(0)){
            list.add(o);
        }

    }

    @Override
    public void removeObserver(Observer o) {
        if(list.contains(o)){
           list.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o:list){
            o.update(temp,humidity,pressure);
        }
    }


    public void measurementChanged(){
        notifyObservers();
    }




    public void setMesasureMents(float temp,float humidity,float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;

        measurementChanged();
    }

}
