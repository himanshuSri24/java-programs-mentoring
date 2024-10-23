/*
 * Write a program in Java that initializes an array of 5 elements and attempts to access an index out of bounds. Use exception handling to catch the ArrayIndexOutOfBoundsException and print an error message.
 * 
 *  Write a program in Java that attempts to open a file for reading. Use exception handling to catch the FileNotFoundException if the file does not exist and display a proper error message.
 * 
 * Write a program in Java that defines a method to calculate the square root of a number. If the number is negative, throw an IllegalArgumentException. Use a try-catch block in the main method to catch the exception and display an appropriate error message.
 * 
 * Write a program in Java that asks the user to input an email address. Throw a custom InvalidEmailException if the input doesn't contain an "@" symbol, and handle the exception by asking the user to enter a valid email.
 */

import java.util.Scanner;

public class EvenMoreExceptionPrograms {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an index to print the number at that index");
        int n = sc.nextInt();
        try {
            System.out.println("The element at index " + n + " is : " + arr[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds");
        } finally {
            sc.close();
        }
    }
}
