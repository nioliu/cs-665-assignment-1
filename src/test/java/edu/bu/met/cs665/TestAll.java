package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.beverage.Machine;
import org.junit.Test;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestAll {
    @Test
    public void TestMachine() {
        Machine machine = new Machine();
        System.out.println(machine.TestFunc("213213"));
    }
}