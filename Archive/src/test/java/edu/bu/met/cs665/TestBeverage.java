package edu.bu.met.cs665;

import edu.bu.met.cs665.beverage.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class TestBeverage {
    private final Logger logger = LogManager.getLogger();

    /**
     * assume user buy an Espresso only and get its price and receipt.
     */
    @Test
    public void testBuyBeverage() throws Exception {
        Espresso beverage = new Espresso();
        beverage.execute();

        Assert.assertEquals(2, beverage.getTotalPrice(), 0);
        logger.info("\nReceipt:\n" + beverage.getReceipt());
    }

    /**
     * assume user buy an Espresso and add some condiments in it, get its price.
     */
    @Test
    public void testBuyBeverageWithCondiments() throws Exception {
        Espresso beverage = new Espresso();
        beverage.addCondiments(new Sugar(), new Milk());
        beverage.execute();

        Assert.assertEquals(3, beverage.getTotalPrice(), 0);
        logger.info("\nReceipt:\n" + beverage.getReceipt());
    }

    /**
     * assume user buy an Espresso first and switch to Green Tea, then add
     * some condiments, and get the price.
     */
    @Test
    public void testBuyBeverageAndSwitch() throws Exception {
        Espresso beverage = new Espresso();
        beverage.switchBeverageStrategy(new GreenTea());
        beverage.addCondiments(new Sugar(), new Milk());
        beverage.execute();

        Assert.assertEquals(10, beverage.getTotalPrice(), 0);
        logger.info("\nReceipt:\n" + beverage.getReceipt());
    }

    @Test
    public void testAllMethods() throws Exception {
        GreenTea beverage = new GreenTea(); // assume you want a green tea
        beverage.addCondiments(new Sugar(), new Milk(), new Milk());// and ass some condiments
        beverage.switchBeverageStrategy(new YellowTea());// then you want to change to yellow tea
        logger.info(beverage.getReceipt());// now you want to take a look at the receipt base on your chose
        beverage.addCondiments(new Sugar());// and you decide to add one more sugar
        logger.info(beverage.getReceipt());// and check the receipt
        beverage.execute();// then begin to brew
        logger.info(beverage.getTotalPrice());// finally, get the total price
    }
}
