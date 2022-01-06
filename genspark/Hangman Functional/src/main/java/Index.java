import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Index {

    public static void main(String[] args) throws IOException {
        Index index = new Index();
        index.userName();
        index.determineWord();
        int tries = 3;
        char again = 'y';
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
      public void retrieveDisplayOne() throws IOException{
         try{
             File file = new File("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text");
             Scanner scanFile = new Scanner(file);
             while(scanFile.hasNextLine()) {
                 System.out.println(scanFile.nextLine());
             }
         } catch(Exception e) {
             System.out.println(e.getMessage());
         }
    }
    public void retrieveDisplayTwo() throws IOException{
        try{
            File file = new File("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display2.text");
            Scanner scanFile = new Scanner(file);
            while(scanFile.hasNextLine()) {
                System.out.println(scanFile.nextLine());
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void retrieveDisplayThree() throws IOException{
        try{
            File file = new File("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display3.text");
            Scanner scanFile = new Scanner(file);
            while(scanFile.hasNextLine()) {
                System.out.println(scanFile.nextLine());
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
//    can I have each method return a String that looks like the original game???

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
