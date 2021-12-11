package org.jun.designpattern.decorator;

public class StarbuzzCoffee {
    public static void order(){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new SteamedMilk(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}