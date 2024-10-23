import java.util.*;

public class ListsAndMaps {
    public static void main(String[] args) {
        // Lists
        // ArrayList -> list which is like an array ( size is variable ) ( same as
        // vectors in C++ )
        List<String> arr = new ArrayList<>();

        // how to add things to the list?
        // .add()

        arr.add("Hello");
        arr.add("This");
        arr.add("Is");
        arr.add("Very");
        arr.add("Easy");

        // how to get elements?
        // .get(index)

        // System.out.println(arr.get(0));

        // how to print all
        for (String ele : arr) {
            System.out.println(ele);
        }

        // arr.remove("Very");
        arr.set(3, "Extremely");

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println(arr.contains("Hello"));
    }
}