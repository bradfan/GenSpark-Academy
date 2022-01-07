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
    String missedLetter;
    String guessedLetter;
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

    public String getGuessedLetter() {
        return guessedLetter;
    }

    public void setGuessedLetter(String guessedLetter) {
        this.guessedLetter = guessedLetter;
    }

    public String getCorrectLetters() {
        return correctLetters;
    }

    public void setCorrectLetters(String correctLetters) {
        this.correctLetters = correctLetters;
    }

    public static void main(String[] args) throws IOException {
        Index index = new Index();
        index.userName();
        index.setSecretWord(index.determineWord());
        index.letterInput();

        index.displayWord(index.getSecretWord(), index.correctLetters);

        int tries = index.getTries();
        char again = 'y';
//        while the game is running
//        while (again == 'y' && tries > 0) {
//
//            // end of WHILE LOOP bracket.
//        }
        index.retrieveDisplay();
        System.out.println();


        //  end of MAIN bracket
    }

    //    methods below here
//    default constructor
    public Index() {

    }

    //    parameterized constructor
    public Index(int tries, String secretWord, String guessedLetter, String missedLetter, String correctLetters) {
        this.tries = tries;
        this.guessedLetter = guessedLetter;
        this.missedLetter = missedLetter;
        this.correctLetters = correctLetters;
        this.secretWord = secretWord;
    }

    public void retrieveDisplay() throws IOException {
        String result = null;
        try {
            String displayOne = null;
            List<String> one = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
            displayOne = one.stream().collect(Collectors.joining("\n"));

            String displayTwo = null;
            List<String> two = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
            displayTwo = two.stream().collect(Collectors.joining("\n"));

            String displayThree = null;
            List<String> three = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
            displayThree = three.stream().collect(Collectors.joining("\n"));

            switch (tries) {
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

    public String letterInput() {
        System.out.println("Guess a letter.");
        System.out.println();
        String input = "";
        String guessedLetter = null;
        try {
            Scanner letterInput = new Scanner(System.in);
            input = letterInput.nextLine();
            guessedLetter = String.valueOf(input);
        } catch (Exception e) {
            e.getMessage();
        }
        return guessedLetter;
    }

    public String determineWord() {
        return wordBank.get(ThreadLocalRandom.current().nextInt(0, wordBank.size() - 1));
    }

    public boolean isCorrectLetter(String secretWord, String guessedLetter) {
// if secretWord does not contain guessedLetter add to "missedLetter" string and decrement tries
        if (!secretWord.contains(guessedLetter)) {
            tries--;
            missedLetter += guessedLetter;
        } else correctLetters += guessedLetter;
        return secretWord.contains(guessedLetter);
    }

    public String missedLetterDisplay(String missedLetter) {
        return "Missed Letters: " + missedLetter;
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
        return Arrays.stream(secretWord.split(""))
                      .map(s -> {
                    if (correctLetters.contains(s)) {
                        return s;
                    }
                    return "_";
                    })
                      .collect(Collectors.joining(" "));

    }


//    end of CLASS bracket
}
