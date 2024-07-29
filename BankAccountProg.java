import java.util.Scanner;

// Bank Account Types:
// Create a class BankAccount with data members accountNumber, balance, and methods deposit() and withdraw(). Create subclasses SavingsAccount and CurrentAccount with additional methods and data members specific to each type of account.

class BankAccount {
    int accountNumber;
    double balance;
    Scanner sc = new Scanner(System.in);

    BankAccount() {
        System.out.println("Enter the account number:");
        accountNumber = sc.nextInt();
        System.out.println("Enter the balance:");
        balance = sc.nextDouble();
        sc.nextLine();
    }

    void deposit() {
        System.out.println("Enter the amount to deposit:");
        double amount = sc.nextDouble();
        balance = balance + amount;
        sc.nextLine();
    }

    void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        double amount = sc.nextDouble();
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
        sc.nextLine();
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount() {
        super();
        System.out.println("Enter the interest rate:");
        interestRate = sc.nextDouble();
        sc.nextLine();
    }

    void deposit() {
        super.deposit();
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount() {
        super();
        System.out.println("Enter the overdraft limit:");
        overdraftLimit = sc.nextDouble();
        sc.nextLine();
    }

    void withdraw() {
        super.withdraw();
        if (balance < 0) {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

public class BankAccountProg {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit();
        s.withdraw();
        CurrentAccount c = new CurrentAccount();
        c.deposit();
        c.withdraw();

    }
}