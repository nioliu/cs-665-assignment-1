package edu.bu.met.cs665.beverage;

public class Milk extends Condiment {
    @Override
    public String getCondimentId() {
        return "milk";
    }

    @Override
    public double price() {
        return 0.5;
    }

    @Override
    void add() {
        System.out.println("milk has been added!");
    }
}
