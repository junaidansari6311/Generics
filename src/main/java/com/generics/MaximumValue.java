package com.generics;

import java.util.Arrays;

public class MaximumValue<E extends Comparable<E>> {

    private E value1;
    private E value2;
    private E value3;

    public MaximumValue(E value1, E value2, E value3) {
        this.value1=value1;
        this.value2=value2;
        this.value3=value3;
    }

     public E getMaximumValue(){
        return getMaximumValue(value1,value2,value3);
    }

    public static <E extends Comparable<E>> void printMax(E max){
        System.out.println("Maximum value is "+max);
    }

    public static <E extends Comparable<E>> E getMaximumValue(E value1, E value2, E value3,E ...more) {
        E max = value1;
        if (value2.compareTo(max)>0) {
            max = value2;
        }
        if (value3.compareTo(max)>0) {
            max = value3;
        }
        if (more.length !=0) {
            Arrays.sort(more);
            if (more[more.length-1].compareTo(max)>0) {
                max = more[more.length-1];
            }
        }
        printMax(max);
        return max;
    }
}
