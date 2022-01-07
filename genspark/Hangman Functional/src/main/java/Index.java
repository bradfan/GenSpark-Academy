import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Index {

    public static void main(String[] args) throws IOException {
        Index index = new Index();
        index.userName();
        index.determineWord();
        int tries = 3;
        char again = 'y';
//        while the game is running
        while(again == 'y' && tries > 0) {
            switch (tries) {
                case 1:
                    index.retrieveDisplayThree();
                    break;
                case 2:
                    index.retrieveDisplayTwo();
                    break;
                case 3:
                    index.retrieveDisplayOne();
                    break;
            }



//            end of WHILE LOOP bracket.
        }






//  end of MAIN bracket
    }
//    methods below here
      public String retrieveDisplayOne() throws IOException {
          String displayOne = null;
          try {
              List<String> one = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
              displayOne = one.stream().collect(Collectors.joining("\n"));
              System.out.print(displayOne);
              System.out.println();
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
          return displayOne;
      }
    public String retrieveDisplayTwo() throws IOException {
        String displayTwo = null;
        try {
            List<String> two = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
            displayTwo = two.stream().collect(Collectors.joining("\n"));
            System.out.print(displayTwo);
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return displayTwo;
    }
    public String retrieveDisplayThree() throws IOException {
        String displayThree = null;
        try {
            List<String> three = Files.lines(Paths.get("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text")).collect(Collectors.toList());
            displayThree = three.stream().collect(Collectors.joining("\n"));
            System.out.print(displayThree);
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return displayThree;
    }

    public String userName() {
          String name = "";
          try {
              System.out.println("Hello, welcome to HANGMAN! What is your name?");
              Scanner nameInput = new Scanner(System.in);
              name = nameInput.nextLine();
          } catch(Exception e) {
              System.out.println(e.getMessage());
          }
          return name;
      }
    public String determineWord() {
            String[] words = new String[]{"cat", "dog", "bat", "mice", "bird"};
            String randomWord = words[(int) (Math.random() * words.length)];
            System.out.println("Just for dev: " + randomWord);
            return randomWord;
    }




//    end of CLASS bracket
}
