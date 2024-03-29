package edu.bu.met.cs665.beverage;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/2/5 13:16
 * File Name: BlackTea.java
 * Description: Black Tea
 */
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
