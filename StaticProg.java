public class StaticProg {
    void displayA() {
        System.out.println(" This is A");
    }
    void displayB() {
        System.out.println(" This is B");
    }
    void display() {
        displayA();
        displayB();
    }

    int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String args[]) {
        StaticProg sp = new StaticProg();
        sp.displayA();
        sp.displayB();
        sp.display();   
        System.out.println(sp.fibonacci(10));
        System.out.println(args[0]);
    }
}