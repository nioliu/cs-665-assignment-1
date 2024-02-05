package edu.bu.met.cs665.beverage;

public class Espresso extends BeverageStrategy {
    @Override
    protected void brew() {
        System.out.println("brew Espresso completed!");
    }

    @Override
    protected double price() {
        return 2;
    }

    @Override
    protected String name() {
        return "Espresso";
    }
}
