import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int a = 0;
    for(int i = 1; i <= 6; i++) {
        a += i;
        System.out.println( i + ") " + "Num is " + i + ", " + "sum is " + a);

    }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + a);

    }
}