package app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(201) - 100;
        }

        System.out.println("Елементи масиву: " + Arrays.toString(arr));

        int negSum = 0;
        int even = 0;
        int odd = 0;
        int minIdx = 0;
        int maxIdx = 0;
        int firstNeg = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negSum += arr[i];
                if (firstNeg == -1) {
                    firstNeg = i;
                }
            }
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }

        System.out.println("Сума від'ємних чисел: " + negSum);
        System.out.println("Кількість парних чисел: " + even);
        System.out.println("Кількість непарних чисел: " + odd);
        System.out.println("Найменший елемент: " + arr[minIdx] + " (з індексом " + minIdx + ")");
        System.out.println("Найбільший елемент: " + arr[maxIdx] + " (з індексом " + maxIdx + ")");

        if (firstNeg == -1) {
            System.out.println("Від'ємних чисел у масиві немає");
        } else if (firstNeg == arr.length - 1) {
            System.out.println("Після першого від'ємного числа немає елементів");
        } else {
            int sum = 0;
            int count = 0;
            for (int i = firstNeg + 1; i < arr.length; i++) {
                sum += arr[i];
                count++;
            }
            double avg = (double) sum / count;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", avg);
        }
    }
}
