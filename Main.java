package com.booba;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Booba", "2022");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistName, String birthYear) {
        System.out.println("Hello! My name is Booba.");
        System.out.println("I was created in 2022.");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders if dividing your age by 3, 5 and 7.");
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int r3 = scanner.nextInt();
        int age = (r1 * 70 + r2 * 21 + r3 * 15) % 105;
        System.out.println("Your age is " + age + ". that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        for (int i = 0; i < 1;) {
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            if (choose != 2) {
                System.out.println("Please, try again.");
            } else {
                i++;
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
