abstract class A {
    final double PI = 3.14; // final means constant

    A() {
        System.out.println("A's constructor");
    }

    void display() {
        System.out.println("display in A");
    }

    // I want this to be overridden compulsorily in the child classes
    // in C++
    // virtual void importantFunction() = 0;
    // in Java
    abstract void importantFunction();
}

// Only 1 public class is allowed in a file, it should have the same name as the
// file, and should contain the main function
public class AbstractProg extends A {
    AbstractProg() {
        super();
        System.out.println("AbstractProg's constructor");
    }

    void display() {
        super.display();
        System.out.println("display in AbstractProg");
    }

    @Override
    void importantFunction() {
        System.out.println("importantFunction in AbstractProg");
    }

    public static void main(String[] args) {
        AbstractProg obj = new AbstractProg();
        obj.display();
    }
}

// in C++, we had multiple inheritance
// it used to cause conflicts
// because of this, we used to have virtual inheritance using virtual functions
// and abstract classes

// in Java, we don't want this problem, but we also want the capabilities of
// multiple inheritance
// so, we have interfaces

// New terms: Abstract class, Interface

// abstract classes and interfaces are similar
// but there are some differences

// abstract class:
// 1. can have abstract methods
// 2. can have non-abstract methods
// 3. can have constructors
