// Question 9: Airline Reservation System
// Problem Statement:
// Create a class Passenger with data members passengerID, name, age, and passportNumber. Create a subclass FlightBooking with additional data members flightNumber, seatNumber, and bookingStatus that inherits Passenger.

// a. Override the method displayBookingDetails() to include flight booking-specific details.
// b. Create a method confirmBooking() in FlightBooking that updates bookingStatus to confirmed.

import java.util.Scanner;

class Passenger {
    String passengerID;
    String name;
    int age;
    long passportNumber;

    Scanner sc = new Scanner(System.in);

    Passenger() {
        System.out.println("Enter passenger ID : ");
        passengerID = sc.next(); // word, save '\n'
        sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Age  : ");
        age = sc.nextInt();
        System.out.println("Enter passport number : ");
        passportNumber = sc.nextLong();
    }

    void display() {
        System.out.println("Passenger ID : " + passengerID);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Passport number : " + passportNumber);
    }

    void displayBookingDetails() {
        display();
    }
}

// Create a subclass FlightBooking with additional data members flightNumber,
// seatNumber, and bookingStatus that inherits Passenger.

class FlightBooking extends Passenger {
    int flightNumber;
    int seatNumber;
    String bookingStatus;

    Scanner sc = new Scanner(System.in);

    FlightBooking() {
        System.out.println("Enter flight number : ");
        flightNumber = sc.nextInt();
        System.out.println("Enter seat number : ");
        seatNumber = sc.nextInt();
        bookingStatus = "not confirmed";
    }

    @Override
    void displayBookingDetails() {
        System.out.println("Booking details:");
        super.displayBookingDetails();
        System.out.println("Flight Number : " + flightNumber);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Booking status : " + bookingStatus);
    }

    void confirmBooking() {
        bookingStatus = "confirmed";
        System.out.println("The booking is confirmed.");
        displayBookingDetails();
    }

    public static void main(String[] args) {
        FlightBooking booking1 = new FlightBooking();
        booking1.displayBookingDetails();
        System.out.println();
        booking1.confirmBooking();
    }
}