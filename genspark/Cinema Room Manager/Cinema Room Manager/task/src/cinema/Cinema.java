package cinema;

import java.util.Scanner;

public class Cinema {

    public static int[] start() {
        int[] input = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        input[0] = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        input[1] = sc.nextInt();
        return input;
    }

    public static char[][] createArray(int rows, int seats) {
        char[][] state = new char[rows][seats];
        for (int i = 0; i <= state.length - 1; i++) {
            for (int j = 0; j <= state[i].length - 1; j++) {
                state[i][j] = 'S';
            }
        }
        return state;
    }

    public static void optionsMenu(int seats, int rows, char[][] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Show the seats \n" +
                "2. Buy a ticket \n" +
                "3. Statistics \n" +
                "0. Exit");
        switch (sc.nextInt()) {
            case 1:
                printArray(array);
                optionsMenu(seats, rows, array);
                break;
            case 2:
                chooseSeat(seats, rows, array);
                optionsMenu(seats, rows, array);
                break;
            case 3:
                calculations(rows, seats);
                optionsMenu(seats, rows, array);
            case 0:
                break;
            default:
                System.out.println("Please choose a number available in the menu.");
                optionsMenu(seats, rows, array);
        }
    }

    public static void printArray(char[][] state) {
        System.out.println("Cinema:");
        for (int i = 1; i <= state[1].length; i++) {
            System.out.print(" " + i);
        }
        int counter = 1;
        for (char[] row : state) {
            System.out.println();
            System.out.print(counter + " ");
            counter++;
            for (char c : row) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    static int counter = 0;
    static int revenue = 0;

    public static void chooseSeat(int seats, int rows, char[][] state) {
        System.out.println("Enter a row number:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        if (row > rows) {
            System.out.println("Wrong input!");
            System.out.println("Enter a row number:");
            row = sc.nextInt();
        }
        System.out.println("Enter a seat number in that row:");
        int seat = sc.nextInt();
        if (seat > seats) {
            System.out.println("Wrong input!");
            System.out.println("Enter a seat number in that row:");
            seat = sc.nextInt();
        }
        boolean available = true;
        if (state[row - 1][seat - 1] == 'B') {
            System.out.println("That ticket has already been purchased!");
            available = false;
            chooseSeat(seats, rows, state);
        } else {
            state[row - 1][seat - 1] = 'B';
        }
        if (available) {
            if (seats * rows <= 60 || row <= rows / 2) {
                System.out.println("Ticket price: $10");
                counter += 1;
                revenue += 10;
            } else {
                System.out.println("Ticket price: $8");
                counter += 1;
                revenue += 8;
            }
        }
    }

    public static void calculations(int rows, int seats) {
        int frontRows = rows / 2;
        int backRows = rows - frontRows;
        float occupancy = rows * seats;
        int total = 0;

        if (occupancy > 60) {
            total = frontRows * seats * 10;
            total += backRows * seats * 8;
        } else {
            total = (int) (occupancy * 10);
        }

        float counterPt = (float) counter;
        float percentage = counterPt / occupancy * 100;
        String percentageString = String.format("%3.2f%%", percentage);
        System.out.println("Number of purchased tickets: " + counter);
        System.out.println("Percentage: " + percentageString);
        System.out.println("Current Income: $" + revenue);
        System.out.println("Total income: $" + total);

    }

    public static void main(String[] args) {
        int[] input = start();
        int rows = input[0];
        int seats = input[1];
        char[][] array = createArray(rows, seats);
        optionsMenu(seats, rows, array);
    }
}









