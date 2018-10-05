package com.iris.designpattern.decorator;

public class StarBuzzCoffee {
    public static void main(String args[]){
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage1=new HouseBlend();
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());
        beverage1=new Mocha(beverage1);
        beverage1=new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());

    }
}