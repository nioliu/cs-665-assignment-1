package edu.bu.met.cs665.beverage;

public abstract class Condiment {
    // get the id of curr condiment
    abstract String getCondimentId();

    // get the price of curr condiment
    public abstract double price();

    // add curr condiment
    abstract void add();
}
