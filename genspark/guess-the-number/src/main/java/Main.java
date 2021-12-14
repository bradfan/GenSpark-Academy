import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Guess the number");
        char again = 'y';
        while(again == 'y') {
            String name = "";
            public static String getName() {
                try {
                    System.out.println("Hello! What is your name?");
                    Scanner nameInput = new Scanner(System.in);
                    name = nameInput.nextLine();
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }

            }

            String text = """
                    Take a guess.""";
            System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");
            System.out.println(text);
            double random = Math.floor((Math.random() * 20) + 1);
            int tries = 0;
            boolean win = false;
            while (!win) {
                try {
                    Scanner getInput = new Scanner(System.in);
                    int input = getInput.nextInt();
                    tries++;
                    if (input > random) {
                        System.out.println("""
                          Your guess is too high."""
                                + text);
                    } else if (input < random) {
                        System.out.println("""
                          Your guess is too low."""
                                + text);
                    } if (input == random) {
                        win = true;
                        System.out.println("Good job, " + name + "! You guessed my number in " + tries + " guesses!\n\"Would you like to play again? (y or n)\"");
                        try {
                            Scanner restart = new Scanner(System.in);
                            again = restart.nextLine().charAt(0);
                        } catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
//        Original project 2
//        System.out.println("Guess the number");
//        char again = 'y';
//        while(again == 'y') {
//            System.out.println("Hello! What is your name?");
//            Scanner nameInput = new Scanner(System.in);
//            String name = nameInput.nextLine();
//
//            String text = """
//                    Take a guess.""";
//            System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");
//            System.out.println(text);
//            double random = Math.floor((Math.random() * 20) + 1);
//            int tries = 0;
//            boolean win = false;
//
//            while (!win) {
//                Scanner getInput = new Scanner(System.in);
//                int input = getInput.nextInt();
//                tries++;
//                if (input > random) {
//                    System.out.println("""
//                          Your guess is too high."""
//                          + text);
//                    } else if (input < random) {
//                    System.out.println("""
//                          Your guess is too low."""
//                         + text);
//                } if (input == random) {
//                    win = true;
//                    System.out.println("Good job, " + name + "! You guessed my number in " + tries + " guesses!");
//                    System.out.println("Would you like to play again? (y or n)");
//                    Scanner restart = new Scanner(System.in);
//                    again = restart.nextLine().charAt(0);
//                }
//            }
//        }