package com.rakovets.course.javabasics.practice.workbook.conditionalStatements;

public class Task08 {
    public static void main(String[] args) {
        int summa = 25;
        int ostatok = summa % 10;
                //  System.out.println(ostatok);
             if (summa >= 10 && summa <= 20) {
                 System.out.println(summa + " Рублей");
             } else if (ostatok == 1) {
                 System.out.println(summa + " Рубль");
             } else if (ostatok >= 2 && ostatok <= 4) {
                 System.out.println(summa + " Рубля");
             } else if (ostatok == 0 || ostatok >= 5) {
                 System.out.println(summa + " Рублей");
             }
    }
}








