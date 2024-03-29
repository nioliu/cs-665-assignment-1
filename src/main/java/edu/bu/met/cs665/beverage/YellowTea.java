package edu.bu.met.cs665.beverage;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/2/5 13:17
 * File Name: YellowTea.java
 * Description: 
 */
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
