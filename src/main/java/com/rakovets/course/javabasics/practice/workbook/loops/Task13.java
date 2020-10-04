package com.rakovets.course.javabasics.practice.workbook.loops;

public class Task13 {
    public static void main(String[] args) {
        int i = 1;
        long result = 1L;

        do {
            result *= i;
            i++;
        }
        while (i <= 25);
        System.out.println("Result " + result + "   " + i);
    }
}
