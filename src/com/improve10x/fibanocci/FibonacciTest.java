package com.improve10x.fibanocci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void nothing() {

    }

    /*0, 1, 1, 2, 3, 5, 8, ...
    * input -10  output -1
    * input 0  output 0
    * input 1 output 1
    * input 2 output 2
    * input 5 output 5 */

    @Test
    public void giveAnyNegativeNumber_returnsNegativeNumber() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.find(-10);
        assertEquals(-1, negativeFibonacci);
    }
}
