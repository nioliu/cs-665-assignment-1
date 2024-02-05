package edu.bu.met.cs665.beverage;

public class LatteMacchiato extends BeverageStrategy {
    @Override
    protected void brew() {
        System.out.println("brew Latte Macchiato completed!");
    }

    @Override
    protected double price() {
        return 2.5;
    }

    @Override
    protected String name() {
        return "Latte Macchiato";
    }
}
