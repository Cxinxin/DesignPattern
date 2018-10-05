package com.iris.designpattern.observer;

public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;
    private Subject subject;


    /**
     * 构造引入Subject, 引用方便后期remove
     * @param subject
     */
    public CurrentConditionDisplay(Subject subject) {
        this.subject=subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditons: "+temp+"F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }
}
