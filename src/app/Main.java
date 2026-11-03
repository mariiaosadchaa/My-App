package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
            }
        }
        System.out.println("Матриця 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int evenRowSum = 0;
        int oddRowSum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    evenRowSum += matrix[i][j];
                } else {
                    oddRowSum += matrix[i][j];
                }
            }
        }
        long evenColProduct = 1;
        long oddColProduct = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j % 2 == 0) {
                    evenColProduct *= matrix[i][j];
                } else {
                    oddColProduct *= matrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + evenRowSum);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + oddRowSum);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + evenColProduct);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + oddColProduct);
        System.out.println();

        boolean isMagic = true;
        int target = 0;
        for (int j = 0; j < 4; j++) {
            target += matrix[0][j];
        }
        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != target || colSum != target) {
                isMagic = false;
            }
        }
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < 4; i++) {
            diag1 += matrix[i][i];
            diag2 += matrix[i][3 - i];
        }
        if (diag1 != target || diag2 != target) {
            isMagic = false;
        }
        if (isMagic) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
}