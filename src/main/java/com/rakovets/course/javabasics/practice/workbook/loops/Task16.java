package com.rakovets.course.javabasics.practice.workbook.loops;

public class Task16 {
    public static void main(String[] args) {
        int result;
        int n = 100;
        for (int i = 1; i <= n; i++ ) {
            result = i % 7;
            if (result == 0) {
                System.out.println(i + " Hope");
            }
        }
    }
}
