package com.rakovets.course.javabasics.practice.workbook.loops;

public class Task12 {
    public static void main(String[] args) {
        int i = 0;
        int n = 10;
        int factorial = 1;
        while (i <= n) {
            if (i == 0){
                factorial =1;
            } else {
                factorial *= i;
                System.out.println(factorial);
            }
            i++;

        }
    }
}
