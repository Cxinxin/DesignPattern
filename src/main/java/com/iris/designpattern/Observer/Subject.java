package com.iris.designpattern.Observer;

/**
 * 气象站实例
 */

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
