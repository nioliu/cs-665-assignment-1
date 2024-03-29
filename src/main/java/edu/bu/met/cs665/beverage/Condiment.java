package edu.bu.met.cs665.beverage;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/2/5 13:16
 * File Name: Condiment.java
 * Description: abstract class Condiment
 */

/**
 * This abstract class is used to define condiment method
 */
public abstract class Condiment {
    // get the id of curr condiment
    abstract String getCondimentId();

    // get the price of curr condiment
    public abstract double price();

    // add curr condiment
    abstract void add();
}
