package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Введіть ціле число: ");
        int number = scanner.nextInt();
        printSquare(number);

        double radius = 3.5;
        double height = 10.0;
        double volume = cylinderVolume(radius, height);
        System.out.println("\n2. Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("\n3. Масив чисел: " + Arrays.toString(numbers));
        System.out.println("  Сума всіх елементів масиву дорівнює " + arraySum(numbers) + ".");

        scanner.nextLine();
        System.out.print("\n4. Введіть рядок: ");
        String str = scanner.nextLine();
        System.out.println("  Рядок в зворотньому порядку: " + reverse(str));

        System.out.print("\n5. Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("  Введіть b: ");
        int b = scanner.nextInt();
        System.out.println("  Результат " + a + "^" + b + " дорівнює " + power(a, b) + ".");

        System.out.print("\n6. Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("  Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        printText(n, text);

        scanner.close();
    }
    public static void printSquare(int x) {
        System.out.println("  Квадрат числа " + x + " дорівнює " + (x * x) + ".");
    }
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
    public static long power(int a, int b) {
        long result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
    public static void printText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println("  " + text);
        }
    }
}