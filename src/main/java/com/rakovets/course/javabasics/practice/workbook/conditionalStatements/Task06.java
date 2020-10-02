package com.rakovets.course.javabasics.practice.workbook.conditionalStatements;

public class Task06 {
    public static void main(String[] args){
        int a = 178;
            System.out.println(checkSeven(a));
    }

    static boolean checkSeven(int a){
        int resultOfCheck = a%10;
        boolean result = false;
        if ( resultOfCheck == 7){
            result = true;
        }
        return result;
    }
}
