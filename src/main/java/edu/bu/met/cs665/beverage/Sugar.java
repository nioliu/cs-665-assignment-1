package edu.bu.met.cs665.beverage;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/2/5 13:17
 * File Name: Sugar.java
 * Description: 
 */
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
