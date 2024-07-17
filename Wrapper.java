import java.util.Scanner;

public class Wrapper {
    static Scanner sc = new Scanner(System.in);

    void printHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        // Wrapper class ( concept, not actual name of class )
        // for datatypes like int, float, double -> we have classes as well
        // the classess have extra functionality, just like String
        // these are called wrapper classes
        // Integer -> wrapper class of int
        // Float -> wrapper class of float
        // these are useful to convert variables of a datatype to an object
    }
}

class Random {
    public static void main(String[] args) {
        Wrapper obj = new Wrapper();
        obj.printHello();
    }
}