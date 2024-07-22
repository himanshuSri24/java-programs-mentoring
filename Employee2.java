// Create a class Person with data members personID, name, and age. Create a subclass Employee with additional data members employeeID, department, salary, and an array of Person objects representing the team members that the employee manages.

// a. Override the method displayDetails() in Employee to include employee-specific details and team members' details.
// b. Create a method addTeamMember(Person member) in Employee that updates the team members list.

import java.util.Scanner;

class Person {
    int age;
    String name;

    Scanner sc = new Scanner(System.in);

    Person() {
        System.out.println("Enter person details: ");
        System.out.println("Enter person name : ");
        name = sc.nextLine();
        System.out.println("Enter person age: ");
        age = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("The person details are : ");
        System.out.println("Person name : " + name);
        System.out.println("Person age : " + age);
    }
}

class Employee extends Person {
    int employeeID;
    String department;
    float salary;
    Person teamMembers[];
    int currNumOfTeamMembers, totalNumberOfTeamMembers;

    // int arr[] = new int[size];
    // Person arr[] = new Person[size];
    // OR
    // int arr[];
    // arr = new int[size];
    // Person arr[];
    // arr = new Person[size];

    Employee() {
        super();
        System.out.println("Enter employee details: ");
        System.out.println("Enter employee ID : ");
        employeeID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter department : ");
        department = sc.nextLine();
        System.out.println("Enter salary : ");
        salary = sc.nextFloat();
        System.out.println("Enter total number of team members : ");
        totalNumberOfTeamMembers = sc.nextInt();
        teamMembers = new Person[totalNumberOfTeamMembers];
        currNumOfTeamMembers = 0;
    }

    void addTeamMember(Person member) {
        if (currNumOfTeamMembers >= totalNumberOfTeamMembers) {
            System.out.println("Maximum number of team members added.");
            return;
        }
        teamMembers[currNumOfTeamMembers] = member;
        currNumOfTeamMembers++;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Employee id : " + employeeID);
        System.out.println("Employee department : " + department);
        System.out.println("Employee salary : " + salary);
        System.out.println("Employee team members: ");
        for (int i = 0; i < currNumOfTeamMembers; i++) {
            System.out.print(teamMembers[i].name + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Employee koushik = new Employee();
        System.out.println("Initial display ");
        koushik.displayDetails();
        // you know how to make it menu driven

        // to add a team member, I need to create a person object and pass it to
        // addTeamMember function
        for (int i = 0; i < 10; i++) {
            Person newPerson = new Employee();
            koushik.addTeamMember(newPerson);
        }

        System.out.println("After adding team member");
        koushik.displayDetails();
    }

}

/*
 * I created Employee named Koushik
 * I told your total number of team members is 10
 * What is your current number of team members? 0
 * when you want to add a team member
 * you call addTeamMember function
 * so, in the teamMembers array, it should add an element
 * where should it add? at what index?
 * 0
 * you add another member
 * where should it add it?
 * what index?
 * 1
 * then?
 * 2
 * and so on
 */