package edu.bu.met.cs665.beverage;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/2/5 13:18
 * File Name: GreenTea.java
 * Description:
 */
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
