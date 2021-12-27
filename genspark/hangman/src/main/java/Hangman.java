import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Hangman {

    public static String RetrieveDisplay(int tries) {
        String result = "";
        String oneDisplay = """
                        +---+
                            |
                            |
                            |
                           === """;
        String twoDisplay = """
                        +---+
                          O |
                            |
                            |
                           === """;
        String threeDisplay = """
                        +---+
                          O |
                          | |
                            |
                           === """;
        String fourDisplay = """
                        +---+
                          O |
                          | |
                          ^ |
                           === """;

        switch(tries) {
            case 1:
                result = threeDisplay;
                System.out.println(threeDisplay);
                break;
            case 2:
                result = twoDisplay;
                System.out.println(twoDisplay);
                break;
            case 3:
                result = oneDisplay;
                System.out.println(oneDisplay);
                break;
        }
        return result;
    }

    public static String ChosenLetter(char letter) {
        HashSet<Character> filter = new HashSet<>();
        filter.add(letter);
        if (filter.add(letter) == false) {
            return "You have already guessed that letter. Choose again";
        }
        else return null;
    }


    public static void main(String[] args) {

        //        set up for do you want to play again
        char again = 'y';
        while(again == 'y') {
            System.out.println("HANGMAN");
            String[] words = new String[] {"cat", "dog", "bat", "mice", "bird"};
            String randomWord = words[(int) (Math.random() * words.length)];
            System.out.println("Just for dev: " + randomWord);
            char[] letters = new char[randomWord.length()];
            ArrayList<Character> missedLetter = new ArrayList<>();
            boolean isGameOver = true;
            boolean win = false;

//            player gets three guesses
            for (int i = 0; i < letters.length; i++) {
                letters[i] = '_';
            }
            int tries = 3;
//            boolean win = false;

           while(tries > 0) {

                RetrieveDisplay(tries);

                String missed = "Missed Letters: ";
                 for ( char c : missedLetter) {
                   missed = missed + c;
                }
                System.out.println(missed);

                System.out.println("Guess a letter.");



                String inputGuess = "";
                try {
                    Scanner userInput = new Scanner(System.in);
                    String guess = userInput.nextLine();
                    inputGuess = String.valueOf(guess);
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }

                boolean guessCorrect = false;
                char letter = inputGuess.charAt(0);
                  for (int i = 0; i <randomWord.length(); i++) {
                      char l = randomWord.charAt(i);
                      if (l == letter) {
                          letters[i] = l;
                          guessCorrect = true;
                      }
                      if (l != letter ) {
                          ChosenLetter(letter);
                      }
                  }


                for (int i = 0; i < letters.length; i++) {
                    System.out.print(letters[i]);
                }

                if (!guessCorrect) {
                    tries--;
                    missedLetter.add(letter);
                }
               for (int i = 0; i < letters.length; i++) {
                   if (letters[i] == '_') {
                       isGameOver = false;
                   }
                   if (letters[i] != '_') {
                       isGameOver = true;
                   }
               }
               if (isGameOver) {
                   System.out.println("Yes! The secret word is " + randomWord + "! You have won!");
                   System.out.println("Do you want to play again? (yes or no)");
                   try {
                       Scanner restart = new Scanner(System.in);
                       again = restart.nextLine().charAt(0);
                   } catch(Exception e){
                       System.out.println(e.getMessage());
                   }
               }

//end of the tries loop
           }
           if(tries == 0) {
                again = 'n';
               System.out.println();
                System.out.println("Sorry. The word was " + "'" + randomWord + "'");
            }

           //               end of the "again" while loop bracket
        }

   }
}
