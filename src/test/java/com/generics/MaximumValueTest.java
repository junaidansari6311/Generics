package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {
    @Test
    public void givenIntegers_WhenFirstValueIsMax_ShouldReturnFirstValue() {
        MaximumValue value = new MaximumValue(10,5,9);
        int maximum = (int) value.getMaximumValue();
        Assert.assertEquals(10,maximum);
    }

    @Test
    public void givenIntegers_WhenSecondValueIsMaximum_ShouldReturnSecondValue() {
        MaximumValue value = new MaximumValue(10, 15, 5);
        int maximum = (int) value.getMaximumValue();
        Assert.assertEquals(15,maximum);
    }

    @Test
    public void givenIntegers_WhenThirdValueIsMaximum_ShouldReturnThirdValue() {
        MaximumValue value = new MaximumValue(10, 20, 30);
        int maximum = (int) value.getMaximumValue();
        Assert.assertEquals(30,maximum);
    }

    @Test
    public void givenFloatValue_WhenFirstValueIsMaximum_ShouldReturnFirstValue() {
        MaximumValue value = new MaximumValue(10.0f, 8.0f, 7.0f);
        float maximum = (float) value.getMaximumValue();
        Assert.assertEquals(10.0,maximum,0.0f);
    }

    @Test
    public void givenFloatValue_WhenSecondValueIsMaximum_ShouldReturnSecond() {
        MaximumValue value = new MaximumValue(8.0f,10.0f,9.0f);
        float maximum = (float) value.getMaximumValue();
        Assert.assertEquals(10.0,maximum,0.0f);
    }

    @Test
    public void givenFloatValue_WhenThirdValueIsMaximum_ShouldReturnThird() {
        MaximumValue value = new MaximumValue(8.0f,9.0f,10.0f);
        float maximum = (float) value.getMaximumValue();
        Assert.assertEquals(10.0,maximum,0.0f);
    }

    @Test
    public void givenStringValue_WhenFirstValueIsMaximum_ShouldReturnFirstValue() {
        MaximumValue value = new MaximumValue("Peach", "Apple", "Banana");
        String maximum = (String) value.getMaximumValue();
        Assert.assertEquals("Peach",maximum);
    }

    @Test
    public void givenStringValue_WhenSecondValueIsMaximum_ShouldReturnSecondValue() {
        MaximumValue value = new MaximumValue("Apple", "Peach", "Banana");
        String maximum = (String) value.getMaximumValue();
        Assert.assertEquals("Peach",maximum);
    }
    @Test
    public void givenStringValue_WhenThirdValueIsMaximum_ShouldReturnThirdValue() {
        MaximumValue value = new MaximumValue("Apple", "Banana", "Peach");
        String maximum = (String) value.getMaximumValue();
        Assert.assertEquals("Peach",maximum);
    }

    @Test
    public void givenValuesMoreThanThreeIntegers_ShouldReturnMaximum() {
        int maximum = MaximumValue.getMaximumValue(10, 20, 40, 30, 50);
        Assert.assertEquals(50,maximum);
    }

    @Test
    public void givenValuesMoreThanThreeFloats_ShouldReturnMaximum() {
        float maximum = MaximumValue.getMaximumValue(2.0f, 3.0f, 1.0f, 4.0f);
        Assert.assertEquals(4.0f,maximum,0.0f);
    }

    @Test
    public void givenValuesMoreThanThreeString_ShouldReturnMaximum() {
        String maximum = MaximumValue.getMaximumValue("Apple","Banana","Orange","Peach","Watermelon");
        Assert.assertEquals("Watermelon",maximum);
    }
}

