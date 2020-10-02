package com.rakovets.course.javabasics.practice.workbook.conditionalStatements;

public class Task04 {
    public static void main(String [] args) {
        int a = 2;
        int b = 8;
        int result= calculation(a,b);
        System.out.println(result);

    }
    static int calculation(int a, int b){
        return (a + b) + (a * b);

    }

}
