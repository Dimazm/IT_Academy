package com.rakovets.course.javabasics.practice.workbook.loops;

public class Task13 {
    public static void main(String[] args) {
        int i = 1;
        long result = 1;

        do {
            result *= i;
            System.out.println("Result = " + result );
            i++;
        }
        while (i <= 25);

    }
}
