package app;

interface Shape {
    double getArea();
}

class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радіус має бути додатним");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Коло (r = " + radius + ")";
    }
}

class Triangle implements Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Сторони мають бути додатними");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Трикутник з такими сторонами не існує");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Трикутник (a = " + a + ", b = " + b + ", c = " + c + ")";
    }
}

class Square implements Shape {
    private final double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона має бути додатною");
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Квадрат (a = " + side + ")";
    }
}

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(2),
                new Triangle(3, 4, 5),
                new Square(4),
                new Circle(1.5),
                new Square(2.5)
        };

        for (Shape shape : shapes) {
            System.out.printf("%s -> площа: %.2f%n", shape, shape.getArea());
        }

        printTotalArea(shapes);
    }

    public static void printTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        System.out.printf("Сумарна площа всіх фігур: %.2f%n", total);
    }
}