/*
 * rock paper scissors:
 * ask user how many wins to win the game does he want? Use switch-case: 3, 5, 10
 * we will have to run the game for that many rounds
 * we will have to ask the user in every round to select rock, paper or scissors
 * ( we can simply ask them to enter a character? r -> rock, p -> paper, s -> scissors )
 * we will have to make the computer also select a random option from the 3 ( rock, paper, scissors )
 * after each round, we have to either give the pc 1 point, player 1 point or draw ( no points )
 * in the end, we can show who won, and maybe give an option to play the game again
 */

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    static String name;
    
    static char randomChoice() {
        // this function will return a randomChoice by the computer, 'r', 'p' or 's'
        Random r = new Random();
        // generate the choice
        int randomNumber = r.nextInt(3); // 0, 1 or 2
        if(randomNumber == 0) return 'r';
        else if(randomNumber == 1) return 'p';
        else return 's';
    }
    
    static int getWinnerOfRound(char userChoice, char computerChoice) {
        // 1-> user, 2-> computer, 0->draw 
        if(userChoice == 'r') {
            if(computerChoice == 'r') {
                return 0;
            }
            else if (computerChoice == 'p') {
                return 2;
            } else {
                return 1;
            }
        } else if (userChoice == 'p') {
            if(computerChoice == 'r') {
                return 1;
            }
            else if (computerChoice == 'p') {
                return 0;
            } else {
                return 2;
            }
        } else {
            if(computerChoice == 'r') {
                return 2;
            }
            else if (computerChoice == 'p') {
                return 1;
            } else {
                return 0;
            }
        }
    }

    static String convertChoiceToWord(char choice) {
        if(choice == 'r') {
            return "Rock";
        }
        else if(choice == 'p') {
            return "Paper";
        }
        else {
            return "Scissors";
        }
    }

    static void playGame(int roundsToWinTheGame) {
        Scanner sc = new Scanner(System.in);
        int roundsWonByComputer = 0, roundsWonByUser = 0;
        char userChoice, computerChoice;
        // if roundsWonByComputer == roundsToWinTheGame or roundsWonByUser == roundsToWinTheGame, then game is over
        while(roundsWonByComputer != roundsToWinTheGame && roundsWonByUser != roundsToWinTheGame) {
            // code for each round
            System.out.println("'r' for rock");
            System.out.println("'p' for paper");
            System.out.println("'s' for scissors");
            System.out.println("Enter your choice");
            userChoice = sc.next().charAt(0);
            switch (userChoice) {
                case 'r':
                case 'p':
                case 's':
                computerChoice = randomChoice();
                int whoWon = getWinnerOfRound(userChoice, computerChoice); // 1-> user, 2-> computer, 0->draw
                
                System.out.println("Computer chose : " + convertChoiceToWord(computerChoice));
                System.out.println(name + " Chose : " + convertChoiceToWord(userChoice));
               
                if(whoWon == 1) { // user won round
                    roundsWonByUser++;
                    System.out.println(name + " won the round");
                    System.out.println(name + " score : " + roundsWonByUser + " Computer score : " + roundsWonByComputer + "\n\n");
                } else if(whoWon == 2){ // computer won round
                    roundsWonByComputer++;
                    System.out.println("Computer won the round");
                    System.out.println(name + " score : " + roundsWonByUser + " Computer score : " + roundsWonByComputer + "\n\n");
                } else {
                    System.out.println("The round is a draw");
                    System.out.println(name + " score : " + roundsWonByUser + " Computer score : " + roundsWonByComputer + "\n\n");
                }
                break;
                default:
                System.out.println("Enter a valid choice please\n\n");
                break;
            }
        }
        // once it comes out, it means someone won the game
        // let;s see who won?
        if(roundsWonByComputer == roundsToWinTheGame) {
            System.out.println("The computer won the game");
        } else {
            System.out.println(name + " won the game");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roundsToWinTheGame = 0;
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("How many wins to win the game ? ");
        System.out.println("enter either 3, 5 or 10");     
        roundsToWinTheGame = sc.nextInt();
        switch(roundsToWinTheGame) {
            case 3:
            case 5:
            case 10:
            playGame(roundsToWinTheGame);
            break;
            default:
            System.out.println("Enter a valid choice");
            break;
        }
        sc.close();
    }
}
