import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class worksheet {
    public void retrieveDisplay() throws IOException {
        try{
            File file1 = new File("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display1.text");
            Scanner scanFile1 = new Scanner(file1);
            while(scanFile1.hasNextLine()) {System.out.println(scanFile1.nextLine());}

            File file2 = new File("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display2.text");
            Scanner scanFile2 = new Scanner(file2);
            while(scanFile2.hasNextLine()) {System.out.println(scanFile2.nextLine());}

            File file3 = new File("C:\\GenSpark-Academy\\genspark\\Hangman Functional\\src\\main\\java\\hangman_display3.text");
            Scanner scanFile3 = new Scanner(file3);
            while(scanFile3.hasNextLine()) {System.out.println(scanFile3.nextLine());}
            }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }






}
