package com.iris.designpattern.observer;


/**
 * 气象站实例
 */


public interface Observer {

    public void update(float temp,float humidity,float pressure);
}

