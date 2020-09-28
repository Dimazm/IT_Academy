package com.rakovets.course.javabasics.practice.operators;

/**
* Разработать программу для логистического центра:
 *  которая будет разчитывать количество полностью загруженны грузовиков, необходимых
 * для перевозки некоторого груза, если известно:
 *
 * @param cargo            - вес всего груза
 * @param carryingCapacity - грузоподъемность грузовиков
 */


public class Task01 {
    public static void main(String[] args) {
        //FIXME
        // Переменные, которые можно изменять для проверки различных вариантов входных параметров
        int cargo = 9;
        int carryingCapacity = 3;

        // Код необходимый для тестирования, не изменять
        cargo = (args.length == 0) ? cargo : Integer.parseInt(args[0]);
        carryingCapacity = (args.length == 0) ? carryingCapacity : Integer.parseInt(args[1]);
        int result = cargo / carryingCapacity;
       System.out.println("Колическтво полных грузовиков = "+ result);
    }
}