package org.BelajarTesNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void add(){
        int actualResult = Calculator.add(10,20);
        int expectedResult = 30;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtract(){
        int actualResult = Calculator.subtract(10,20);
        int expectedResult = -10;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiplication(){
        int actualResult = Calculator.multiplication(10,20);
        int expectedResult = 200;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void Modulo(){
        int actualResult = Calculator.Modulo(10,20);
        int expectedResult = 10;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void divided(){
        double actualResult = Calculator.divided(10,20);
        double expectedResult = 0.50;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void bmi(){
        double actualResult = Calculator.bmi(10,20);
        double expectedResult = 0.20;

        Assert.assertEquals(actualResult, expectedResult);
    }
}
