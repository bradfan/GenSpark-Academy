import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class HangmanApp {
    static List<String> wordBank = List.of("cat", "dog", "bat", "mice", "bird");
    static String name = "";
    static int tries = 3;
    static String input = "";
    static String missedLetters = "";

    public static String determineWord() {
        return wordBank.get(ThreadLocalRandom.current().nextInt(0, wordBank.size() - 1));
    }

    public static void userName() {
        System.out.println("Hello, welcome to HANGMAN! What is your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
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
                case 1 ->
                        System.out.print(displayThree);
                case 2 ->
                        System.out.print(displayTwo);
                case 3 ->
                        System.out.print(displayOne);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void letterInput() {
        System.out.println("Guess a letter.");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        input += userInput;
        System.out.println("Your guess: " + userInput);
    }


    public static void main(String[] args) throws IOException {
        determineWord();
        userName();
        retrieveDisplay(tries);
        System.out.println("Missed Letters: " + input);
        letterInput();


    }
}
