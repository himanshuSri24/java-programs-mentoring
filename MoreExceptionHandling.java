import java.util.InputMismatchException;
import java.util.Scanner;

public class MoreExceptionHandling {
    public static void main(String[] args) {
        // ask the user for input, if the user enters anything more than 10, throw an
        // exception
        Scanner sc = new Scanner(System.in);
        int num;
        try {
            num = sc.nextInt();
            if (num > 10) {
                throw new Exception("The number should not be greater than 10");
            }
            System.out.println("You entered : " + num);
        } catch (Exception e) {
            System.out.println("Invalid input : " + e);
        } finally {
            sc.close();
        }
    }
}

/*
 * throw, throws in Exception Handling
 */

/*
 * We have studied:
 * try catch block
 * finally block
 * saw different types of exceptions
 * exceptions vs errors
 * how to handle exceptions
 */