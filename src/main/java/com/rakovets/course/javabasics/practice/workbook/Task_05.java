package com.rakovets.course.javabasics.practice.workbook;


public class Task_05 {

    public static void main(String[] args) {
        int seconds = 694946;
        int sec = seconds%60; // остаток от общего: по сути секунды
        int sdelta = seconds - sec; // full seconds
        int minutes = sdelta/60; // полных минут
        int m = minutes%60; // лишние минуты от 60
        int mdelta = minutes - m;
        int hours = mdelta/60;// полных часов
        int h = hours%24;// остаток часов < 24
        int hdelta = hours - h;
        int days =  hdelta/24;// полных дней
        int d = days%7;//остаток от дней (часов)
        int ddays = days - d;
        int weeks = ddays/7;
        System.out.println( weeks + " weeks and "  + d + " days " + h + " hours " + m + " minutes " + sec);


    }
}
