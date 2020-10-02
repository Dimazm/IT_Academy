package com.rakovets.course.javabasics.practice.workbook.conditionalStatements;

public class Task07 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int r = 2;
        boolean result = checktrueorfalse(a, b, r);
        if (result) {
            System.out.println("Covered");
        } else {
            System.out.println("Not Covered");
        }
    }

    static boolean checktrueorfalse(int a, int b, int r) {
        boolean result = false;
        double hipotinouse = Math.sqrt((a * a + b * b));
        if (r >= hipotinouse / 2) {
            result = true;
        }
        return result;
    }
}
