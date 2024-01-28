package edu.bu.met.cs665.beverage;

public class GreenTea extends BeverageStrategy {
    @Override
    protected void brew() {
        System.out.println("brew Green Tea completed!");
    }

    @Override
    protected double price() {
        return 9;
    }

    @Override
    protected String name() {
        return "Green Tea";
    }
}
