import java.util.Arrays;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectStorage0 {




    public static char[] printDisplay(int playerIndex) {
        char[] line = {'_', '_', '_', '_', '_', '_', '_', '_', '_'};
        for (char c : line) {
            line[playerIndex] = 'X';
        }
        String output = Arrays.toString(line).replace(",", "").replace("[", "").replace("]", "");
        System.out.println("Enter cells: " + output);
        return line;
    }

    public static char[][] printGameBoard() {
        char[][] gameBoard = {{'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'}};
        System.out.println("---------");
        for (char[] row : gameBoard) {
            System.out.print("| ");
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println(" |");
        }
        System.out.println("---------");
        return gameBoard;
    }

    public static int determinePlayerPosition(char[][] board) {
        boolean isValid = false;
        int playerPosition = 0;
        while (!isValid) {
            System.out.println("Please enter two digits, each being a 1, 2 or 3, to position your X: ");
            Scanner sc = new Scanner(System.in);
            String posString = sc.next();
            String colString = sc.next();
            int rowPos = 0;
            int columnPos = 0;

            while (!posString.matches("[0-9]+") && !colString.matches("[0-9]+")) {
                isValid = false;
                System.out.println("You should enter numbers!");
                posString = sc.next();
                colString = sc.next();
            }
            columnPos = Integer.parseInt(posString);
            rowPos = Integer.parseInt(posString);

            if (rowPos < 1 || rowPos > 3 || columnPos < 1 || columnPos > 3) {
                isValid = false;
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (board[rowPos - 1][columnPos - 1] != '_') {
                isValid = false;
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                isValid = true;
                board[rowPos - 1][columnPos - 1] = 'X';
                System.out.println("---------");
                for (char[] row : board) {
                    System.out.print("| ");
                    for (char c : row) {
                        System.out.print(c);
                    }
                    System.out.println(" |");
                }
                System.out.println("---------");
            }
            if (rowPos - 1 == 0 && columnPos - 1 == 0) {
                playerPosition = 0;
            }
            if (rowPos - 1 == 0 && columnPos - 1 == 1) {
                playerPosition = 1;
            }
            if (rowPos - 1 == 0 && columnPos - 1 == 2) {
                playerPosition = 2;
            }
            if (rowPos - 1 == 1 && columnPos - 1 == 0) {
                playerPosition = 3;
            }
            if (rowPos - 1 == 1 && columnPos - 1 == 1) {
                playerPosition = 4;
            }
            if (rowPos - 1 == 1 && columnPos - 1 == 2) {
                playerPosition = 5;
            }
            if (rowPos - 1 == 2 && columnPos - 1 == 0) {
                playerPosition = 6;
            }
            if (rowPos - 1 == 2 && columnPos - 1 == 1) {
                playerPosition = 7;
            }
            if (rowPos - 1 == 2 && columnPos - 1 == 2) {
                playerPosition = 8;
            }

        }
        return playerPosition;
    }

    public static void main(String[] args) {
        // write your code here
        printDisplay(determinePlayerPosition(printGameBoard()));
        printGameBoard();
        determinePlayerPosition(printGameBoard());

    }


    boolean winner = false;
    boolean impossible = false;
    int index = 0;
    int counter = 0;
    int ptsX = 0;
    int ptsO = 0;


//        for (int r = 0; r < 3; r++) {
//            for (int c = 0; c < 3; c++) {
//                board[r][c] = input.charAt(counter++);
//            }
//        }
//
//        int countX = 0;
//        int countO = 0;
//
//        for (int i = 0; i <= input.length() - 1; i++) {
//            if (input.charAt(i) == 'X') {
//                countX += 1;
//            }
//            if (input.charAt(i) == 'O') {
//                countO += 1;
//            }
//        }
//
//        if (countX >= countO + 2) {
//            impossible = true;
//            System.out.println("Impossible");
//        }
//        if (countO >= countX + 2) {
//            impossible = true;
//            System.out.println("Impossible");
//        }
//
//        if (!impossible) {
//            if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
//                ptsX += 1;
////                diagonal
//            }
//
//            if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
//                ptsX += 1;
////                diagonal
//            }
//
//            if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
//                ptsX += 1;
////                first row
//            }
//
//            if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
//                ptsX += 1;
////                second row
//            }
//
//            if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
//                ptsX += 1;
////                third row
//            }
//
//            if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
//                ptsX += 1;
////                first column
//            }
//
//            if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
//                ptsX += 1;
////                second column
//            }
//
//            if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
//                ptsX += 1;
////                third column
//            }
//
//            if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == '0') {
//                ptsX += 1;
////                diagonal
//            }
//
//            if (board[0][0] == '0' && board[1][1] == '0' && board[2][2] == '0') {
//                ptsX += 1;
////                diagonal
//            }
//
//            if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
//                ptsO += 1;
////                first row
//            }
//
//            if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
//                ptsO += 1;
////                second row
//            }
//
//            if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
//                ptsO += 1;
////                third row
//            }
//
//            if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
//                ptsO += 1;
////                first column
//            }
//
//            if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
//                ptsO += 1;
////                second column
//            }
//
//            if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
//                ptsO += 1;
////                third column
//            }
//
//        }
//        if (ptsX > 0 && ptsO > 0) {
//            impossible = true;
//            System.out.println("Impossible");
//        } else if (ptsX > 0) {
//            winner = true;
//            System.out.println("X wins");
//        } else if (ptsO > 0) {
//            winner = true;
//            System.out.println("O wins");
//        }
//        if (input.length() == 9 && !input.contains("_") && !winner && !impossible) {
//            System.out.println("Draw");
//        }
//        if (input.length() == 9 && input.contains("_") && !winner && !impossible) {
//            System.out.println("Game not finished");
//        }


}
