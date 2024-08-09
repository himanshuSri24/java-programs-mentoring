import java.io.IOException;
import java.util.Scanner;

public class Throws {

    static void func1() throws IOException {
        // assume I'm doing something
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (num2 == 0) {
            throw new IOException("num2 should be greater than 0");
        }
        int ans = num1 / num2;
        System.out.println("Answer : " + ans);
    }

    public static void main(String[] args) throws IOException {
        func1();
    }
}
