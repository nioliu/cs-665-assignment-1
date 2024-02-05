package edu.bu.met.cs665.beverage;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/2/1 19:19
 * File Name: Americano.java
 * Description: Americano extend the beverage strategy
 */
public class Americano extends BeverageStrategy {

    @Override
    protected void brew() {
        System.out.println("brew Americano completed!");
    }

    @Override
    protected double price() {
        return 2;
    }

    @Override
    protected String name() {
        return "Americano";
    }

}
