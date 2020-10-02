package com.rakovets.course.javabasics.practice.workbook.conditionalStatements;

import java.awt.*;

public class Task10 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 2;
        int d = 4;
        int e = 5;
        int f = 4;
        int commonlong = a + c;
        int commonwidth = b + d;
        int commonLongW = a + d;
        int commonwidthL = b + c;
        if (commonlong <= e && b <= f && d <= f) {
            System.out.println("Увапру по длине");
        } else if (commonwidth <= f && a <= e && c <= e) {
            System.out.println("Увапру по ширине");
        } else if (commonLongW <= e && a <= e && d <= e) {
            System.out.println("Увапру с поворотом одного из дома");
        } else if (commonwidthL <= f && b <= f && c <= f) {
            System.out.println("Увапру с поворотом одного из дома");
        } else {
            System.out.println("Ты-ДыЩЩЩЩ");
        }
    }
}






