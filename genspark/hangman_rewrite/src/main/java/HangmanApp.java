import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class HangmanApp {
    static List<String> wordBank = List.of("cat", "dog", "bat", "mice", "bird");
    static int tries = 3;
    static String input = "";
    static String missedLetters = "";
    static String correctLetters = "";
    static char again = 'y';
    static int high = 0;

    public static String determineWord() {
        return wordBank.get(ThreadLocalRandom.current().nextInt(0, wordBank.size() - 1));
    }

    public static String userName() {
        System.out.println("Hello, welcome to HANGMAN! What is your name?");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void retrieveDisplay(int temp) throws IOException {

        try {
            List<String> one = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).toList();
            String displayOne = String.join("\n", one);
            List<String> two = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display2.text")).toList();
            String displayTwo = String.join("\n", two);
            List<String> three = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display3.text")).toList();
            String displayThree = String.join("\n", three);

            switch (temp) {
                case 1 -> System.out.print(displayThree);
                case 2 -> System.out.print(displayTwo);
                case 3 -> System.out.print(displayOne);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static String letterInput() {
        System.out.println("Guess a letter.");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        input += userInput;
        System.out.println("Your guess: " + userInput);
        return userInput;
    }

    public static void isCorrectLetter(String secretWord, String input) {
        if (!secretWord.contains(input)) {
            tries--;
            if (missedLetters.contains(input)) {
                System.out.println("You have already chosen that letter. Choose again.");
                missedLetters += input;
            }
        } else correctLetters += input;
    }

    public static String displayWord(String secretWord, String correctLetters) {
        String word = Arrays.stream(secretWord.split(""))
                .map(s -> {
                    if (correctLetters.contains(s)) {
                        System.out.println(s);
                        return s;
                    }
                    System.out.println(" ");
                    return "_";

                })
                .collect(Collectors.joining(" "));
        System.out.println(word);
        return word;
    }

    public static void outOfTries(String word, String name) {
        if (tries == 0) {
            again = 'n';
            System.out.println("Sorry, " + name + ", the word was " + word + ".");
        }
    }

    public static void success(String word, String name, int score, int high) {
        if (correctLetters.equals(word)) {
            again = 'n';
            System.out.println("Yes " + name + "! The secret word was " + word + ". You have won!");
            System.out.println(name + "'s Score: " + score);
            System.out.println(name + "'s High Score: " + high);
            System.out.println("Do you want to play again? (yes or no)");
            try {
                Scanner restart = new Scanner(System.in);
                again = restart.nextLine().charAt(0);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int points() {
        int score = tries * 100;
        return score;
    }

    public static int highScore(int points) {
        high = 0;
        if (points > high) {
            high = points;
        }
        return high;
    }


    public static void main(String[] args) throws IOException {
//        determineWord();
        String secretWord = determineWord();
        String name = userName();
        while (again == 'y') {
            retrieveDisplay(tries);
            System.out.println();
            System.out.println("Missed Letters: " + input);
//            letterInput();
            String nextLetter = letterInput();
            isCorrectLetter(secretWord, nextLetter);
            displayWord(secretWord, correctLetters);
            outOfTries(secretWord, name);
            int score = points();
            int high = highScore(score);
            success(secretWord, name,  score, high);
        }
    }
}
