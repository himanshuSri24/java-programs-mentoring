import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 * A travel agency wants to organize a list of travelers based on their travel destinations. Define a class Traveler with private attributes for name, age, and destination. In the Main class, create a program to categorize travelers by destination and display each category along with the average age of travelers going to that destination.

Specifications:

The program should:

Accept n travelers' details, including name, age, and destination.
Group travelers by their destination.
Calculate the average age of travelers for each destination.
Class Traveler:

Attributes: name, age, and destination.
Constructor to initialize the attributes.
Main Program:

Read the input details for each traveler.
Group travelers by destination.
For each destination group, calculate and display the average age of travelers.
Display each destination's travelers in a formatted list with their names and ages, followed by the average age.
Use %-20s%-10s as the formatting string for displaying each traveler's name and age, and display double values with 1 decimal place.

Input Format:

The first line of input is an integer n, representing the number of travelers.
For each traveler, three lines of input follow:
The name of the traveler (a string).
The age of the traveler (an integer).
The destination of the traveler (a string).
Output Format: Display each destination group, listing travelers with their names and ages, followed by the average age for that group.
 */

class Traveler {
    private String name, destination;
    private int age;

    Traveler(String name, int age, String destination) {
        this.name = name;
        this.age = age;
        this.destination = destination;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setDestination(String destination) {
        this.destination = destination;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getDestination() {
        return destination;
    }

    static void printTraveller(Traveler t) {
        System.out.println("{ Name: " + t.name + " age: " + t.age + " destination: " + t.destination + "}");
    }
}

public class Hashmaps2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of travelers");
        HashMap<String, ArrayList<Traveler>> travelerMap = new HashMap<>();
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, age and destination: ");
            String name, destination;
            int age;

            name = sc.nextLine();
            age = sc.nextInt();
            sc.nextLine();
            destination = sc.nextLine();
            Traveler obj = new Traveler(name, age, destination);
            // we have the object
            // we want to put this in the arraylist which is a value in the map
            ArrayList<Traveler> tempArrayList = travelerMap.get(destination);
            if (tempArrayList != null) {
                tempArrayList.add(obj);
                travelerMap.put(destination, tempArrayList);
            } else {
                ArrayList<Traveler> newArrayList = new ArrayList<>();
                newArrayList.add(obj);
                travelerMap.put(destination, newArrayList);
            }
        }
        System.out.println("All values added.");
        for (String key : travelerMap.keySet()) {
            System.out.println("Destination: " + key);
            for (Traveler t : travelerMap.get(key)) {
                Traveler.printTraveller(t);
            }
        }
        sc.close();
    }
}
