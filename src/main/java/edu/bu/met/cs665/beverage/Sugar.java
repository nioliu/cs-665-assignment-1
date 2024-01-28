package edu.bu.met.cs665.beverage;

public class Sugar extends Condiment {
    @Override
    String getCondimentId() {
        return "sugar";
    }

    @Override
    public double price() {
        return 0.5;
    }

    @Override
    void add() {
        System.out.println("sugar has been added!");
    }
}
