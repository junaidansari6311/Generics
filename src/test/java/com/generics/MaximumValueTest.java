package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {
    @Test
    public void givenIntegers_WhenFirstValueIsMax_ShouldReturnFirstValue() {
        MaximumValue value = new MaximumValue();
        int maximum = value.getMaximumInteger(10,5,9);
        Assert.assertEquals(10,maximum);
    }

    @Test
    public void givenIntegers_WhenSecondValueIsMaximum_ShouldReturnSecondValue() {
        MaximumValue value = new MaximumValue();
        int maximum = value.getMaximumInteger(10, 15, 5);
        Assert.assertEquals(15,maximum);
    }

    @Test
    public void givenIntegers_WhenThirdValueIsMaximum_ShouldReturnThirdValue() {
        MaximumValue value = new MaximumValue();
        int maximum = value.getMaximumInteger(10, 20, 30);
        Assert.assertEquals(30,maximum);
    }
}
