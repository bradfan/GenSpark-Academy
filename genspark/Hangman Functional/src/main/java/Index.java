import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Index {

    public static void main(String[] args) throws IOException {
        Index index = new Index();
        index.userName();
        index.retrieveDisplayOne();
        index.retrieveDisplayTwo();
        index.retrieveDisplayThree();



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






//    end of CLASS bracket
}
