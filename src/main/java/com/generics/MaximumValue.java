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

}
