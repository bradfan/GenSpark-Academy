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
    int score;
    int high;
    String missedLetter = "Missed Letters: ";
    String input;
    String correctLetters = "";
    String secretWord;
    String name;
    char again;

    public char getAgain() {return again;}

    public void setAgain(char again) {this.again = again;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

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
        index.setTries(3);
        index.setSecretWord(index.determineWord());
        System.out.println("Just for dev: " + index.secretWord);
        index.userName();
//       boolean win = false;
        index.again = 'y';

        while (index.again == 'y') {
//        index.setTries(3);
//            index.setSecretWord(index.determineWord());
//            System.out.println("Just for dev: " + index.secretWord);
            index.retrieveDisplay(index.getTries());
            System.out.println();
            System.out.println(index.missedLetter);
            index.letterInput();
            index.isCorrectLetter(index.getSecretWord(), index.getInput());
            System.out.println("You can guess " + index.tries + " times.");
            index.displayWord(index.getSecretWord(), index.correctLetters);
            index.outOfTries();
            index.success();
            index.points(index.getTries());
            index.highScore();
//            // end of WHILE LOOP bracket.
        }
        //  end of MAIN bracket
    }

    //    default constructor
    public Index() {

    }
    //    parameterized constructor
    public Index(int tries, int score, int high, String secretWord, String input, String missedLetter, String correctLetters) {
        this.tries = tries;
        this.score = score;
        this.input = input;
        this.missedLetter = missedLetter;
        this.correctLetters = correctLetters;
        this.secretWord = secretWord;
        this.high = high;
        this.name = name;
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

    public void userName() {
//        String name = "";
        try {
            System.out.println("Hello, welcome to HANGMAN! What is your name?");
            Scanner nameInput = new Scanner(System.in);
            name = nameInput.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        setName(name);
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
            if (missedLetter.contains(input)) {
                System.out.println("You have already chosen that letter. Choose again.");
            }
            missedLetter += input;
            setMissedLetter(missedLetter);
        } else correctLetters += input;
        return secretWord.contains(input);
    }

    public String displayWord(String secretWord, String correctLetters) {
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

    public void outOfTries() {
        if (tries == 0) {
            again = 'n';
            System.out.println("Sorry, " + getName() +  ", the word was " + secretWord + ".");
        }
    }
    public void success() {
        if (correctLetters.equals(secretWord)) {
//            win = true;
            System.out.println("Yes " + getName() + "! The secret word was " + secretWord + ". You have won!");
            System.out.println(getName() + "'s Score: " + getScore());
            System.out.println(getName() + "'s High Score: " + getHigh());
            System.out.println("Do you want to play again? (yes or no)");
            try {
                Scanner restart = new Scanner(System.in);
                again = restart.nextLine().charAt(0);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void points(int proxy) {
        score = tries * 100;
        setScore(score);
    }

    public void highScore(){
        high = 0;
        if(score > high) {
            high = score;
        }
        setHigh(high);
    }


//    end of CLASS bracket
}
