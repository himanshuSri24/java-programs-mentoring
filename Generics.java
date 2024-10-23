class GenericFunction<T> {
    T val;

    GenericFunction(T val) {
        this.val = val;
    }

    public <T> void print() {
        System.out.println(val);
    }
}

public class Generics {

    static <T> void printArray(T arr[]) {
        for (T x : arr) {
            System.out.println(x);
        }
    }

    static <T, U> void printArrays(T arr[], U arr2[]) {
        for (T x : arr) {
            System.out.println(x.getClass() + " " + x);
        }
        System.out.println("\n\n\n");
        for (U x : arr2) {
            System.out.println(x.getClass() + " " + x);
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5 };
        String arr2[] = { "this", "is", "a", "string", "array" };
        // printArrays(arr, arr2);

        GenericFunction obj = new GenericFunction<String>("test");
        GenericFunction obj2 = new GenericFunction<Float>(1.3423);
        obj.print();
        obj2.print();
    }
}
