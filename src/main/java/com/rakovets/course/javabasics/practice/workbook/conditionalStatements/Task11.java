package com.rakovets.course.javabasics.practice.workbook.conditionalStatements;

public class Task11 {
    public static void main(String[] args) {
        int day = 7;
        getSchedule(day);

    }

    static void getSchedule(int day) {
        switch (day) {
            case 1:
                System.out.println("Понедельник:" + "\n" + "Математика\n" + "Рус.яз");
                break;
            case 2:
                System.out.println("Вторник:" + "\n" + "Рус Лит\n" + "Рус.яз");
                break;
            case 3:
                System.out.println("Среда:" + "\n" + "Физ-ра\n" + "Бел Яз");
                break;
            case 4:
                System.out.println("Четверг:" + "\n" + "География\n" + "Физика");
                break;
            case 5:
                System.out.println("Пятница:" + "\n" + "Проектирование\n" + "Черчение");
                break;
            case 6:
                System.out.println("Суббота:" + "\n" + "Футбол\n" + "Баня");
                break;
            case 7:
                System.out.println("Воскресенье:" + "\n" + "Роболаб\n" + "Протест");
                break;
            default:
                if (day > 7) {
                    System.out.println("Wrong number of the week = " + day);
                }

        }

    }
}
