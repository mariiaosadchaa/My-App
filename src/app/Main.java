package app;
public class Main {
    public static void main(String[] args) {
        String product = "smartphone";
        double total = 12153.41;
        int days = 5;

        System.out.printf("Product No 1: %s,%n", product);
        System.out.printf("total sales for %d days is EUR %.2f,%n", days, total);
        System.out.printf("sales by day is EUR %.2f.%n", total / days);

        product = "laptop";
        total = 10486.85;
        days = 7;

        System.out.printf("Product No 2: %s,%n", product);
        System.out.printf("total sales for %d days is EUR %.2f,%n", days, total);
        System.out.printf("sales by day is EUR %.2f.%n", total / days);

    }
}