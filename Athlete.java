// Create a class Athlete with data members name, age, sport, and achievements. Create a subclass TeamMember with additional data members teamName, role, and matchesPlayed that inherits Athlete.

// a. Create a method playMatch() in TeamMember that increments matchesPlayed.
// b. Create a method displayAchievements() that prints the athlete's achievements.

import java.util.Scanner;

public class Athlete {
    String name;
    int age;
    String sport;
    String achievements[];// ['won first prize in Marathon', 'runner up in relay race']

    Scanner sc = new Scanner(System.in);

    Athlete() {
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Name of Sport : ");
        sport = sc.nextLine();
        System.out.println("Enter Age : ");
        age = sc.nextInt(); // 22\n -> 22 -> age, it keeps '\n' in case we want to store it
        System.out.println("Enter Number of Achievements : ");
        int numberOfAchievements = sc.nextInt(); // number input
        // 33 ( press Enter key ) [ 33\n ] -> "buffer"
        // 33 -> integer ( takes input )
        // \n -> string, but next we are taking string input
        // \n -> give to that string input
        // that is why we feel it skipped it

        // doing this to ensure that string input is not skipped after integer input
        sc.nextLine(); // is there anything in buffer [ '\n' ]
        achievements = new String[numberOfAchievements];
        System.out.println("Enter Achievements : ");
        for (int i = 0; i < achievements.length; i++) {
            achievements[i] = sc.nextLine();
        }
    }

    Athlete(String name, String sport, int age, String achievements[]) {
        this.name = name;
        this.sport = sport;
        this.age = age;
        this.achievements = achievements;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Sport : " + sport);
        System.out.println("Age : " + age);
        System.out.println("Achievements : ");
        for (int i = 0; i < achievements.length; i++) {
            System.out.print(achievements[i] + "\t");
        }
        System.out.println();
    }

}

class TeamMember extends Athlete {
    String teamName;
    int matchesPlayed;
    String role;

    Scanner sc = new Scanner(System.in);

    // default of parent and child
    TeamMember() {
        super();
        System.out.println("Enter team name : ");
        teamName = sc.nextLine();
        System.out.println("Enter number of matches played : ");
        matchesPlayed = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter role : ");
        role = sc.nextLine();
    }

    // parameterized of parent and child
    TeamMember(String name, String sport, int age, String achievements[], String teamName, int matchesPlayed,
            String role) {
        super(name, sport, age, achievements);
        this.teamName = teamName;
        this.matchesPlayed = matchesPlayed;
        this.role = role;
    }

    void playMatch() {
        matchesPlayed++;
        System.out.println("Matches played : " + matchesPlayed);
        // OR
        // this.matchesPlayed++;
        // OR
        // this.matchesPlayed = this.matchesPlayed + 1;
        // OR
        // matchesPlayed = matchesPlayed + 1;
    }

    void displayAchievements() {
        // prints all achievements
        for (int i = 0; i < achievements.length; i++) {
            System.out.print(achievements[i] + "\t");
        }
    }

    void display() {
        super.display(); // print for parent everything
        System.out.println("Team Name : " + teamName);
        System.out.println("Matches played : " + matchesPlayed);
        System.out.println("Role : " + role);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TeamMember teamMemberArr[];
        System.out.println("Enter number of members : ");
        int members = sc.nextInt();
        teamMemberArr = new TeamMember[members];

        for (int i = 0; i < teamMemberArr.length; i++) {
            teamMemberArr[i] = new TeamMember();
        }

        for (int i = 0; i < teamMemberArr.length; i++) {
            teamMemberArr[i].display();
        }

        sc.close();
    }

}
