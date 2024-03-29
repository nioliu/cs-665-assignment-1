package edu.bu.met.cs665.beverage;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/2/5 13:17
 * File Name: Milk.java
 * Description: 
 */
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
