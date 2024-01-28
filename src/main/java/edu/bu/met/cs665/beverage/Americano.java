package edu.bu.met.cs665.beverage;

public class Americano extends BeverageStrategy {

    @Override
    protected void brew() {
        System.out.println("brew Americano completed!");
    }

    @Override
    protected double price() {
        return 2;
    }

    @Override
    protected String name() {
        return "Americano";
    }

}
