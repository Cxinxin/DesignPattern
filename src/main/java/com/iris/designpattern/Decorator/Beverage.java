package com.iris.designpattern.Decorator;

/**
 * 饮料 抽象类
 */
public abstract class Beverage {

    String description="Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
