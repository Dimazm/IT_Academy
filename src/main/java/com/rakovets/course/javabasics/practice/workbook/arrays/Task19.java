package com.rakovets.course.javabasics.practice.workbook.arrays;

public class Task19 {
    public static void main(String[] args) {

        int newArray[] = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            int n = i + 3;
            newArray[i] = n + 3;
            if (i % 2 == 0) {
                System.out.println("Number of element = " + i + " value is " + newArray[i]);
            }
        }
    }
}