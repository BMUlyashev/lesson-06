package ru.skypro;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] buhBook = generateBuhBook();
        System.out.println(Arrays.toString(buhBook));
        getTotalSpending(buhBook);          // task1
        printMinMaxSpending(buhBook);       // task2
        averageSpending(buhBook);           // task3
        task4();
    }

    private static int[] generateBuhBook() {
        Random rnd = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static long getTotalSpending(int[] arr) {
        //int[] arr = generateBuhBook();
        //System.out.println(Arrays.toString(arr));
        long totalSpending = 0;
        for (int monthCost : arr) {
            totalSpending += monthCost;
        }
        System.out.println("Сумма трат за месяц составила " + totalSpending + " рублей");
        return totalSpending;
    }

    private static void printMinMaxSpending(int[] arr) {
        //int[] arr = generateBuhBook();
        //System.out.println(Arrays.toString(arr));
        int minSpending = arr[0], maxSpending = arr[0];
        for (int spending : arr) {
            if (spending > maxSpending) {
                maxSpending = spending;
            }
            if (spending < minSpending) {
                minSpending = spending;
            }
        }
        System.out.print("Минимальная сумма трат за день составила " + minSpending + " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей");
    }

    private static void averageSpending(int[] arr) {
        long totalSpending = getTotalSpending(arr);
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", (double)totalSpending / arr.length);
    }

    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char tmp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-1 - i];
            reverseFullName[reverseFullName.length-1 - i] = tmp;
        }
        for (char nameLetter : reverseFullName) {
            System.out.print(nameLetter);
        }
        System.out.println();
    }
}