import com.sun.jdi.CharValue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Index {
    static List<String> wordBank = List.of("cat", "dog", "bat", "mice", "bird");
    int tries = 3;
    String missedLetter = "Missed Letters: ";
    String input;
    String correctLetters = "";
    String secretWord;

    public String getSecretWord() {
        return secretWord;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public String getMissedLetter() {
        return missedLetter;
    }

    public void setMissedLetter(String missedLetter) {
        this.missedLetter = missedLetter;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getCorrectLetters() {
        return correctLetters;
    }

    public void setCorrectLetters(String correctLetters) {
        this.correctLetters = correctLetters;
    }

    public static void main(String[] args) throws IOException {
        Index index = new Index();
//       index.setTries(3);
        index.userName();
//       boolean win = false;
        char again = 'y';
//        while the game is running
        while (again == 'y') {
        index.setTries(3);
        index.setSecretWord(index.determineWord());
        System.out.println(index.secretWord);
        index.retrieveDisplay(index.getTries());
        System.out.println();
        System.out.println(index.missedLetter);
        index.letterInput();
        index.isCorrectLetter(index.getSecretWord(), index.getInput());
        System.out.println("You can guess " + index.tries + " times.");
        index.displayWord(index.getSecretWord(), index.correctLetters);
        if(index.tries == 0) {
            again = 'n';
            System.out.println("Sorry. The word was " + index.secretWord + ".");
        }
        if(index.correctLetters.equals(index.secretWord)) {
//            win = true;
            System.out.println("Yes! The secret word was " + index.secretWord + " You have won!");
            System.out.println("Do you want to play again? (yes or no)");
            try {
                Scanner restart = new Scanner(System.in);
                again = restart.nextLine().charAt(0);
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
//            // end of WHILE LOOP bracket.
        }
        //  end of MAIN bracket
      }

    //    methods below here

//    default constructor
    public Index() {

    }

    //    parameterized constructor
    public Index(int tries, String secretWord, String input, String missedLetter, String correctLetters) {
        this.tries = tries;
        this.input = input;
        this.missedLetter = missedLetter;
        this.correctLetters = correctLetters;
        this.secretWord = secretWord;
    }

    public void retrieveDisplay(int temp) throws IOException {
        String result = null;
        try {
            String displayOne = null;
            List<String> one = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
            displayOne = one.stream().collect(Collectors.joining("\n"));

            String displayTwo = null;
            List<String> two = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display2.text")).collect(Collectors.toList());
            displayTwo = two.stream().collect(Collectors.joining("\n"));

            String displayThree = null;
            List<String> three = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display3.text")).collect(Collectors.toList());
            displayThree = three.stream().collect(Collectors.joining("\n"));

            switch (temp) {
                case 1:
                    result = displayThree;
                    System.out.print(result);
                    break;
                case 2:
                    result = displayTwo;
                    System.out.print(result);
                    break;
                case 3:
                    result = displayOne;
                    System.out.print(result);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String userName() {
        String name = "";
        try {
            System.out.println("Hello, welcome to HANGMAN! What is your name?");
            Scanner nameInput = new Scanner(System.in);
            name = nameInput.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return name;
    }

    public void letterInput() {
        System.out.println("Guess a letter.");
        System.out.println();
        String input = "";

        try {
            Scanner letterInput = new Scanner(System.in);
            input = letterInput.nextLine();
            setInput(input);
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("Your guess: " + input);
    }

    public String determineWord() {
        return wordBank.get(ThreadLocalRandom.current().nextInt(0, wordBank.size() - 1));
    }

    public boolean isCorrectLetter(String secretWord, String input) {
// if secretWord does not contain guessedLetter add to "missedLetter" string and decrement tries
//        System.out.println("for dev, NULL? " + input);
        if (!secretWord.contains(input)) {
            tries--;
            setTries(tries);
            missedLetter += input;
            setMissedLetter(missedLetter);
            if(missedLetter.contains(input)){
                System.out.println("You have already chosen that letter. Choose again.");
                missedLetter.replace(input, "");
            }
        } else correctLetters += input;
        return secretWord.contains(input);
    }

    public String displayBoard(int pos) {
        return switch (pos) {
            case 1 -> """
                    +---+
                        |
                        |
                        |
                       ===
                    """;
            case 2 -> """
                    +---+
                      0 |
                        |
                        |
                       ===
                    """;
            case 3 -> """
                    +---+
                      0 |
                      | |
                        |
                       ===
                    """;

            default -> throw new IllegalStateException(pos + "Is out of bounds.");
        };
    }

    public String displayWord(String secretWord, String correctLetters) {
       String word =  Arrays.stream(secretWord.split(""))
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


//    end of CLASS bracket
}
