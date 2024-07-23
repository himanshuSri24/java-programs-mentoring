import java.util.Scanner;

public class EnhancedForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String str = "Hello World!";
        // for-each loop
        /*
         * Syntax:
         * for(datatype var : arr/string/whatever) {
         * // body inside the loop
         * // THIS IS USED TO ACCESS ALL VALUES
         * // THIS IS USED WHEN WE DO NOT NEED THE INDEX VALUE
         * // IF WE WANT TO CHANGE ANY VALUE INSIDE ARRAY, WE CANNOT USE THIS
         * }
         */

        // I want to print all values in array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        for (int ele : arr) {
            System.out.print(ele + "\t");
        }
        System.out.println();

        // print all characters inside string
        for (char ch : str.toCharArray()) {
            System.out.print(ch + "\t");
        }
        System.out.println();
    }
}
