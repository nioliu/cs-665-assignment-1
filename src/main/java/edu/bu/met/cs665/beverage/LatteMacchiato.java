package edu.bu.met.cs665.beverage;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/2/5 13:17
 * File Name: LatteMacchiato.java
 * Description:
 */
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
