/*
 * Exception Handling - Types of Exception - Control Flow in Exceptions - Use of
 * try, catch,
 * finally, throw, throws in Exception Handling - User defined exceptions.
 */

/*
 * What are errors?
 * What are exceptions?
 */

/*
 * Errors are abnormalities that occur in a program which occur due to
 * some mistake made by the programmer.
 * These are more serious in nature and need to be fixed
 * Errors are illegal / wrong actions taken by the programmer
 * OR it may be things external to the program which are not because of
 * us
 * for(int i = 0; i < 5; i --) {} // error.
 * System.out.printkn("Hello"); // error
 * num = sc.nextInt()
 * 
 * Errors are mainly of 3 types:
 * Syntax errors: basic syntax / grammatical issues
 * Logical errors: mod 0, div by 0 etc.
 * Compilation errors
 * Runtime errors
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class ErrorProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isNumber = false;
        int num = 0;
        do {
            try {
                System.out.println("Enter a number : ");
                num = sc.nextInt();
                isNumber = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid number." + e);
                // when we wanted integer input
                // it is done by buffer
                // user entered a string
                // string entered buffer
                // then it threw an error
                sc.nextLine();
            }
        } while (isNumber == false);
        System.out.println("The number is : " + num);
        sc.close();
    }
}

/*
 * In Java, we have something called
 * try catch finally block
 * try: we write code inside this where we think we might get an exception
 * catch: we write code here which we want to run if we get an exception
 * finally: we write code here which we want to run regardless of whether
 * we got an exception or not
 */