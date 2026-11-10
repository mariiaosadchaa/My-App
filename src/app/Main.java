package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void printInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }
}

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("John", 30, "Інженер");
        Person p2 = new Person("Mary", 25, "Вчитель");
        Person p3 = new Person("Bob", 35, "Лікар");

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();

        System.out.println();

        Person alice = new Person("Alice", 28, "Архітектор");
        alice.printInfo();
        alice.setProfession("Дизайнер");
        System.out.println("(Після оновлення професії)");
        alice.printInfo();
    }
}