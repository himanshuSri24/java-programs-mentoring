import java.util.Scanner;

public class TicTacToe {

    String player1Name;
    String player2Name;
    char board[][] = new char[3][3];
    boolean isPlayer1Turn = true;
    char gameWinner = ' ';
    Scanner sc = new Scanner(System.in);

    TicTacToe() {

    }

    void initialize() {
        System.out.println("Welcome to TicTacToe");
        System.out.println("Player 1: Enter your name");
        player1Name = sc.nextLine();
        System.out.println("Player 2: Enter your name");
        player2Name = sc.nextLine();
        gameWinner = ' ';
        // we will also initialize the board
        // instead of empty character, we will put a space in each block
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void displayBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
                if (j != 2) {
                    System.out.print(" | ");
                }
            }
            if (i != 2) {
                System.out.println("\n------------");
            } else {
                System.out.println();
            }
        }
    }

    char isEqual(char a, char b, char c) { // if all 3 values are the same, return the value, else return ' '
        if (a == b && b == c)
            return a;
        else
            return ' ';
    }

    boolean hasWinner() { // if any player won, return true and print who won, else return false
        // to check winner, we had to check if the same value is present in any column,
        // any row or any diagonal
        // arr[0][0] arr[0][1] arr[0][2]
        // arr[1][0] arr[1][1] arr[1][2]
        // arr[2][0] arr[2][1] arr[2][2]

        // if(isEqual(board[0][0], board[0][1], board[0][2]) ||
        // isEqual(board[0][0], board[0][1], board[0][2]) ||
        // isEqual(board[0][0], board[0][1], board[0][2]) ||
        // isEqual(board[0][0], board[0][1], board[0][2]) ||
        // isEqual(board[0][0], board[0][1], board[0][2]) ||
        // isEqual(board[0][0], board[0][1], board[0][2]) ||
        // isEqual(board[0][0], board[0][1], board[0][2]) ||
        // isEqual(board[0][0], board[0][1], board[0][2])) {
        // return true;
        // }

        // for rows:
        for (int i = 0; i < board.length; i++) {
            char winner = isEqual(board[i][0], board[i][1], board[i][2]); // 'x', 'o' or ' '
            if (winner == 'x' || winner == 'o') {
                gameWinner = winner;
                return true;
            }
        }
        // for cols:
        for (int i = 0; i < board.length; i++) {
            char winner = isEqual(board[0][i], board[1][i], board[2][i]);
            if (winner != ' ') {
                gameWinner = winner;
                return true;
            }
        }
        // for diag 1:
        char winner = isEqual(board[0][0], board[1][1], board[2][2]);
        if (winner != ' ') {
            gameWinner = winner;
            return true;
        }

        // for diag 2:
        winner = isEqual(board[0][2], board[1][1], board[2][0]);
        if (winner != ' ') {
            gameWinner = winner;
            return true;
        }

        return false;
    }

    void inputValue(int index, char symbolToPut) {
        // 1. convert index ( 1 - 9 ) to a row and column value
        // 2. if the place is empty, then enter the value
        // else repeat the entire input
        if (index < 1 || index > 9) {
            System.out.println("Invalid index. Please enter value between 1-9");
            playTurn();
            return;
        }
        int row = (index - 1) / 3;
        int col = (index - 1) % 3;

        if (board[row][col] != ' ') {
            System.out.println("Invalid index. This is already full. Please enter a valid index.");
            playTurn();
            return;
        }

        board[row][col] = symbolToPut;
        isPlayer1Turn = !isPlayer1Turn;
        // if(isPlayer1Turn == true) {
        // isPlayer1Turn = false;
        // } else {
        // isPlayer1Turn = true;
        // }
        System.out.println("---------------------------------------------");
    }

    void playTurn() {
        // String currentPlayer = isPlayer1Turn ? player1Name : player2Name;
        String currentPlayer;
        char symbolToPut;
        int indexInput = 0;
        if (isPlayer1Turn) {
            currentPlayer = player1Name;
            symbolToPut = 'x';
        } else {
            currentPlayer = player2Name;
            symbolToPut = 'o';
        }
        System.out.println("------------------------------------------------");
        System.out.println(currentPlayer + "'s turn: ");
        displayBoard();

        System.out.println("Enter number ( 1 - 9 ) where you want to put " + symbolToPut);
        indexInput = sc.nextInt();
        inputValue(indexInput, symbolToPut);
    }

    boolean isBoardFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    void startGame() {
        initialize();
        displayBoard();
        System.out.println("Starting the game");
        System.out.println("----------------------------------");
        // till when do we continue the game?
        // until we have a winner
        // until all the 9 places are full
        while (gameWinner == ' ' && isBoardFull() == false) {
            playTurn();
            hasWinner();
        }
        displayBoard();
        if (gameWinner == ' ') {
            System.out.println("Game was a draw.");
        } else {
            String winnerPlayer;
            if (gameWinner == 'x')
                winnerPlayer = player1Name;
            else
                winnerPlayer = player2Name;
            System.out.println(winnerPlayer + " won the game!!!");
        }
    }

    public static void main(String[] args) {
        TicTacToe obj = new TicTacToe();
        obj.startGame();
    }
}

// [0][0] | [0][1] | [0][2]
// ------------------------
// [1][0] | [1][1] | [1][2]
// ------------------------
// [2][0] | [2][1] | [2][2]

// ' ' | 'O' | ' '
// ---------------
// 'x' | 'x' | 'x'

// 1 | 2 | 3
// ----------
// 4 | 5 | 6
// ----------
// 7 | 8 | 9

// 5 -> (5-1)%3 -> 1

// 9 -> (9-1)%3 -> 2

// 7 -> (7-1)%3 -> 0