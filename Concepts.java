// types of inheritance in java
/*
 * Single ( we have been doing ) [ 1p 1c ]
 * Hierarchical [ grandparent, parent, child ]
 * Multiple inheritance ( I have told that this is not normally possible in Java
 * )
 * Hybrid
 * multi-level
 */

// final keyword in Java
/*
 * 
 */

// WAP to find area of a circle

import java.util.Scanner;

class Super { // default
    Super() {

    }

    void hello() {
        System.out.println("hello");
    }
}

class Concepts extends Super {

    Concepts() {

    }

    static final double pi = 22.0 / 7;

    static double area(double radius) {
        return (pi * radius * radius);
    }

    @Override
    void hello() {
        System.out.println("World");
    }

    public static void main(String[] args) {
        Concepts obj = new Concepts();

        obj.hello(); // world
    }

}

/*
 * Abstract classes [x]
 * Interfaces [x]
 * Multiple inheritance in java ( using interfaces ) [x]
 * Enhanced for loop [x]
 * Access specifiers ( public, private, protected, default ) [x]
 * Destructors [x]
 */