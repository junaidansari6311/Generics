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

    @Test
    public void givenFloatValue_WhenFirstValueIsMaximum_ShouldReturnFirstValue() {
        MaximumValue value = new MaximumValue();
        float maximum = value.getMaximumFloat(10.0f, 8.0f, 7.0f);
        Assert.assertEquals(10.0,maximum,0.0f);
    }

    @Test
    public void givenFloatValue_WhenSecondValueIsMaximum_ShouldReturnSecond() {
        MaximumValue value = new MaximumValue();
        float maximum = value.getMaximumFloat(8.0f,10.0f,9.0f);
        Assert.assertEquals(10.0,maximum,0.0f);
    }

    @Test
    public void givenFloatValue_WhenThirdValueIsMaximum_ShouldReturnThird() {
        MaximumValue value = new MaximumValue();
        float maximum = value.getMaximumFloat(8.0f,9.0f,10.0f);
        Assert.assertEquals(10.0,maximum,0.0f);
    }

    @Test
    public void givenStringValue_WhenFirstValueIsMaximum_ShouldReturnFirstValue() {
        MaximumValue value = new MaximumValue();
        String maximum = value.getMaximumString("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach",maximum);
    }

    @Test
    public void givenStringValue_WhenSecondValueIsMaximum_ShouldReturnSecondValue() {
        MaximumValue value = new MaximumValue();
        String maximum = value.getMaximumString("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach",maximum);
    }
    @Test
    public void givenStringValue_WhenThirdValueIsMaximum_ShouldReturnThirdValue() {
        MaximumValue value = new MaximumValue();
        String maximum = value.getMaximumString("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach",maximum);
    }
}

