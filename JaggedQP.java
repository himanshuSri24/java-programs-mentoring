import java.util.Scanner;

public class JaggedQP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jagged[][];
        jagged = new int[4][];
        int numOfStudentsInCourse[] = new int[4];
        // numOfStudentsInCourse[0] -> n0
        // numOfStudentsInCourse[1] -> n1
        // numOfStudentsInCourse[2] -> n2
        // numOfStudentsInCourse[3] -> n3
        System.out.println("Enter number of students : ");
        for (int i = 0; i < numOfStudentsInCourse.length; i++) {
            System.out.println("Course " + (i + 1));
            numOfStudentsInCourse[i] = sc.nextInt();
            // based on numOfStudentsInCourse[i] we get number of columns. we take this
            // number of columns and set it to jagged array.
        }

        for (int i = 0; i < jagged.length; i++) {
            int cols = (int) Math.ceil(numOfStudentsInCourse[i] / 70.0);
            jagged[i] = new int[cols];
        }

        for (int i = 0; i < jagged.length; i++) {
            int val = numOfStudentsInCourse[i]; // 105
            for (int j = 0; j < jagged[i].length; j++) {
                if (val > 70) {
                    jagged[i][j] = 70;
                    val -= 70;
                } else {
                    jagged[i][j] = val;
                }
            }
        }

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
 * The total number of students registered for four different courses are nl,
 * n2, n3 and n4.
 * The maximum strength of a class room slot is 70. Create a jagged array such
 * that each row of the array stores the strength of each slot of a course as
 * its column
 * value, based on the number of class rooms required for a course as per its
 * registered count.
 * 
 * For example 105, 225,65 and 210 are the number of students register for two
 * different courses, The Jagged array slot [][] stores the content as
 * (10M)
 */