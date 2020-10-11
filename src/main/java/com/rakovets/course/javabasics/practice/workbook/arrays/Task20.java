package com.rakovets.course.javabasics.practice.workbook.arrays;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
        int newArray[] = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            int n = (i + 12) * 4;
            newArray[i] = n;
        }
        newArray [4] = 100;
        int maxElement = newArray[0];
        for (int i = 0; i < 10; i++) {
            if (maxElement < newArray[i]) {
                maxElement = newArray[i];
            }

        }
        System.out.println(Arrays.toString(newArray));
        System.out.println(maxElement);

    }
}
