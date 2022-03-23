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
    Hangman hangman = new Hangman();
    static List<String> wordBank = List.of("cat", "dog", "bat", "mice", "bird");
    int tries = 3;
    String wrongLetter = "";
    String rightLetter = "";

    public String determineWord() {
        return wordBank.get(ThreadLocalRandom.current().nextInt(0, wordBank.size()));
    }

    public String userName() {
        System.out.println("Hello, welcome to HANGMAN! What is your name?");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
//        hangman.setName(user);
        return user;
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

    public String letterInput() {
        System.out.println("Guess a letter.");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public void isCorrectLetter(String secretWord, String input) {
        if (!secretWord.contains(input)) {
            tries--;
            hangman.setTries(tries);
            if (hangman.getMissedLetters().contains(input)) {
                System.out.println("You have already chosen that letter. Choose again.");
            } else {
                wrongLetter += input;
                hangman.setMissedLetters(wrongLetter);
            }
        } else {
            rightLetter += input;
            hangman.setCorrectLetters(rightLetter);
            ;
        }
    }

    public void displayWord(String secretWord, String correctLetters) {
        String word = Arrays.stream(secretWord.split(""))
                .map(s -> {
                    if (hangman.getCorrectLetters().contains(s)) {
                        return s;
                    }
                    System.out.println(" ");
                    return "_";
                })
                .collect(Collectors.joining(" "));
        System.out.println(word);
    }

    public void outOfTries(String word, String name) {
        if (tries == 0) {
            hangman.setAgain('n');
            System.out.println("Sorry, " + name + ", the word was " + word.toUpperCase(Locale.ROOT) + ".");
        }
    }

    public void success(String word, String name, int score, int high) {
        if (hangman.getCorrectLetters().equals(word)) {
            System.out.println("Yes " + name + "! The secret word was " + word.toUpperCase(Locale.ROOT) + ". You have won!");
            System.out.println(name + "'s Score: " + score);
            System.out.println(name + "'s High Score: " + high);
            hangman.setWin(true);
//            hangman.setAgain('n');
        }
    }

    public void restart() {
        System.out.println("Do you want to play again? (yes or no)");
        Scanner sc = new Scanner(System.in);
        hangman.setAgain(sc.next().charAt(0));
        if (hangman.getAgain() == 'y') {
            hangman.setWin(false);
            tries = 3;
            hangman.setMissedLetters("");
            hangman.setCorrectLetters("");
        }
    }

    public int points() {
        return tries * 100;
    }

    public int highScore(int points) {
        if (points > hangman.getHigh()) {
            hangman.setHigh(points);
        }
        return hangman.getHigh();
    }

    public void playGame(String name) throws IOException {
        if (!hangman.isWin()) {
            String secretWord = determineWord();
            while (hangman.getAgain() == 'y') {
                retrieveDisplay(hangman.getTries());
                System.out.println();
                System.out.println("Missed Letters: " + hangman.getMissedLetters());
                String nextLetter = letterInput();
                System.out.println("Your guess: " + nextLetter);
                isCorrectLetter(secretWord, nextLetter);
                displayWord(secretWord, hangman.getCorrectLetters());
                outOfTries(secretWord, name);
                int score = points();
                int high = highScore(score);
                success(secretWord, name, score, high);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Hangman hangman = new Hangman();
        HangmanApp app = new HangmanApp();
        String name = app.userName();
        while (hangman.getAgain() == 'y') {
            app.playGame(name);
            app.restart();
        }
    }
}
