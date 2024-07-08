// Scanner class object ( an object of the Scanner class )
// the Scanner class is present inside java.util package

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        // how do I create the object of Scanner class?
        // in Java, to create object of a class
        // ClassName objectName = new ClassName();
        // datatype arrayName = new datatype[size];
        int n;
        Scanner sc = new Scanner(System.in);
        // what do I pass in the parameter? I pass System.in
        n = sc.nextInt();
        System.out.println("The value given is : " + n);
        // one more thing to do when using Scanner class object is to close it once the use 
        // is done

        sc.close();
    }
}

// to take input with Scanner class object:
/*
 * we have functions to use.
 * integer input -> nextInt();
 * string input -> next(); // one word
 * string input -> nextLine(); // entire line
 * float input -> nextFloat();
 * long input -> nextLong();
 * double input -> nextDouble();
 */