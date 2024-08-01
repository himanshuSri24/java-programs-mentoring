import java.util.Scanner;

public class ExceptionHandling {

    // input two numbers, and if second number is 0, ask again
    // input two numbers, if there's an exception for division by 0, ask again

    void prog1() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, ans = 0;
        boolean isError;
        do {
            isError = false;
            System.out.println("Enter num 1 :");
            num1 = sc.nextInt();
            System.out.println("Enter num 2 :");
            num2 = sc.nextInt();
            try {
                ans = num1 / num2;
                System.out.println("Answer : " + ans);
            } catch (ArithmeticException e) {
                isError = true;
                System.out.println("Cannot divide by 0. Try again.");
            }
        } while (isError == true);
        sc.close();
    }

    public static void main(String[] args) {
        ExceptionHandling eh = new ExceptionHandling();
        eh.prog1();
    }
}
