package com.rakovets.course.javabasics.practice.workbook.conditionalStatements;

import java.time.Year;

public class Task09 {
    public static void main(String[] args) {
        int day = 31;
        int month = 8;
        int year = 2023;
        boolean isyaervisokosniy = isTheYearVisokosniy(year);
        boolean isLastdayofMonth = isNeedToChangeMonth(day, month, isyaervisokosniy);
        boolean isLastDayOfYear = isHappyNewYear(day, month);
      if(isLastDayOfYear){
         day = 1;
         month = 1;
         year +=1;
         System.out.println(day + "/" + month + "/" + year);
      } else if (isLastdayofMonth){
          day = 1;
          month += 1;
          System.out.println(day + "/" + month + "/" + year);
      }
      else {
          System.out.println("Check input parameters");
      }
    }

    static boolean isNeedToChangeMonth(int day, int month, boolean leap) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day == 30;
        } else if (month == 1 || month == 3 || month == 7 || month == 8 || month == 10) {
            return  day == 31;
        }
        else {
            if (leap && day == 29){
                return true;
            } else return !leap && day == 28;
        }
    }

    static boolean isTheYearVisokosniy(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }
    static boolean isHappyNewYear(int day, int moth){
        return moth == 12 && day == 31;
    }
}