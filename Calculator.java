// create a simple calculator program in Java

import java.util.Scanner;

public class Calculator {

    double sum(double a, double b) {
        return a + b;
    }

    double difference(double a, double b) {
        return a - b;
    }

    double product(double a, double b) {
        return a * b;
    }

    double quotient(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Before");
        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("After");
        System.out.println("Sum : " + obj.sum(a, b));
        System.out.println("Diff : " + obj.difference(a, b));
        System.out.println("Prod : " + obj.product(a, b));
        System.out.println("Quo : " + obj.quotient(a, b));
        System.out.println("End");
        sc.close();
    }
}
