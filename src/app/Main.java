package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[15];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        System.out.println("Початковий вигляд масиву: " + Arrays.toString(numbers));
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
        System.out.println("Відсортований масив: " + Arrays.toString(numbers));
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");

        int target = sc.nextInt();
        int left = 0;
        int right = numbers.length - 1;
        int foundIndex = -1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (numbers[middle] == target) {
                foundIndex = middle;
                break;
            } else if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + foundIndex);
        } else {
            System.out.println("Числа " + target + " немає в масиві.");
        }
    }
}