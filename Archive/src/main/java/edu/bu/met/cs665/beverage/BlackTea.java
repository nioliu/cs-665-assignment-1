package edu.bu.met.cs665.beverage;

public class BlackTea extends BeverageStrategy {

    @Override
    protected void brew() {
        System.out.println("brew Black Tea completed!");
    }

    @Override
    protected double price() {
        return 5;
    }

    @Override
    protected String name() {
        return "Black Tea";
    }
}
