package edu.bu.met.cs665.beverage;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/2/5 13:18
 * File Name: Espresso.java
 * Description: 
 */
public class Espresso extends BeverageStrategy {
    @Override
    protected void brew() {
        System.out.println("brew Espresso completed!");
    }

    @Override
    protected double price() {
        return 2;
    }

    @Override
    protected String name() {
        return "Espresso";
    }
}
