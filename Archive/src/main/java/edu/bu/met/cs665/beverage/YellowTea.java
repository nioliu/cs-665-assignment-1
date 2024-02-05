package edu.bu.met.cs665.beverage;

public class YellowTea extends BeverageStrategy {
    @Override
    protected void brew() {
        System.out.println("brew Yellow Tea completed!");
    }

    @Override
    protected double price() {
        return 20;
    }

    @Override
    protected String name() {
        return "Yellow Tea";
    }
}
