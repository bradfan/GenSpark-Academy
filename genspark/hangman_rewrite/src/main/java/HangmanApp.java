import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class HangmanApp {
    static List<String> wordBank = List.of("cat", "dog", "bat", "mice", "bird");
    private static int tries = 3;
    private static int high = 0;
    private static String missedLetters = "";
    private static String correctLetters = "";
    private static char again = 'y';
    private static boolean win = false;

    public static String determineWord() {
        return wordBank.get(ThreadLocalRandom.current().nextInt(0, wordBank.size()));
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
        return sc.next();
    }

    public static void isCorrectLetter(String secretWord, String input) {
        if (!secretWord.contains(input)) {
            tries--;
            if (missedLetters.contains(input)) {
                System.out.println("You have already chosen that letter. Choose again.");
            } else {
                missedLetters += input;
            }
        } else {
            correctLetters += input;
        }
    }

    public static void displayWord(String secretWord, String correctLetters) {
        String word = Arrays.stream(secretWord.split(""))
                .map(s -> {
                    if (correctLetters.contains(s)) {
                        return s;
                    }
                    System.out.println(" ");
                    return "_";
                })
                .collect(Collectors.joining(" "));
        System.out.println(word);
    }

    public static void outOfTries(String word, String name) {
        if (tries == 0) {
            again = 'n';
            System.out.println("Sorry, " + name + ", the word was " + word.toUpperCase(Locale.ROOT) + ".");
        }
    }

    public static void success(String word, String name, int score, int high) {
        if (correctLetters.length() == word.length()) {
            System.out.println("Yes " + name + "! The secret word was " + word.toUpperCase(Locale.ROOT) + ". You have won!");
            System.out.println(name + "'s Score: " + score);
            System.out.println(name + "'s High Score: " + high);
            win = true;
            again = 'n';
        }
    }

    public static void restart() {
        System.out.println("Do you want to play again? (yes or no)");
        Scanner sc = new Scanner(System.in);
        again = sc.next().charAt(0);
        if (again == 'y') {
            win = false;
            tries = 3;
            missedLetters = "";
            correctLetters = "";
        }
    }

    public static int points() {
        return tries * 100;
    }

    public static int highScore(int points) {
        if (points > high) {
            high = points;
        }
        return high;
    }

    public static void playGame(String name) throws IOException {
        if (!win) {
            String secretWord = determineWord();
            while (again == 'y') {
                retrieveDisplay(tries);
                System.out.println();
                System.out.println("Missed Letters: " + missedLetters);
                String nextLetter = letterInput();
                System.out.println("Your guess: " + nextLetter);
                isCorrectLetter(secretWord, nextLetter);
                displayWord(secretWord, correctLetters);
                outOfTries(secretWord, name);
                int score = points();
                int high = highScore(score);
                success(secretWord, name, score, high);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String name = userName();
        while (again == 'y') {
            playGame(name);
            restart();
        }
    }
}
