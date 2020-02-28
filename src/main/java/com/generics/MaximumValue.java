package com.generics;

public class MaximumValue {

    public int getMaximumInteger(Integer firstInt, Integer secondInt, Integer thirdInt) {
        Integer max = firstInt;
        if (secondInt.compareTo(max)>0){
            max = secondInt;
        }
        if (thirdInt.compareTo(max)>0){
            max = thirdInt;
        }
        return max;
    }

    public float getMaximumFloat(Float firstFloat, Float secondFloat, Float thirdFloat) {
        Float max = firstFloat;
        if (secondFloat.compareTo(max)>0){
            max = secondFloat;
        }
        if (thirdFloat.compareTo(max)>0){
            max = thirdFloat;
        }
        return max;
    }

    public String getMaximumString(String string1, String string2, String string3) {
        String max = string1;
        if (string2.compareTo(max)>0){
            max = string2;
        }
        if (string3.compareTo(max)>0){
            max = string3;
        }
        return max;
    }
}
