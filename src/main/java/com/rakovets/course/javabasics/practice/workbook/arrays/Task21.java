package com.rakovets.course.javabasics.practice.workbook.arrays;

import java.io.OutputStream;

public class Task21 {
    public static void main(String[] args) {
        int newArray[] = {23, 6, 3, 133, 40, 30, 30, 1, 9, 10};
        int minArrayValue = newArray[0];
        int minArrayIndex = 0;
        int maxArrayValue = newArray[0];
        int maxArrayIndex = 0;
        int summArray = 0;
        int tmp = 0;
        for (int i = 0; i < 10; i++) {
            if (minArrayValue > newArray[i]) {
                minArrayValue = newArray[i];
                minArrayIndex = i;
            }
            if (maxArrayValue < newArray[i]) {
                maxArrayValue = newArray[i];
                maxArrayIndex = i;
            }

        }
        if (minArrayIndex < maxArrayIndex) {
            for (int i = minArrayIndex; i < maxArrayIndex - 1; i++) {
                summArray = tmp + newArray[i + 1];
                tmp = summArray;
            }

        } else if (minArrayIndex > maxArrayIndex) {
            for (int i = minArrayIndex; i > maxArrayIndex + 1; i--) {
                summArray = tmp + newArray[i - 1];
                tmp = summArray;
            }

        }

        System.out.println("Min  = " + minArrayIndex + "   " + minArrayValue);
        System.out.println("Max  = " + maxArrayIndex + "   " + maxArrayValue);
        System.out.println("Summa  = " + tmp);
    }
}
