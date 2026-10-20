import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть суму доходу: ");
        BigDecimal income = new BigDecimal(scanner.nextLine().trim().replace(",", "."));

        BigDecimal rate;

        if (income.compareTo(new BigDecimal("10000")) <= 0) {
            rate = new BigDecimal("0.025");
        } else if (income.compareTo(new BigDecimal("25000")) <= 0) {
            rate = new BigDecimal("0.043");
        } else {
            rate = new BigDecimal("0.067");
        }

        BigDecimal tax = income.multiply(rate).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сума податку: " + tax);
    }
}