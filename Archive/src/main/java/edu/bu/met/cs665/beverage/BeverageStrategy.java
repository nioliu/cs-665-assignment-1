package edu.bu.met.cs665.beverage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/2/1 19:22
 * File Name: BeverageStrategy.java
 * Description: Beverage Strategy abstract class
 */
// can't be invoked by external package
abstract class BeverageStrategy {
    // save all the condiments need to add
    private final List<Condiment> condiments = new ArrayList<>();
    BeverageStrategy realStrategy = this;

    // switch real beverage
    public void switchBeverageStrategy(BeverageStrategy o) {
        realStrategy = o;
    }

    // how to brew
    protected abstract void brew();

    // beverage's price
    protected abstract double price();

    // beverage's name
    protected abstract String name();

    // get total price
    public double getTotalPrice() {
        double p = realStrategy.price();
        for (Condiment condiment : condiments) {
            p += condiment.price();
        }
        return p;
    }

    /**
     * get receipt with in format
     */
    public String getReceipt() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("%s(Beverage):%.2f$\n", realStrategy.name(), realStrategy.price()));
        for (Condiment condiment : condiments) {
            stringBuilder.append(String.format("%s(Beverage):%.2f$\n", condiment.getCondimentId(), condiment.price()));
        }
        stringBuilder.append(String.format("total price:%.2f$", getTotalPrice()));
        return stringBuilder.toString();
    }

    /**
     * begin to brew
     */
    public void execute() {
        realStrategy.brew();
        for (Condiment condiment : condiments) {
            condiment.add();
        }
    }

    /**
     * add condiments into beverage
     */
    public void addCondiments(Condiment... condiments) throws Exception {
        HashMap<String, Integer> condimentsCntMap = new HashMap<>();
        for (Condiment condiment : condiments) {
            Integer currCondCnt = condimentsCntMap.getOrDefault(condiment.getCondimentId(), 0);
            if (currCondCnt >= 3) {
                String exc = String.format("can't add %s more than 3!", condiment.getCondimentId());
                System.out.println(exc);
                this.condiments.clear();
                throw new Exception(exc);
            }
            condimentsCntMap.put(condiment.getCondimentId(), currCondCnt + 1);
            this.condiments.add(condiment);
        }
    }
}
