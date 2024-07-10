import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // to create 1D array ->
        // int arr[] = new int[size];
        // OR
        // int arr[];
        // arr = new int[size];

        // for 2D arrays
        // int arr2[][] = new int[num_of_rows][num_of_cols];

        // take 2d array from user and print sum of all numbers?
        int rows, cols;
        System.out.println("Enter number of rows and cols");
        rows = sc.nextInt();
        cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements are : ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum : " + sum);
        sc.close();
    }
}

// questions on matrix -> gfg
// matrix addition
// matrix rotation
// matrix transpose