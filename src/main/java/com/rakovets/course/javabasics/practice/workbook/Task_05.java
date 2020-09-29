package com.rakovets.course.javabasics.practice.workbook;


public class Task_05 {

    public static void main(String[] args) {
        int seconds = 694946;
        int sec = seconds%60;
        int sdelta = seconds - sec;
        int minutes = sdelta/60;
        int m = minutes%60;
        int mdelta = minutes - m;
        int hours = mdelta/60;
        int h = hours%24;
        int hdelta = hours - h;
        int days =  hdelta/24;
        int d = days%7;
        int ddays = days - d;
        int weeks = ddays/7;
          System.out.println( weeks + " weeks and "  + d + " days " + h + " hours " + m + " minutes " + sec + " seconds");


    }
}
