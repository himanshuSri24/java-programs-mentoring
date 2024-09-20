import java.util.Scanner;

interface Principal {
    double getPrincipal();
}

interface Interest {
    double getInterest();
}

public class Loan implements Principal, Interest {
    double P, R;
    int T;

    public double getPrincipal() {
        return P;
    }

    public double getInterest() {
        return (P * R * T) / 100;
    }

    Loan(double principal, double rate, int time) {
        P = principal;
        R = rate;
        T = time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal, rate;
        int time;
        principal = sc.nextDouble();
        rate = sc.nextDouble();
        time = sc.nextInt();
        Loan obj = new Loan(principal, rate, time);
        double interest = obj.getInterest();
        System.out.println(interest);
        sc.close();
    }
}