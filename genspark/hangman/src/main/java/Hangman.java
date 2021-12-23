import java.util.Scanner;

public class Hangman {


    public static void main(String[] args) {
//        sets up random word creation and sets char array to be checked against guess
        String[] words = new String[] {"cat", "dog", "bat", "mice", "bird"};
        String randomWord = words[(int) (Math.random() * words.length)];
        System.out.println("Just for dev: " + randomWord);
        char[] letters = new char[randomWord.length()];
//        set up for do you want to play again
        char again = 'y';
        
        while(again == 'y') {
            System.out.println("HANGMAN");
//            player gets three guesses
            for (int i = 0; i < letters.length; i++) {
                letters[i] = '_';
            }
            int tries = 3;
            System.out.println("Just for dev: " + tries);
            while(tries > 0) {
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
                         System.out.println(threeDisplay);
                         break;
                     case 2:
                         System.out.println(twoDisplay);
                         break;
                     case 3:
                         System.out.println(oneDisplay);
                         break;
                 }

                String missed = "Missed Letters:";
                System.out.println(missed);

                String newGuess = "Guess a letter.";
                System.out.println(newGuess);

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
                  }
                 if (!guessCorrect) {
                    tries--;
                }
                for (int i = 0; i < letters.length; i++) {
                    System.out.print(letters[i]);

                }
                 if(tries == 0) {
                     System.out.println(fourDisplay);

                 }





            }
        }
   }
}
