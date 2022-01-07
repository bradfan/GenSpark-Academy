import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Index {
    static List<String> wordBank = List.of("cat", "dog", "bat", "mice", "bird");


    public static void main(String[] args) throws IOException {
        Index i = new Index();
        i.userName();
        i.determineWord();
        i.letterInput();

        int tries = 3;
        char again = 'y';
//        while the game is running
        while (again == 'y' && tries > 0) {
            i.retrieveDisplay(tries);
            System.out.println();


            // end of WHILE LOOP bracket.
        }
        //  end of MAIN bracket
    }

    //    methods below here
    public String retrieveDisplay(int tries) throws IOException {
        String result = null;
        try {
//        result = "";
            String displayOne = null;
            List<String> one = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
            displayOne = one.stream().collect(Collectors.joining("\n"));
            System.out.print(displayOne);
            System.out.println();
            String displayTwo = null;
            List<String> two = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
            displayTwo = two.stream().collect(Collectors.joining("\n"));
            System.out.print(displayTwo);
            System.out.println();
            String displayThree = null;
            List<String> three = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
            displayThree = three.stream().collect(Collectors.joining("\n"));
            System.out.print(displayThree);
            System.out.println();

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
        return result;
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
        try {
            Scanner letterInput = new Scanner(System.in);
            input = letterInput.nextLine();

        } catch (Exception e) {
            e.getMessage();
        }
        return input;
    }

    public String determineWord() {
        return wordBank.get(ThreadLocalRandom.current().nextInt(0, wordBank.size() - 1));
    }

    public boolean isCorrectLetter(String secretWord, String guessedLetter) {
        return secretWord.contains(guessedLetter);
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
