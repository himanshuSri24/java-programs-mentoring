import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][];
        int rows;

        // how many columns do I want in each row?
        // row 0 -> 4 cols
        // row 1 -> 2 cols
        // row 2 -> 5 cols
        // row 3 -> 2 cols
        // arr[0] = new int[4];
        // arr[1] = new int[2];
        // arr[2] = new int[5];
        // arr[3] = new int[2];

        // ask user for how many columns in each row
        System.out.println("Enter number of rows : ");
        rows = sc.nextInt();
        arr = new int[rows][];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number of columns in row " + i);
            int cols = sc.nextInt();
            arr[i] = new int[cols];
        }

        // enter elements in array
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // print elements of array
        System.out.println("Array elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
 * What is a jagged array?
 * very simple concept
 * it means a multi-dimensional array ( 2D, 3D etc. ) where the number of
 * elements in each dimension are not neccessarily the same
 * 
 * Let's say I have a 2D array, and I don't have the same number of columns in *
 * each row. That is called a jagged array
 * 
 */

// arr = [
// [1, 2, 3, 4],
// [5, 6],
// [7, 8, 9, 10, 11],
// [12, 13]
// ]

// arr = [
// [_, _, _, _],
// [_, _],
// [_, _, _, _, _],
// [_, _]
// ]