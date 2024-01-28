package edu.bu.met.cs665;

import edu.bu.met.cs665.beverage.Espresso;
import edu.bu.met.cs665.beverage.Milk;
import edu.bu.met.cs665.beverage.Sugar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    protected static final Logger parentLogger = LogManager.getLogger();

    public static void main(String[] args) {
        try {
            Espresso espresso = new Espresso();
            espresso.addCondiments(new Sugar(), new Milk(), new Sugar(), new Sugar(), new Sugar());
            System.out.println(espresso.getTotalPrice());
            espresso.execute();
            System.out.println();
            System.out.println(espresso.getReceipt());
        } catch (Exception e) {
            parentLogger.error("", e);
        }
    }
}